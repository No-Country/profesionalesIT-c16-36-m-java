import Container from '@/components/ui/Container';
import { Button, Typography } from '@material-tailwind/react';

export default function Landing() {
  return (
    <Container className='py-8 min-h-screen bg-primary text-center' as='main'>

      <div className="min-h-screen bg-primary">
      <div className="bg-primary px-4 py-2 flex justify-between items-center shadow">
      </div>
      
      <section className="flex wrap items-center justify-between px-16 py-12">
        <div className="w-full md:w-1/2 lg:w-2/3 xl:w-3/4">
          <h1 className="text-6xl font-bold text-white mb-6">Bienvenido a Profesionales IT</h1>
          <p className="text-xl text-gray-100 mb-8">Únete a nuestra comunidad como profesional o explora nuestro catálogo de ProfesionalesIT</p>
          <Button className="bg-teal-500 text-white px-6 py-3 rounded hover:bg-teal-600">Registrar</Button>
          
        </div>
        <div className="w-full md:w-1/2 lg:w-1/3 xl:w-1/4 mt-8 md:mt-0"></div>
        <div className="flex md:flex-col items-center">
          <img
            alt="IT ProfSssional at Work"
            className="object-cover rounded  w-full h-64 md:h-80 lg:h-96 xl:h-128"
            height="400"
            src="src/assets/img/work/work.svg"
            style={{
              aspectRatio: "600/400",
              objectFit: "cover",
            }}
            width="600"
          />
        </div>
      </section>
      <section className="bg-[#393E46] p-10 text-center text-white">
      <h2 className="text-3xl font-bold mb-4">Nuestra misión</h2>
      <p className="text-lg">
        Nuestra misión es conectar a profesionales de IT con oportunidades laborales que impulsen su crecimiento y
        desarrollo en la industria tecnológica.
      </p>
    </section>
    <div className="bg-[#222831 text-white min-h-screen flex flex-col items-center justify-center">
      <h1 className="text-6xl font-bold mb-12">Ahora es mas simple</h1>
      <div className="grid grid-cols-2 gap-8">
        <div className="flex flex-col items-center">
          <img
            alt="Profesionales"
            className="rounded-lg mb-4"
            height="300"
            src="src/assets/img/work/6.svg"
            style={{
              aspectRatio: "400/300",
              objectFit: "cover",
            }}
            width="400"
          />
          <p className="text-xl font-semibold text-teal-500">Step 1</p>
          <p className="text-2xl">Profesionales</p>
        </div>
        <div className="flex flex-col items-center">
          <img
            alt="Reclutadores"
            className="rounded-lg mb-4"
            height="300"
            src="src/assets/img/work/4.svg"
            style={{
              aspectRatio: "400/300",
              objectFit: "cover",
            }}
            width="400"
          />
          <p className="text-xl font-semibold text-teal-500">Step 2</p>
          <p className="text-2xl">Reclutadores</p>
        </div>
      </div>
    </div>
    <div className="bg-[#393E46] p-10">
      <div className="max-w-7xl mx-auto">
        <div className="flex justify-between items-center mb-12">
          <h1 className="text-4xl font-bold text-white">Sumate como reclutador</h1>
          
        </div>
        <div className="grid grid-cols-3 gap-4">
          <div className="rounded-lg overflow-hidden">
            <img
              alt="Office environment"
              className="w-full h-auto"
              height="300"
              src="src/assets/img/work/2.svg"
              style={{
                aspectRatio: "400/300",
                objectFit: "cover",
              }}
              width="400"
            />
          </div>
          <div className="rounded-lg overflow-hidden">
            <img
              alt="Team meeting"
              className="w-full h-auto"
              height="300"
              src="src/assets/img/work/5.svg"
              style={{
                aspectRatio: "400/300",
                objectFit: "cover",
              }}
              width="400"
            />
          </div>
          <div className="rounded-lg overflow-hidden">
            <img
              alt="Person working"
              className="w-full h-auto"
              height="300"
              src="src/assets/img/work/7.svg"
              style={{
                aspectRatio: "400/300",
                objectFit: "cover",
              }}
              width="400"
            />
          
          </div>
        </div>
      </div>
    </div>
    <div className="bg-primary min-h-screen flex flex-col items-center justify-center text-white">
      <div className="text-center mb-12">
        <h1 className="text-5xl font-bold mb-2">Elige tu profesional</h1>
        <p className="text-xl">Crea tu cuenta gratis</p>
      </div>
      <div className="grid grid-cols-3 gap-8">
        <div className="bg-[#242731] p-6 rounded-lg">
          <h2 className="text-2xl font-semibold mb-4">Modalidad</h2>
          <div className="space-y-2">
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="remoto" name="modalidad" type="radio" />
              <label htmlFor="remoto">Remoto</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="presencial" name="modalidad" type="radio" />
              <label htmlFor="presencial">Presencial</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="hibrido" name="modalidad" type="radio" />
              <label htmlFor="hibrido">Híbrido</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="part-time" name="modalidad" type="radio" />
              <label htmlFor="part-time">Part time</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="full-time" name="modalidad" type="radio" />
              <label htmlFor="full-time">Full time</label>
            </div>
          </div>
          <button className="mt-6 bg-transparent border border-[#00b4d8] text-[#00b4d8] py-2 px-4 rounded-lg w-full">
            IR
          </button>
        </div>
        <div className="bg-[#242731] p-6 rounded-lg">
          <h2 className="text-2xl font-semibold mb-4">Talentos destacados</h2>
          <div className="space-y-2">
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="full-stack" type="checkbox" />
              <label htmlFor="full-stack">Desarrollador Full stack</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="servidores" type="checkbox" />
              <label htmlFor="servidores">Administrador de servidores</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="ux-ui" type="checkbox" />
              <label htmlFor="ux-ui">Diseño UX/UI</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="back-end" type="checkbox" />
              <label htmlFor="back-end">Desarrollador back end</label>
            </div>
          </div>
          <button className="mt-6 bg-[#00b4d8] py-2 px-4 rounded-lg w-full">IR</button>
        </div>
        <div className="bg-[#242731] p-6 rounded-lg">
          <h2 className="text-2xl font-semibold mb-4">Experiencia</h2>
          <div className="space-y-2">
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="junior" name="experiencia" type="radio" />
              <label htmlFor="junior">Junior</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="senior" name="experiencia" type="radio" />
              <label htmlFor="senior">Senior</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="semi-senior" name="experiencia" type="radio" />
              <label htmlFor="semi-senior">Semi Senior</label>
            </div>
            <div className="flex items-center">
              <input className="accent-[#00b4d8] mr-2" id="otro" name="experiencia" type="radio" />
              <label htmlFor="otro">Otro</label>
            </div>
          </div>
          <button className="mt-6 bg-transparent border border-[#00b4d8] text-[#00b4d8] py-2 px-4 rounded-lg w-full">
            IR
          </button>
        </div>
      </div>
    </div>
    </div>

    </Container>
  );
}
