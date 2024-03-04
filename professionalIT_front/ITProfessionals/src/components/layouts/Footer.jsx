import { Link } from 'react-router-dom';
import { Input } from "@/components/ui/input"
import { Button } from "@/components/ui/button"

export default function Footer() {
  return (
    <footer className="bg-[#252f3f] text-white">
      <div className="max-w-7xl mx-auto py-12 px-4 sm:px-6 lg:py-16 lg:px-8">
        <div className="xl:grid xl:grid-cols-5 xl:gap-8">
          <div className="space-y-8 xl:col-span-1">
            <h3 className="text-sm font-semibold tracking-wider uppercase">Solutions</h3>
            <ul className="list-none space-y-4">
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Marketing
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Analytics
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Commerce
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Insights
                </Link>
              </li>
            </ul>
          </div>
          <div className="space-y-8 xl:col-span-1 mt-8 xl:mt-0">
            <h3 className="text-sm font-semibold tracking-wider uppercase">Support</h3>
            <ul className="list-none space-y-4">
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Pricing
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Documentation
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Guides
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  API Status
                </Link>
              </li>
            </ul>
          </div>
          <div className="space-y-8 xl:col-span-1 mt-8 xl:mt-0">
            <h3 className="text-sm font-semibold tracking-wider uppercase">Company</h3>
            <ul className="list-none space-y-4">
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  About
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Blog
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Jobs
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Press
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Partners
                </Link>
              </li>
            </ul>
          </div>
          <div className="space-y-8 xl:col-span-1 mt-8 xl:mt-0">
            <h3 className="text-sm font-semibold tracking-wider uppercase">Legal</h3>
            <ul className="list-none space-y-4">
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Claim
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Privacy
                </Link>
              </li>
              <li>
                <Link className="text-base text-gray-300 hover:text-white" to="#">
                  Terms
                </Link>
              </li>
            </ul>
          </div>
          <div className="space-y-8 xl:col-span-1 mt-8 xl:mt-0">
            <h3 className="text-sm font-semibold tracking-wider uppercase">Subscribe to our newsletter</h3>
            <p className="text-base text-gray-300">
              The latest news, articles, and resources, sent to your inbox weekly.
            </p>
            <form className="mt-4 sm:flex sm:max-w-md">
              <Input
                className="w-full px-5 py-3 placeholder-gray-500 border border-transparent rounded-md focus:ring-2 focus:ring-offset-2 focus:ring-offset-gray-800 focus:ring-white"
                placeholder="Enter your email"
                type="email"
              />
              <Button className="mt-3 sm:mt-0 sm:ml-3 w-full sm:w-auto px-5 py-3 border border-transparent text-base font-medium rounded-md shadow-sm text-white bg-[#6366f1] hover:bg-[#4f46e5]">
                Subscribe
              </Button>
            </form>
          </div>
        </div>
        <div className="mt-12 border-t border-gray-700 pt-8">
          <p className="text-base text-gray-400 xl:text-center">© 2020 Your Company, Inc. All rights reserved.</p>
          <div className="mt-8 flex justify-center space-x-6">
            <Link className="text-gray-400 hover:text-gray-300" to="#">
              <FacebookIcon className="h-6 w-6" />
            </Link>
            <Link className="text-gray-400 hover:text-gray-300" to="#">
              <InstagramIcon className="h-6 w-6" />
            </Link>
            <Link className="text-gray-400 hover:text-gray-300" to="#">
              <TwitterIcon className="h-6 w-6" />
            </Link>
            <Link className="text-gray-400 hover:text-gray-300" to="#">
              <LinkedinIcon className="h-6 w-6" />
            </Link>
          </div>
        </div>
      </div>
    </footer>
  )
}

function FacebookIcon(props) {
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
      <path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z" />
    </svg>
  )
}


function InstagramIcon(props) {
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
      <rect width="20" height="20" x="2" y="2" rx="5" ry="5" />
      <path d="M16 11.37A4 4 0 1 1 12.63 8 4 4 0 0 1 16 11.37z" />
      <line x1="17.5" x2="17.51" y1="6.5" y2="6.5" />
    </svg>
  )
}


function LinkedinIcon(props) {
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
      <path d="M16 8a6 6 0 0 1 6 6v7h-4v-7a2 2 0 0 0-2-2 2 2 0 0 0-2 2v7h-4v-7a6 6 0 0 1 6-6z" />
      <rect width="4" height="12" x="2" y="9" />
      <circle cx="4" cy="4" r="2" />
    </svg>
  )
}


function TwitterIcon(props) {
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
      <path d="M22 4s-.7 2.1-2 3.4c1.6 10-9.4 17.3-18 11.6 2.2.1 4.4-.6 6-2C3 15.5.5 9.6 3 5c2.2 2.6 5.6 4.1 9 4-.9-4.2 4-6.6 7-3.8 1.1 0 3-1.2 3-1.2z" />
    </svg>
  )
}
