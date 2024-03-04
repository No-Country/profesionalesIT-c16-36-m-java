import { Link } from 'react-router-dom';

export default function Interview() {
  return (          
            <Link className="flex items-center gap-2 p-2 rounded-lg bg-gray-100 dark:bg-gray-800" to="#">
              <img
                alt="Avatar"
                className="rounded-md"
                height="40"
                src="https://b2472105.smushcdn.com/2472105/wp-content/uploads/2023/01/Perfil-Profesional-_50-820x1024.jpg?lossy=1&strip=1&webp=1"
                style={{
                  aspectRatio: "40/40",
                  objectFit: "cover",
                }}
                width="40"
              />
              <div className="grid gap-1 text-xs w-full">
                <h3 className="font-semibold truncate">Interview with Alice</h3>
                <p className="text-sm text-gray-500 dark:text-gray-400">11:00 AM</p>
              </div>
            </Link>
)
}

