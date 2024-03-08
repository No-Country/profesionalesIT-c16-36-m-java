cards ()=> {
    return (
        <div>

        <div className="flex justify-center gap-2">
            <div className="w-1/2">
                <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800 ">Soft Skills</div>
                <div className="flex flex-wrap gap-1">
                    {professional.softSkills.map(skill => (
                        <button key={skill.id} style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                            {skill.name}
                        </button>
                    ))}
                </div>
            </div>
            <div className="w-1/2">
                <div style={{ borderRadius: "0.5rem" }} className="text-center rounded-lg bg-[#393E46] px-3 py-1 text-sm font-bold text-[#EEEEEE] dark:bg-gray-800">Hard Skills</div>
                <div className="flex flex-wrap gap-1">
                    {professional.hardSkills.map(skill => (
                        <button key={skill.id} style={{ borderRadius: "0.5rem" }} className="mx-auto rounded-lg bg-[#00ADB5] px-3 py-1 text-bold text-[#EEEEEE]">
                            {skill.name}
                        </button>
                    ))}
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
            {professional.workExperiences.map(experience => (
                <div key={experience.id} className="grid gap-1 ">
                    <h3 className="text-[#00ADB5] font-bold">{experience.position}</h3>
                    <p className="text-lg text-gray-200 dark:text-gray-400">
                        {experience.description}
                    </p>
                </div>
            ))}
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
            {professional.educations.map(education => (
                <div key={education.id} className="grid gap-1">
                    <h3 className="text-[#00ADB5] font-bold">{education.title}</h3>
                    <p className="text-lg text-gray-200 dark:text-gray-400">{education.institution}</p>
                    <p className="text-sm text-gray-500 dark:text-gray-400">{education.startDate} - {education.endDate}</p>
                </div>
            ))}
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
            {professional.languages.map(language => (
                <div key={language.id} className="grid gap-1">
                    <h3 className="text-[#00ADB5] font-bold">{language.name}</h3>
                    <p className="text-lg text-gray-200 dark:text-gray-400">{language.level}</p>
                </div>
            ))}
        </CardContent>
    </Card>
    </div>
  );
};