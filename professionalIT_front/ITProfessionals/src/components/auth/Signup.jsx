import { CardTitle, CardDescription, CardHeader, CardContent, Card } from "@/components/ui/card"
import { Label } from "@/components/ui/label"
import { Input } from "@/components/ui/input"
import { Button } from "@/components/ui/button"
import { Link } from 'react-router-dom';

export default function Signup() {
  return (
    <Card>
      <CardHeader>
        <CardTitle className="text-2xl">Register</CardTitle>
        <CardDescription>Enter your information to create an account.</CardDescription>
      </CardHeader>
      <CardContent className="space-y-4">
        <div className="grid grid-cols-2 gap-4">
          <div className="space-y-2">
            <Label htmlFor="first-name">First Name</Label>
            <Input id="first-name" placeholder="John" required type="text" />
          </div>
          <div className="space-y-2">
            <Label htmlFor="last-name">Last Name</Label>
            <Input id="last-name" placeholder="Doe" required type="text" />
          </div>
        </div>
        <div className="space-y-2">
          <Label htmlFor="email">Email</Label>
          <Input id="email" placeholder="johndoe@example.com" required type="email" />
        </div>
        <div className="space-y-2">
          <Label htmlFor="password">Password</Label>
          <Input id="password" required type="password" />
        </div>
        <div className="flex flex-col gap-2">
          <Button className="w-full" type="submit">
            Register
          </Button>
          <Button className="w-full bg-[#4285F4] text-white hover:bg-[#357AE8]" variant="outline">
            Register with Google
          </Button>
          <p className="text-sm">
            Already have an account?
            <Link className="text-blue-500 underline" to="#">
              Login here
            </Link>
          </p>
        </div>
      </CardContent>
    </Card>
  )
}

