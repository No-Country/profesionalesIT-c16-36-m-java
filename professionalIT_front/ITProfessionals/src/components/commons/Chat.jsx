import { Button } from "@/components/ui/button"
import { CardHeader, CardContent, CardFooter, Card } from "@/components/ui/card"
import { AvatarImage, AvatarFallback, Avatar } from "@/components/ui/avatar"
import { Textarea } from "@/components/ui/textarea"

export default function Chat() {
  return (
    <Card className="w-full max-w-lg flex flex-col">
      <CardHeader className="flex flex-col p-6">
        <div className="flex items-center gap-4">
          <h2 className="text-2xl font-bold">Professional Name</h2>
          <Button size="sm" variant="outline">
            End chat
          </Button>
        </div>
        <p className="text-sm leading-none text-gray-500 dark:text-gray-400">Chat with the professional</p>
      </CardHeader>
      <CardContent className="flex flex-col p-6 flex-1">
        <div className="grid gap-4">
          <div className="flex items-start gap-4 self-end">
            <div className="space-y-2 text-right">
              <div className="flex items-center gap-2 text-sm">
                <span className="font-semibold">You</span>
                <time className="text-xs text-gray-500 dark:text-gray-400">2:15 PM</time>
              </div>
              <div className="text-sm">Hi there! I came across your profile and was impressed by your skills and experience. Are you currently open to new opportunities?</div>
            </div>
            <Avatar className="w-8 h-8 order-first">
              <AvatarImage alt="@shadcn" src="/placeholder-user.jpg" />
              <AvatarFallback>AD</AvatarFallback>
            </Avatar>
          </div>
          <div className="flex items-start gap-4">
            <Avatar className="w-8 h-8">
              <AvatarImage alt="@shadcn" src="/placeholder-user.jpg" />
              <AvatarFallback>AD</AvatarFallback>
            </Avatar>
            <div className="space-y-2">
              <div className="flex items-center gap-2 text-sm">
                <span className="font-semibold">Alice</span>
                <time className="text-xs text-gray-500 dark:text-gray-400">2:14 PM</time>
              </div>
              <div className="text-sm">Hello! Thank you for reaching out. Yes, I'm definitely open to exploring new opportunities. Can you tell me more about the role you have in mind?</div>
            </div>
          </div>
        </div>
      </CardContent>
      <CardFooter className="p-4">
        <form className="flex w-full gap-4">
          <Textarea className="flex-1 min-h-[40px] resize-none" placeholder="Type a message..." />
          <Button type="submit">Send</Button>
        </form>
      </CardFooter>
    </Card>
  )
}

