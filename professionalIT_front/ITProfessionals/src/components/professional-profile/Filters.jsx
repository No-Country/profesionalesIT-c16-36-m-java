import { Label } from "@/components/ui/label"
import { Button } from "@/components/ui/button"
import { DropdownMenuTrigger, DropdownMenuCheckboxItem, DropdownMenuContent, DropdownMenu } from "@/components/ui/dropdown-menu"
import { get } from "../../api"

export default function Filters({ onFilterChange }) {

  //options for the dropdowns
  const [profession, setProfession] = []
  const [seniority, setSeniority] = ["TRAINEE", "JUNIOR", "SEMI_SENIOR", "SENIOR", "LEAD", "PRINCIPAL"]
  const [country, setCountry] = []
  const [city, setCity] = []
  const [modality, setModality] = []
  const [languages, setLanguages] = []
  const [hardSkills, setHardSkills] = []
  const [softSkills, setSoftSkills] = []
  const [fields, setFields] = []


  const fillOptions = () => {
    //fetch options for the dropdowns
    get('/mode/get-all')
      .then(res => {
        setModality(res.data)
      })
      .catch(error => {
        console.error('Error al obtener modality:', error);
      }
      )
    get('/knownlanguage/get-all')
      .then(res => {
        setLanguages(res.data)
      }
      )
      .catch(error => {
        console.error('Error al obtener languages:', error);
      }
      )
    get('/softskill/get-all')
      .then(res => {
        setSoftSkills(res.data)
      }
      )
      .catch(error => {
        console.error('Error al obtener skills:', error);
      }
      )
    get('/hardskill/get-all')
      .then(res => {
        setHardSkills(res.data)
      }
      )
    get('/country')
      .then(res => {
        setCountry(res.data)
      }
      )
      .catch(error => {
        console.error('Error al obtener countries:', error);
      }
      )
    get('/city/get-all')
      .then(res => {
        setCity(res.data)
      }
      )
      .catch(error => {
        console.error('Error al obtener cities:', error);
      }
      )
    get('/field/get-all')
      .then(res => {
        setFields(res.data)
      }
      )
      .catch(error => {
        console.error('Error al obtener fields:', error);
      }
      )

  }

  const handleFilterChange = (filtro, valor) => {
    console.log("Filtro:", filtro, "Valor:", valor);
    onFilterChange(filtro, valor);
  };

  return (
    <section className="px-4 md:px-6 py-6 md:py-12">
      <div className="container grid gap-6">
        <div className="flex flex-col md:flex-row items-start md:items-center gap-4 md:gap-8">
          <div className="grid gap-1">
            <h1 className="text-3xl font-bold tracking-tight">Find the Perfect Match</h1>
            <p className="text-gray-500 dark:text-gray-400">
              Discover and Connect with Professionals that Match Your Criteria.
            </p>
          </div>
        </div>
        <div className="grid gap-4 md:gap-8">
          <div className="grid gap-4 md:gap-8">
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="profession">
                Profession
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="profession" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Profession
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem onClick={() => handleFilterChange('profession', 'Designer')}>Designer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem onClick={() => handleFilterChange('profession', 'Developer')}>Developer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem onClick={() => handleFilterChange('profession', 'Manager')}>Manager</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem onClick={() => handleFilterChange('profession', 'Marketer')}>Marketer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem onClick={() => handleFilterChange('profession', 'Writer')}>Writer</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="seniority">
                Seniority
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="seniority" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Seniority
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem onClick={()=>handleFilterChange("seniorities","SENIOR")}>Entry-Level</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Mid-Level</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Senior/Experienced</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Manager</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Director</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="country">
                Country
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="country" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Country
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem>USA</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Canada</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Germany</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Japan</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Brazil</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="city">
                City
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="city" variant="outline">
                    <span className="sr-only">Open</span>
                    Select City
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem>New York</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Toronto</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Berlin</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Tokyo</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>São Paulo</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
          </div>
          <div className="grid gap-4 md:gap-8">
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="modality">
                Work Modality
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="modality" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Modality
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem>Remote</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>On-Site/In-Office</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Hybrid/Partially Remote</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="languages">
                Languages
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="languages" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Languages
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem>English</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Spanish</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>French</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Chinese</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Arabic</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
            <div className="grid gap-2">
              <Label className="text-sm" htmlFor="skills">
                Skills
              </Label>
              <DropdownMenu>
                <DropdownMenuTrigger asChild>
                  <Button className="w-full justify-between text-left" id="skills" variant="outline">
                    <span className="sr-only">Open</span>
                    Select Skills
                    <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
                  </Button>
                </DropdownMenuTrigger>
                <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
                  <DropdownMenuCheckboxItem>UI/UX Design</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Frontend Development</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Project Management</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Digital Marketing</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Content Writing</DropdownMenuCheckboxItem>
                </DropdownMenuContent>
              </DropdownMenu>
            </div>
          </div>
        </div>
      </div>
    </section>
  )
}

function ChevronDownIcon(props) {
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
      <path d="m6 9 6 6 6-6" />
    </svg>
  )
}
