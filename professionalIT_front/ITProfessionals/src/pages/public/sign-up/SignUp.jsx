import Signup from "../../../components/auth/Signup";

export default function SignUp() {
  return <div className="flex h-screen shadow-lg">
    {/* Login Section */}
    <div className="w-1/2 flex flex-col justify-center items-center bg-gray-100 relative">
      <div className="absolute inset-0 z-10 flex flex-col">
        <div className="text-center mt-36">
          <h2 className="text-4xl font-semibold text-white">Join Us!</h2>
          <p className="text-gray-200">Create your account</p>
        </div>
      </div>
      <div
        className="w-full h-full absolute top-0 left-0 bg-cover bg-center"
        style={{ backgroundImage: "url('https://img.freepik.com/foto-gratis/retrato-hombre-que-trabaja-junto-sus-colegas_23-2149116522.jpg?w=740&t=st=1709579100~exp=1709579700~hmac=190be2de154d7a50c6af44252f45b752bba130a536d780c5d145cd96eabdd08b')" }}
      />
    </div>
    <div className="w-1/2 p-8">
      <Signup/>
    </div>
  </div>
}
