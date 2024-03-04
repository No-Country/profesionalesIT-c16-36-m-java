import { Formik, Form, Field, FieldArray, ErrorMessage } from 'formik';
import * as Yup from 'yup';
export default function Info() {
    return (
        <>
            <div className='py-8 min-h-screen bg-[#222831] text-white'>
                <Formik
                    initialValues={{
                        portfolio: '',
                        seniority: '',
                        fieldId: '',
                        /* knowLanguageList: [{ language: '', level: '' }],
                        softSkills: [''],
                        hardSkills: [''], */
                        availInmediate: false,
                        availTravel: false
                    }}
                    validationSchema={Yup.object({
                        portfolio: Yup.string().url('El portafolio debe ser una URL válida'),
                        knowLanguageList: Yup.array().of(
                            Yup.object().shape({
                                language: Yup.string().required('El idioma es requerido'),
                                level: Yup.string().required('El nivel del idioma es requerido'),
                            })
                        ),
                        softSkills: Yup.array().of(
                            Yup.string().required('La habilidad blanda es requerida')
                        ),
                        hardSkills: Yup.array().of(
                            Yup.string().required('La habilidad dura es requerida')
                        ),
                        workExperience: Yup.array().of(
                            Yup.object().shape({
                                title: Yup.string().required('este campo es requerido'),
                                description: Yup.string().required('este campo es requerido'),
                            })
                        ),
                        education: Yup.array().of(
                            Yup.object().shape({
                                degree: Yup.string().required('este campo es requerido'),
                                institution: Yup.string().required('este campo es requerido'),
                                startDate: Yup.string().required('este campo es requerido'),
                                endDate: Yup.string().required('este campo es requerido'),
                            })
                        ),
                        certifications: Yup.array().of(
                            Yup.object().shape({
                                title: Yup.string().required('este campo es requerido'),
                                description: Yup.string().required('este campo es requerido'),
                                link: Yup.string().url('ingrese una URL válida').required('este campo es requerido'),
                            })
                        ),

                    })}
                    validateOnChange={false}
                    onSubmit={(values, { setSubmitting }) => {
                        setTimeout(() => {
                            alert(JSON.stringify(values, null, 2));
                            setSubmitting(false);
                        }, 400);
                    }}
                >
                    {({ handleChange }) => (
                        <Form className="w-full max-w-md mx-auto flex flex-col items-center">
                            <h2 className="mb-4">Completa tus datos personales</h2>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="portfolio" className="mb-1">Portfolio:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" type="text" name="portfolio" placeholder="http://www.ejemplo.com" />
                                <ErrorMessage name="portfolio" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="fieldId" className="mb-1">Campo de especialización:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" type="text" name="fieldId" placeholder="(ej., Ciencia de datos)" />
                                <ErrorMessage name="fieldId" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="seniority" className="mb-1">Seniority:</label>
                                <Field as="select" className="text-black p-2 border rounded border-gray-300 mb-1" name="seniority">
                                    <option value="">Selecciona</option>
                                    <option value="JUNIOR">Junior</option>
                                    <option value="SEMI_SENIOR">Semi Senior</option>
                                    <option value="SENIOR">Senior</option>
                                </Field>
                                <ErrorMessage name="seniority" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="knowLanguageList" className="mb-1">Idiomas:</label>
                                <FieldArray name="knowLanguageList">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.knowLanguageList && form.values.knowLanguageList.length > 0 ? (
                                                form.values.knowLanguageList.map((language, index) => (
                                                    <div key={index} className={`flex justify-between items-center my-3 ${index !== form.values.knowLanguageList.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        {/* <div key={index} className="flex justify-between items-center my-3"> */}
                                                        <div className="flex flex-col items-start">
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1 mr-2 w-full"
                                                                type="text"
                                                                name={`knowLanguageList.${index}.language`}
                                                                placeholder="Idioma"
                                                                onChange={handleChange}
                                                            />
                                                            <ErrorMessage
                                                                name={`knowLanguageList.${index}.language`}
                                                                component="div"
                                                                className="text-red-500"
                                                            />

                                                            <Field
                                                                as="select"
                                                                className="text-black p-2 border rounded border-gray-300 my-1 mr-2 w-full"
                                                                name={`knowLanguageList.${index}.level`}
                                                                onChange={handleChange}
                                                            >
                                                                <option value="">Selecciona el nivel</option>
                                                                <option value="A1">A1</option>
                                                                <option value="A2">A2</option>
                                                                <option value="B1">B1</option>
                                                                <option value="B2">B2</option>
                                                                <option value="C1">C1</option>
                                                                <option value="C2">C2</option>
                                                            </Field>
                                                            <ErrorMessage
                                                                name={`knowLanguageList.${index}.level`}
                                                                component="div"
                                                                className="text-red-500"
                                                            />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ language: '', level: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Idioma
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="softSkills" className="mb-1">Soft Skills:</label>
                                <FieldArray name="softSkills">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.softSkills && form.values.softSkills.length > 0 ? (
                                                form.values.softSkills.map((skill, index) => (
                                                    <div key={index} className={`flex justify-between items-center my-3 ${index !== form.values.softSkills.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        <div className="flex flex-col items-start">
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1 mr-2"
                                                                type="text"
                                                                placeholder="Hablidad"
                                                                name={`softSkills.${index}`}
                                                            />
                                                            <ErrorMessage name={`softSkills.${index}`} component="div" className="text-red-500" />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ softSkills: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Soft Skill
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="hardSkills" className="mb-1">Hard Skills:</label>
                                <FieldArray name="hardSkills">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.hardSkills && form.values.hardSkills.length > 0 ? (
                                                form.values.hardSkills.map((skill, index) => (
                                                    <div key={index} className={`flex justify-between items-center my-3 ${index !== form.values.hardSkills.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        <div className="flex flex-col items-start">
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1 mr-2"
                                                                type="text"
                                                                placeholder="Hablidad"
                                                                name={`hardSkills.${index}`}
                                                            />
                                                            <ErrorMessage name={`hardSkills.${index}`} component="div" className="text-red-500" />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ hardSkills: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Hard Skill
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>

                            <div className="flex flex-row items-baseline mb-4 w-full">
                                <label htmlFor="availInmediate" className="mb-1">Disponibilidad Inmediata:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mx-3 scale-150" type="checkbox" name="availInmediate" />
                                <label htmlFor="availTravel" className="mb-1">Disponibilidad para viajar:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mx-3 scale-150" type="checkbox" name="availTravel" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="aboutMe" className="mb-1">Sobre mí:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" as="textarea" rows="4" name="aboutMe" />
                                <ErrorMessage name="aboutMe" component="div" className="text-red-500" />{/* chequear */}
                            </div>

                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="workExperience" className="mb-1">Experiencia Laboral:</label>
                                <FieldArray name="workExperience">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.workExperience && form.values.workExperience.length > 0 ? (
                                                form.values.workExperience.map((experience, index) => (
                                                    <div key={index} className={`flex flex-col my-3 ${index !== form.values.workExperience.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`workExperience.${index}.title`} className="mb-1">Título del Trabajo:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="text"
                                                                placeholder="Título del Trabajo"
                                                                name={`workExperience.${index}.title`}
                                                            />
                                                            <ErrorMessage name={`workExperience.${index}.title`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`workExperience.${index}.description`} className="mb-1">Breve Descripción:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                as="textarea"
                                                                rows="3"
                                                                placeholder="Breve Descripción"
                                                                name={`workExperience.${index}.description`}
                                                            />
                                                            <ErrorMessage name={`workExperience.${index}.description`} component="div" className="text-red-500" />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ title: '', description: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Experiencia Laboral
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>

                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="education" className="mb-1">Educación:</label>
                                <FieldArray name="education">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.education && form.values.education.length > 0 ? (
                                                form.values.education.map((education, index) => (
                                                    <div key={index} className={`flex flex-col my-3 ${index !== form.values.education.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`education.${index}.degree`} className="mb-1">Título:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="text"
                                                                placeholder="Título"
                                                                name={`education.${index}.degree`}
                                                            />
                                                            <ErrorMessage name={`education.${index}.degree`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`education.${index}.institution`} className="mb-1">Institución:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="text"
                                                                placeholder="Institución"
                                                                name={`education.${index}.institution`}
                                                            />
                                                            <ErrorMessage name={`education.${index}.institution`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`education.${index}.startDate`} className="mb-1">Fecha de Inicio:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="date"
                                                                placeholder="Fecha de Inicio"
                                                                name={`education.${index}.startDate`}
                                                            />
                                                            <ErrorMessage name={`education.${index}.startDate`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`education.${index}.endDate`} className="mb-1">Fecha de Finalización:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="date"
                                                                placeholder="Fecha de Finalización"
                                                                name={`education.${index}.endDate`}
                                                            />
                                                            <ErrorMessage name={`education.${index}.endDate`} component="div" className="text-red-500" />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ degree: '', institution: '', startDate: '', endDate: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Educación
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="certifications" className="mb-1">Certificaciones y Cursos:</label>
                                <FieldArray name="certifications">
                                    {({ push, remove, form }) => (
                                        <div>
                                            {form.values.certifications && form.values.certifications.length > 0 ? (
                                                form.values.certifications.map((certification, index) => (
                                                    <div key={index} className={`flex flex-col my-3 ${index !== form.values.certifications.length - 1 ? 'border-b-2 border-gray-300 pb-3 mb-3' : ''}`}>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`certifications.${index}.title`} className="mb-1">Título:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="text"
                                                                placeholder="Título"
                                                                name={`certifications.${index}.title`}
                                                            />
                                                            <ErrorMessage name={`certifications.${index}.title`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`certifications.${index}.description`} className="mb-1">Breve Descripción:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                as="textarea"
                                                                rows="3"
                                                                placeholder="Breve Descripción"
                                                                name={`certifications.${index}.description`}
                                                            />
                                                            <ErrorMessage name={`certifications.${index}.description`} component="div" className="text-red-500" />
                                                        </div>
                                                        <div className="flex flex-col mb-2">
                                                            <label htmlFor={`certifications.${index}.link`} className="mb-1">Enlace al Certificado:</label>
                                                            <Field
                                                                className="text-black p-2 border rounded border-gray-300 mb-1"
                                                                type="text"
                                                                placeholder="Enlace al Certificado"
                                                                name={`certifications.${index}.link`}
                                                            />
                                                            <ErrorMessage name={`certifications.${index}.link`} component="div" className="text-red-500" />
                                                        </div>
                                                        <button
                                                            type="button"
                                                            onClick={() => remove(index)}
                                                            className="bg-red-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                                        >
                                                            Eliminar
                                                        </button>
                                                    </div>
                                                ))
                                            ) : null}
                                            <button
                                                type="button"
                                                onClick={() => push({ title: '', description: '', link: '' })}
                                                className="bg-green-500 text-white text-sm p-2 rounded-md cursor-pointer"
                                            >
                                                Agregar Certificación o Curso
                                            </button>
                                        </div>
                                    )}
                                </FieldArray>
                            </div>
                            <button className="bg-[#008A90] text-white text-sm p-2 rounded-md cursor-pointer w-32" type="submit">Guardar</button>
                        </Form>
                    )}
                </Formik>
            </div>
        </>
    )
}

