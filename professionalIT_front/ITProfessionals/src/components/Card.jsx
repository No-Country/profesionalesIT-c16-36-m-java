/**
 * v0 by Vercel.
 * @see https://v0.dev/t/RYhpoPUzJGq
 * Documentation: https://v0.dev/docs#integrating-generated-code-into-your-nextjs-app
 */
import { CardContent, Card } from "@/components/ui/card"

export default function Card() {
  return (
    <Card className="w-full max-w-sm">
      <CardContent className="flex flex-col items-center">
        <div className="mb-4">
          <img
            alt="Photo"
            className="rounded-full"
            height="96"
            src="/placeholder.svg"
            style={{
              aspectRatio: "96/96",
              objectFit: "cover",
            }}
            width="96"
          />
        </div>
        <div className="text-center">
          <h3 className="text-lg font-bold">Jessica Jones</h3>
          <p className="text-sm font-medium leading-loose tracking-wide text-gray-500 dark:text-gray-400">
            Product Designer
          </p>
        </div>
      </CardContent>
      <CardContent className="flex items-center justify-center p-6 border-t">
        <div className="text-center">
          <h4 className="text-sm font-semibold tracking-wide uppercase text-gray-500 dark:text-gray-400">Seniority</h4>
          <div className="text-2xl font-bold">Mid-level</div>
        </div>
        <div className="w-px h-8 bg-gray-200 mx-6 dark:bg-gray-800" />
        <div className="text-center">
          <h4 className="text-sm font-semibold tracking-wide uppercase text-gray-500 dark:text-gray-400">
            Availability
          </h4>
          <div>Available</div>
        </div>
      </CardContent>
    </Card>
  )
}

