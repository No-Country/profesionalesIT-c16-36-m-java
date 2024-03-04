
import Login from "../../../components/auth/Login";

export default function SignIn() {
  return (
    <div className="flex h-screen shadow-lg">
        {/* Login Section */}
        <div className="w-1/2 flex flex-col justify-center items-center bg-gray-100 relative">
          <div className="absolute inset-0 z-10 flex flex-col">
            <div className="text-center mt-36">
              <h2 className=" text-4xl font-semibold text-white">Welcome Back!</h2>
              <p className="text-gray-200">Sign in to your account</p>
            </div>
          </div>
          <div
            className="w-full h-full absolute top-0 left-0 bg-cover bg-center"
            style={{ backgroundImage: "url('https://img.freepik.com/foto-gratis/equipo-trabajando-proyecto-animacion_23-2149269903.jpg?w=740&t=st=1709579103~exp=1709579703~hmac=70b8bc908f39eebaf6f26e81b44084d5c6bcb82f4bfaaf58e1f20a75f39650fd')" }}
          />
        </div>
        <div className="w-1/2 p-8">
          <Login />
        </div>
    </div>
  );
}
