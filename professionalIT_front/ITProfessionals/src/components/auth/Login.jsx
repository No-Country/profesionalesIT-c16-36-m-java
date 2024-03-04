/**
 * v0 by Vercel.
 * @see https://v0.dev/t/wit1E1RoaYn
 * Documentation: https://v0.dev/docs#integrating-generated-code-into-your-nextjs-app
 */
import { CardTitle, CardDescription, CardHeader, CardContent, Card } from "@/components/ui/card"
import { Label } from "@/components/ui/label"
import { Input } from "@/components/ui/input"
import { Link } from 'react-router-dom';
import { Button } from "@/components/ui/button"

export default function Login() {
  return (
    <Card>
      <CardHeader>
        <CardTitle className="text-2xl">Login</CardTitle>
        <CardDescription>Enter your email below to login to your account.</CardDescription>
      </CardHeader>
      <CardContent className="space-y-4">
        <div className="space-y-2">
          <Label htmlFor="email">Email</Label>
          <Input id="email" placeholder="m@example.com" required type="email" />
        </div>
        <div className="space-y-2">
          <Label htmlFor="password">Password</Label>
          <Input id="password" required type="password" />
        </div>
        <div className="flex flex-col gap-2">
          <Link className="text-sm underline" to="#">
            Forgot your password?
          </Link>
          <div className="flex flex-col gap-2">
            <Button className="w-full" type="submit">
              Login
            </Button>
            <Button className="w-full" variant="outline">
              Login with Google
            </Button>
          </div>
          <p className="text-sm">
            Don't have an account?
            <Link className="text-blue-500 underline" to="../signup">
              Register here
            </Link>
          </p>
        </div>
      </CardContent>
    </Card>
  )
}

