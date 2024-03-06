import { Badge } from "@/components/ui/badge"
import { Link } from 'react-router-dom';

export default function Notifications() {
  return (
    <aside className="w-64 flex-shrink-0 border-r bg-gray-50 dark:bg-gray-950">
      <div className="h-[1px] w-full" />
      <div className="flex-1 flex flex-col">
        <nav aria-label="Notifications" className="flex-1 overflow-y-auto">
          <div className="space-y-1">
            <Link className="flex items-center space-x-2 p-3 rounded-md text-sm font-medium" to="#">
              <span className="sr-only">View</span>
              <MailIcon className="h-4 w-4" />
              <span className="truncate">Messages</span>
              <Badge className="ml-auto w-6 h-6">2</Badge>
            </Link>
            <Link className="flex items-center space-x-2 p-3 rounded-md text-sm font-medium" to="#">
              <span className="sr-only">View</span>
              <ClipboardListIcon className="h-4 w-4" />
              <span className="truncate">Favorites</span>
              <Badge className="ml-auto w-6 h-6 bg-blue-500">5</Badge>
            </Link>
            <Link className="flex items-center space-x-2 p-3 rounded-md text-sm font-medium" to="#">
              <span className="sr-only">View</span>
              <CalendarCheckIcon className="h-4 w-4" />
              <span className="truncate">Interviews</span>
            </Link>
            <Link className="flex items-center space-x-2 p-3 rounded-md text-sm font-medium" to="#">
              <span className="sr-only">View</span>
              <StarIcon className="h-4 w-4" />
              <span className="truncate">Starred</span>
            </Link>
          </div>
        </nav>
      </div>
    </aside>
  )
}

function CalendarCheckIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <rect width="18" height="18" x="3" y="4" rx="2" ry="2" />
      <line x1="16" x2="16" y1="2" y2="6" />
      <line x1="8" x2="8" y1="2" y2="6" />
      <line x1="3" x2="21" y1="10" y2="10" />
      <path d="m9 16 2 2 4-4" />
    </svg>
  )
}


function ClipboardListIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <rect width="8" height="4" x="8" y="2" rx="1" ry="1" />
      <path d="M16 4h2a2 2 0 0 1 2 2v14a2 2 0 0 1-2 2H6a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h2" />
      <path d="M12 11h4" />
      <path d="M12 16h4" />
      <path d="M8 11h.01" />
      <path d="M8 16h.01" />
    </svg>
  )
}


function MailIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <rect width="20" height="16" x="2" y="4" rx="2" />
      <path d="m22 7-8.97 5.7a1.94 1.94 0 0 1-2.06 0L2 7" />
    </svg>
  )
}


function StarIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <polygon points="12 2 15.09 8.26 22 9.27 17 14.14 18.18 21.02 12 17.77 5.82 21.02 7 14.14 2 9.27 8.91 8.26 12 2" />
    </svg>
  )
}
