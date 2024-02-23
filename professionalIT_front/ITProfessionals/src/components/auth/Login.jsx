import { useContext } from 'react'
import { useNavigate, Navigate } from 'react-router-dom';
import "../../assets/css/login.css"


 
export const Login = () => {

  return (
      <div>
        <br /><br /><br />   
        <div className="formLogin">
          <h4 className='titleFormRegister'>Login</h4>
            <form className="php-email-form"> 
              <div className="row">
                <div className="col-md-12 form-group">
                  <label>Email</label>
                  <input type="email" className="form-control" placeholder="usuario@mail.com" name="email" ></input>
                </div>
              </div>
              <div className="form-group mt-3">
                <label>Contraseña</label>
                <input type="password" className="form-control" placeholder="Escribe tu password" name="password"></input>
              </div>
              <div className="text-center"><button type="submit">Login</button></div>
              <p>
                ¿No tienes una cuenta? <a href="register" className='colorT'>Crear mi cuenta</a>
              </p>
            </form>
          </div>
        
      </div>
  )
}
