import { useEffect, useState } from 'react';
import { over } from 'stompjs';
import SockJS from 'sockjs-client/dist/sockjs';
import { Button } from "@/components/ui/button";
import { CardHeader, CardContent, CardFooter, Card } from "@/components/ui/card";
import { AvatarImage, AvatarFallback, Avatar } from "@/components/ui/avatar";
import { Textarea } from "@/components/ui/textarea";

var stompClient = null;

const Chat = () => {
    const [privateChats, setPrivateChats] = useState({});
    const [userData, setUserData] = useState({
        senderId: '',
        receiverId: '',
        connected: false,
        message: ''
    });
    const [professionalName, setProfessionalName] = useState('');
    const [tab] = useState('');

    useEffect(() => {
        const name = localStorage.getItem('professionalName');
        const id = localStorage.getItem('professionalId');
        setProfessionalName(name);
        setUserData(prevUserData => ({ ...prevUserData, senderId: id }));
    }, []);

    useEffect(() => {
        console.log(userData);
    }, [userData]);

    const connect = () => {
        let Sock = new SockJS('http://localhost:8080/ws');
        stompClient = over(Sock);
        stompClient.connect({}, onConnected, onError);
    }

    const onConnected = () => {
        setUserData({ ...userData, "connected": true });
        stompClient.subscribe('/user/' + userData.senderId + '/private', onPrivateMessage);
        userJoin();
        connect(); 
    }

    const userJoin = () => {
        var chatMessage = {
            senderId: userData.senderId,
            status: "JOIN"
        };
        stompClient.send("/app/message", {}, JSON.stringify(chatMessage));
    }

    const onPrivateMessage = (payload) => {
        var payloadData = JSON.parse(payload.body);
        const senderId = payloadData.senderId;
        setPrivateChats(prevPrivateChats => ({
            ...prevPrivateChats,
            [senderId]: [...(prevPrivateChats[senderId] || []), payloadData]
        }));
    }

    const onError = (err) => {
        console.log(err);
    }

    const handleMessage = (event) => {
        const { value } = event.target;
        setUserData({ ...userData, "message": value });
    }

    const sendPrivateValue = () => {
        if (stompClient) {
            var chatMessage = {
                senderId: userData.senderId,
                receiverId: tab,
                message: userData.message,
                status: "MESSAGE"
            };
            if (userData.senderId !== tab) {
                setPrivateChats(prevPrivateChats => ({
                    ...prevPrivateChats,
                    [tab]: [...(prevPrivateChats[tab] || []), chatMessage]
                }));
            }
            stompClient.send("/app/private-message", {}, JSON.stringify(chatMessage));
            setUserData({ ...userData, "message": "" });
        }
    }

    return (
        <Card className="w-full max-w-lg flex flex-col"  style={{ maxHeight: '500px' }}> 
            <CardHeader className="flex flex-col p-6">
                <div className="flex items-center gap-4">
                    <h2 className="text-2xl font-bold">{professionalName}</h2>
                    <Button size="sm" variant="outline">
                        End chat
                    </Button>
                </div>
                <p className="text-sm leading-none text-gray-500 dark:text-gray-400">Chat with the professional</p>
            </CardHeader>
            <CardContent className="flex flex-col p-6 h-[400px]">
                <div className="grid gap-4">
                    {/* Render messages from professional */}
                    {privateChats[tab] && privateChats[tab].map((chat, index) => (
                        <div className="flex items-start gap-4" key={index}>
                            <Avatar className="w-8 h-8">
                                <AvatarImage alt="@shadcn" src="/placeholder-user.jpg" />
                                <AvatarFallback>AD</AvatarFallback>
                            </Avatar>
                            <div className="space-y-2">
                                <div className="flex items-center gap-2 text-sm">
                                    <span className="font-semibold">{chat.senderId}</span>
                                    <time className="text-xs text-gray-500 dark:text-gray-400">2:14 PM</time>
                                </div>
                                <div className="text-sm">{chat.message}</div>
                            </div>
                        </div>
                    ))}
                </div>
            </CardContent>
            <CardFooter className="p-4">
                <form className="flex w-full gap-4">
                    <Textarea className="flex-1 min-h-[40px] resize-none" placeholder="Type a message..." value={userData.message} onChange={handleMessage} />
                    <Button type="submit" onClick={sendPrivateValue}>Send</Button>
                </form>
            </CardFooter>
        </Card>
    )
}

export default Chat;
