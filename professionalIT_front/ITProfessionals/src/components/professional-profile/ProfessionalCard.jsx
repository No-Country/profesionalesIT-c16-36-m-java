import { Button } from "@/components/ui/button"
import { CardContent, Card } from "@/components/ui/card"
import { Link } from 'react-router-dom';

export default function ProfessionalCard({ professional}) {
  return (
    <Card className="w-full max-w-sm rounded-xl border border-gray-200" style={{ maxWidth: '300px' }}>
      <CardContent className="flex flex-col items-center p-6 gap-4">
        <div className="text-center">
          <img
            alt="Profile photo"
            className="rounded-full"
            height="120"
            src= {professional.person.img}
            style={{
              aspectRatio: "120/120",
              objectFit: "cover",
            }}
            width="120"
          />
        </div>
        <div className="text-center space-y-1">
          <div className="flex flex-col gap-1">
            <h2 className="text-lg font-bold">{professional.person.name}</h2>
            <p className="text-sm font-medium leading-none text-gray-500 dark:text-gray-400">
              {professional.field.name} - {professional.seniority}
            </p>
            <p className="text-sm font-medium leading-none text-gray-500 dark:text-gray-400">{professional.person.locality.name}, {professional.person.province.name}, {professional.person.country.name}</p>
          </div>
        </div>
        <div className="flex flex-col gap-2 w-full min-w-0">
            <Link className="flex justify-center" to="/profile/contact">
              <Button size="sm">Contact</Button>
            </Link>
            <Link className="flex justify-center" to={`/profile/admin/${professional.id}`}>
                <Button size="sm" variant="outline">
                    View Profile
                </Button>
            </Link>
        </div>
      </CardContent>
    </Card>
  )
}

