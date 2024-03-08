import React from 'react'
import { CardHeader, CardContent, Card } from "@/components/ui/card"

export default function Profile() {
    return (
        <>
        <div key="1" className=" bg-[#222831]">
            <div className="container grid gap-4 px-4 py-6 md:gap-8 md:px-6 lg:gap-12 mx-auto">
                <div className="flex items-center space-x-4 justify-center">
                    <div className="flex items-center justify-center">
                        <img
                        alt="Avatar"
                        className="border rounded-full overflow-hidden border-gray-200 border-gray-200 w-32 h-32 dark:border-gray-800"
                        height="400"
                        src="https://b2472105.smushcdn.com/2472105/wp-content/uploads/2023/01/Perfil-Profesional-_50-820x1024.jpg?lossy=1&strip=1&webp=1"
                        style={{
                            aspectRatio: "200/200",
                            objectFit: "cover",
                        }}
                        width="400"
                        />
                    </div>
                </div>
                <div className="grid gap-4 md:gap-8">
                    <div className="space-y-1 text-white flex flex-col items-center justify-center h-full">
                        <h1 className="text-2xl font-bold tracking-tighter sm:text-3xl">Jane Cooper</h1>
                        <div className="flex items-center space-x-2 text-sm">
                        <BriefcaseIcon className="h-4 w-4" />
                        <span>IT Professional</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                        <ChevronUpIcon className="h-4 w-4" />
                        <span>Senior</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                        <MapPinIcon className="h-4 w-4" />
                        <span>New York, NY</span>
                        </div>
                        
                    
                        <div className="flex justify-center">
                    <a
                        className="inline-flex h-10 items-center justify-center rounded-2xl border border-gray-200 bg-[#008A90] p-2 px-8 text-sm font-medium shadow-sm gap-2 transition-colors hover:bg-gray-100 hover:text-gray-900 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-gray-950 disabled:pointer-events-none disabled:opacity-50 dark:border-gray-800 dark:border-gray-800 dark:bg-gray-950 dark:hover:bg-gray-950 dark:hover:text-gray-50 dark:focus-visible:ring-gray-300"
                        href="#"
                    >
                        Agendar reunión
                    </a>

                    </div>
                    </div>

                    <div className="grid gap-2">
                        <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Sobre mi</div>
                        <div className="grid gap-1">
                            <p className="text-sm  font-bold text-[#EEEEEE] dark:text-gray-400">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec arcu finibus, fermentum libero
                                vitae, semper ipsum.
                            </p>
                        </div>
                    </div>

                    <div className="flex justify-center space-x-8">   
                    <div className="flex items-center space-x-2 text-sm">
                        <CheckIcon color="#00ADB5" className="h-4 w-4 " />
                        <span className="text-[#00ADB5]">Disponibilidad Inmediata</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                        <GlobeIcon color="#00ADB5" className="h-4 w-4" />
                        <span  className="text-[#00ADB5]">Disponibilidad de trasladarse</span>
                        </div>
                    </div>    

                    <div className="flex justify-center gap-2">
                        <div className="w-1/2">
                            <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800 ">Soft Skills</div>
                            <div className="flex flex-wrap gap-1">
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Leadership
                            </button>
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Communication
                            </button>
                            <button style={{ borderRadius: "0.5rem" }}  className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Teamwork
                            </button>
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Problem-solving
                            </button>
                            </div>
                        </div>
                        <div className="w-1/2">
                            <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Hard Skills</div>
                            <div className="flex flex-wrap gap-1">
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Network Security
                            </button>
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Cloud Computing
                            </button>
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                                Database Management
                            </button>
                            
                            <button style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">Python</button>
                            </div>
                        </div>
                    </div>
                  
                    <div className="grid gap-2 justify-center">
                        <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Modalidad de trabajo</div>    
                            <div className="flex flex-wrap gap-1">
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Presencial
                            </button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Híbrido
                            </button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Remoto
                            </button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Freelance
                            </button>
                            </div>
                    </div>

                    <Card>
                        <CardHeader>
                        <div>
                            <BriefcaseIcon className="h-6 w-6 text-white" />
                        </div>
                        <div className="text-white font-bold">Experiencia Laboral</div>
                        </CardHeader>
                        <CardContent className="space-y-4 ">
                        <div className="grid gap-1 ">
                            <h3 className="text-[#00ADB5] font-bold">Senior IT Manager</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">
                            Leading the IT team to implement innovative solutions and ensure seamless operations.
                            </p>
                        </div>
                        <div className="grid gap-1">
                            <h3 className="text-[#00ADB5] font-bold">IT Specialist</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">
                            Provided technical support and managed network infrastructure.
                            </p>
                        </div>
                        </CardContent>
                    </Card>
                    <Card>
                        <CardHeader>
                        <div>
                            <BookIcon className="h-6 w-6 text-white" />
                        </div>
                        <div className="text-white font-bold">Educación</div>
                        </CardHeader>
                        <CardContent className="space-y-4">
                        <div className="grid gap-1">
                            <h3 className="text-[#00ADB5] font-bold">Master of Science in Computer Science</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">University of Information Technology (UIT)</p>
                            <p className="text-sm text-gray-500 dark:text-gray-400">2010 - 2012</p>
                        </div>
                        <div className="grid gap-1">
                            <h3 className="text-[#00ADB5] font-bold">Bachelor of Information Technology</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">College of Technology</p>
                            <p className="text-sm text-gray-500 dark:text-gray-400">2006 - 2010</p>
                        </div>
                        </CardContent>
                    </Card>
                    <Card>
                        <CardHeader>
                        <div>
                            <LanguageIcon className="h-6 w-6 text-white" />
                        </div>
                        <div className="text-white font-bold">Idiomas</div>
                        </CardHeader>
                        <CardContent className="space-y-4">
                        <div className="grid gap-1">
                            <h3 className="text-[#00ADB5] font-bold">Español</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">C2-Nativo</p>
                        </div>
                        <div className="grid gap-1">
                            <h3 className="text-[#00ADB5] font-bold">Inglés</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">C1-Avanzado</p>
                        </div>
                        </CardContent>
                    </Card>
                    <Card>
                        <CardHeader>
                        <div>
                            <AwardIcon className="h-6 w-6 text-white" />
                        </div>
                        <div className="text-white font-bold">Certificaciones y cursos</div>
                        </CardHeader>
                        <CardContent className="space-y-4">
                        <ul className="grid gap-4 list-disc list-outside">
                            <li>
                            <h3 className="text-[#00ADB5] font-bold">Certified Information Systems Security Professional (CISSP)</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec arcu finibus, fermentum
                                libero vitae, semper ipsum.
                            </p>
                            </li>
                            <li>
                            <h3 className="text-[#00ADB5] font-bold">Certified ScrumMaster (CSM)</h3>
                            <p className="text-lg text-gray-200 dark:text-gray-400">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec arcu finibus, fermentum
                                libero vitae, semper ipsum.
                            </p>
                            </li>
                        </ul>
                        </CardContent>
                    </Card>
                    <Card>
                        <CardHeader>
                        <div>
                            <AwardIcon className="h-6 w-6 text-white" />
                        </div>
                        <div className="text-white font-bold">Proyectos Relacionados</div>
                        </CardHeader>
                        <CardContent className="space-y-4 text-white">
                        <div className="flex justify-center">
                    <a className="inline-flex h-10 items-center justify-center rounded-2xl border border-[#008A90] p-2 px-8 text-sm font-medium shadow-sm gap-2 transition-colors hover:bg-gray-100 hover:text-gray-900 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-gray-950 disabled:pointer-events-none disabled:opacity-50 dark:border-gray-800 dark:border-gray-800 dark:bg-gray-950 dark:hover:bg-gray-950 dark:hover:text-gray-50 dark:focus-visible:ring-gray-300"
                        href="#">
                        Portafolio
                    </a>
                    </div>
                        </CardContent>
                    </Card>

                    <div className="flex justify-center">
                    <a
                        className="inline-flex h-10 items-center justify-center rounded-2xl border border-gray-200 bg-[#008A90] p-2 px-8 text-sm font-medium shadow-sm gap-2 transition-colors hover:bg-gray-100 hover:text-gray-900 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-gray-950 disabled:pointer-events-none disabled:opacity-50 dark:border-gray-800 dark:border-gray-800 dark:bg-gray-950 dark:hover:bg-gray-950 dark:hover:text-gray-50 dark:focus-visible:ring-gray-300"
                        href="#">Contactar
                    </a>

                    </div>
                </div>
            </div>
        </div>
        </>
    )

    function AwardIcon(props) {
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
            <circle cx="12" cy="8" r="6" />
            <path d="M15.477 12.89 17 22l-5-3-5 3 1.523-9.11" />
          </svg>
        )
      }
      
      
      function BookIcon(props) {
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
            <path d="M4 19.5v-15A2.5 2.5 0 0 1 6.5 2H20v20H6.5a2.5 2.5 0 0 1 0-5H20" />
          </svg>
        )
      }
      
      
      function BriefcaseIcon(props) {
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
            <rect width="20" height="14" x="2" y="7" rx="2" ry="2" />
            <path d="M16 21V5a2 2 0 0 0-2-2h-4a2 2 0 0 0-2 2v16" />
          </svg>
        )
      }
      
      
      function ChevronUpIcon(props) {
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
            <path d="m18 15-6-6-6 6" />
          </svg>
        )
      }
      
      
      function MapPinIcon(props) {
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
            <path d="M20 10c0 6-8 12-8 12s-8-6-8-12a8 8 0 0 1 16 0Z" />
            <circle cx="12" cy="10" r="3" />
          </svg>
        )
      }
}

