import React from 'react'
import Chat from '../../../components/commons/Chat'
import Notifications from '../../../components/client/Notifications'
import Interview from '../../../components/client/Iterview'

export default function ProfileContact() {
    return (
        <div className="flex flex-row">
            <div className="w-1/4 p-4">
                <Notifications/>
                <div className="flex-1 flex flex-col overflow-hidden pr-6">
                    <div className="flex-1 overflow-y-auto">
                        <div className="grid gap-4 p-4">
                            <div className="grid gap-1">
                                <h2 className="text-lg font-semibold">Interviews</h2>
                                <Interview/>
                                <Interview/>
                                <Interview/>                            
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div className="w-3/4 p-4">
                <div className='min-h-screen text-white flex flex-wrap justify-center gap-4'>
                    <Chat/>
                </div>
            </div>
        </div>
    )
}
