import { CardHeader, CardContent, Card } from "@/components/ui/card"
import { useEffect, useState } from "react"
import { get } from '../../../api/index.jsx'
import { useParams } from 'react-router-dom';

export default function Profile() {
    const { id } = useParams();
    const [professional, setProfessional] = useState();

    useEffect(() => {
        // Hacer la petición GET a la API utilizando el ID del profesional
        get(`/professional/${id}`)
            .then(res => {
                setProfessional(res.data);
            })
            .catch(error => {
                console.error('Error al obtener el perfil del profesional:', error);
            });
    }, [id]);

    if (!professional) {
        return <div>Loading...</div>;
    }
    return (
        <div className="bg-[#222831]">
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
                        <h1 className="text-2xl font-bold tracking-tighter sm:text-3xl">{professional.person.name} {professional.person.lastName}</h1>
                        <div className="flex items-center space-x-2 text-sm">
                            <BriefcaseIcon className="h-4 w-4" />
                            <span>{professional.field.name}</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                            <ChevronUpIcon className="h-4 w-4" />
                            <span>{professional.seniority}</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                            <MapPinIcon className="h-4 w-4" />
                            <span>{professional.person.locality.name}, {professional.person.province.name}</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                            <CheckIcon className="h-4 w-4" />
                            <span>{professional.availInmediate ? 'Disponibilidad Inmediata' : 'No disponible'}</span>
                        </div>
                        <div className="flex items-center space-x-2 text-sm">
                            <GlobeIcon className="h-4 w-4" />
                            <span>{professional.availTravel ? 'Disponibilidad de trasladarse' : 'No disponible'}</span>
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
                    <div className="grid gap-2 justify-center">
                        <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Modalidad de trabajo</div>
                        <div className="flex flex-wrap gap-1">
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Presencial</button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Híbrido</button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Remoto</button>
                            <button style={{ borderRadius: "0.5rem", border: "2px solid #393E46" }} className="mx-auto rounded-lg px-3 py-1 text-bold text-[#EEEEEE]">Freelance</button>
                        </div>
                    </div>
                    <div className="grid gap-2">
                        <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Sobre mi</div>
                        <div className="grid gap-1">
                            <p className="text-sm  font-bold text-[#EEEEEE] dark:text-gray-400">
                                {professional.aboutMe}
                            </p>
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
    )
}


    