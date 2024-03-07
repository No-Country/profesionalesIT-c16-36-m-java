
import { Formik, Form, Field, ErrorMessage } from 'formik';
import * as Yup from 'yup';

export const Company = () => {
    return (
        <>
            <div className='py-8 min-h-screen bg-primary text-white'>
                <Formik
                    initialValues={{
                        companyName: '',
                        description: '',
                        image: null

                    }}
                    validationSchema={Yup.object({
                        companyName: Yup.string().required('insert your company name'),
                        description: Yup.string().required('insert your company name'),
                    })}
                    validateOnChange={false}
                    onSubmit={(values, { setSubmitting }) => {
                        setTimeout(() => {
                            alert(JSON.stringify(values, null, 2));
                            setSubmitting(false);
                        }, 400);
                    }}
                >
                    {() => (
                        <Form className="w-full max-w-md mx-auto flex flex-col items-center" encType="multipart/form-data">
                            <h2 className="mb-4">Company Information</h2>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="companyName" className="mb-1">Name:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" type="text" name="companyName" />
                                <ErrorMessage name="companyName" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="description" className="mb-1">About:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" as="textarea" rows="4" name="description" />
                                <ErrorMessage name="description" component="div" className="text-red-500" />
                            </div>
                            <div className="flex flex-col mb-4 w-full">
                                <label htmlFor="image" className="mb-1">Logo:</label>
                                <Field className="text-black p-2 border rounded border-gray-300 mb-1" type="file" name="image" accept="image/*" />
                                <ErrorMessage name="image" component="div" className="text-red-500" />
                            </div>
                            <button className="bg-secondary text-white text-sm p-2 rounded-md cursor-pointer w-32" type="submit">Guardar</button>
                        </Form>
                    )}
                </Formik>
            </div>
        </>
    )
}