function LanguageIcon(props) {
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
        <path
          strokeLinecap="round"
          strokeLinejoin="round"
          d="m10.5 21 5.25-11.25L21 21m-9-3h7.5M3 5.621a48.474 48.474 0 0 1 6-.371m0 0c1.12 0 2.233.038 3.334.114M9 5.25V3m3.334 2.364C11.176 10.658 7.69 15.08 3 17.502m9.334-12.138c.896.061 1.785.147 2.666.257m-4.589 8.495a18.023 18.023 0 0 1-3.827-5.802"
        />
      </svg>
    );
  }
  
  function GlobeIcon({ color = "#000", ...props }) {
    return (
        <svg
        {...props}
        xmlns="http://www.w3.org/2000/svg"
        width="24"
        height="24"
        viewBox="0 0 24 24"
        fill="none"
        stroke={color}
        strokeWidth="2"
        strokeLinecap="round"
        strokeLinejoin="round"
        >
    <path strokeLinecap="round" strokeLinejoin="round" d="m6.115 5.19.319 1.913A6 6 0 0 0 8.11 10.36L9.75 12l-.387.775c-.217.433-.132.956.21 1.298l1.348 1.348c.21.21.329.497.329.795v1.089c0 .426.24.815.622 1.006l.153.076c.433.217.956.132 1.298-.21l.723-.723a8.7 8.7 0 0 0 2.288-4.042 1.087 1.087 0 0 0-.358-1.099l-1.33-1.108c-.251-.21-.582-.299-.905-.245l-1.17.195a1.125 1.125 0 0 1-.98-.314l-.295-.295a1.125 1.125 0 0 1 0-1.591l.13-.132a1.125 1.125 0 0 1 1.3-.21l.603.302a.809.809 0 0 0 1.086-1.086L14.25 7.5l1.256-.837a4.5 4.5 0 0 0 1.528-1.732l.146-.292M6.115 5.19A9 9 0 1 0 17.18 4.64M6.115 5.19A8.965 8.965 0 0 1 12 3c1.929 0 3.716.607 5.18 1.64" />
    <circle cx="12" cy="10" r="3" />
    </svg>
    )
  }
  function CheckIcon({ color = "#000", ...props }) {
    return (
        <svg
        {...props}
        xmlns="http://www.w3.org/2000/svg"
        width="24"
        height="24"
        viewBox="0 0 24 24"
        fill="none"
        stroke={color}
        strokeWidth="2"
        strokeLinecap="round"
        strokeLinejoin="round"
        >
        <path stroke-linecap="round" stroke-linejoin="round" d="M9 12.75 11.25 15 15 9.75M21 12a9 9 0 1 1-18 0 9 9 0 0 1 18 0Z" />
    </svg>
    )
  }
