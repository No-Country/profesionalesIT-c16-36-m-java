
import { Formik, Form, Field, ErrorMessage } from 'formik';
import * as Yup from 'yup';

export const Company = () => {
    return (
        <>
            <div className='py-8 min-h-screen bg-primary text-white'>
                <Formik
                    initialValues={{
                        /*   portfolio: '',
                            seniority: '',
                            fieldId: ''
                         */   
                    }}
                    validationSchema={Yup.object({
                        /* portfolio: Yup.string().url('El portafolio debe ser una URL válida'),
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
                        ), */
                    })}
                    validateOnChange={false}
                    onSubmit={(values, { setSubmitting }) => {
                        setTimeout(() => {
                            alert(JSON.stringify(values, null, 2));
                            setSubmitting(false);
                        }, 400);
                    }}
                >
                    {(/* { handleChange } */) => (
                        <Form className="w-full max-w-md mx-auto flex flex-col items-center">
                            <h2 className="mb-4">Completa la informacion sobre tu empresa</h2>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="portfolio" className="mb-1">Name:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" type="text" name="portfolio" />
                                <ErrorMessage name="portfolio" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="portfolio" className="mb-1">About:</label>
                            </div>
                            <button className="bg-secondary text-white text-sm p-2 rounded-md cursor-pointer w-32" type="submit">Guardar</button>
                        </Form>
                    )}
                </Formik>
            </div>
        </>
    )
}
