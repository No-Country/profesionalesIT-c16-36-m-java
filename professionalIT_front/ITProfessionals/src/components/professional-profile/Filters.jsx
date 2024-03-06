import { Label } from "@/components/ui/label"
import { Button } from "@/components/ui/button"
import { DropdownMenuTrigger, DropdownMenuCheckboxItem, DropdownMenuContent, DropdownMenu } from "@/components/ui/dropdown-menu"

export default function Filters() {
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
                  <DropdownMenuCheckboxItem>Designer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Developer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Manager</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Marketer</DropdownMenuCheckboxItem>
                  <DropdownMenuCheckboxItem>Writer</DropdownMenuCheckboxItem>
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
                  <DropdownMenuCheckboxItem>Entry-Level</DropdownMenuCheckboxItem>
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
