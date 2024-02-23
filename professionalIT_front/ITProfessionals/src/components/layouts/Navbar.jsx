import React from 'react'


export const Navbar = () => {

  return (
    <div>
        <header id="header" className="fixed-top d-flex align-items-center header-transparent">
        <div className="container d-flex justify-content-between align-items-center">

          <div className="logo">
            <h1 className="text-light"><a href="/"><span>Job- search</span></a></h1>
        
          </div>
        
          <nav id="navbar" className="navbar">
            <ul>
              <li><a className="active " href="/">Home</a></li>
              {/* <li><a href="/">About</a></li> */}
              {/* <li><Link to={"/allpostulants"} >Encontrar programadores</Link></li> */}
              <li>
                <a href="/listOffers">Lista de ofertas</a>
              </li>
              <li>
                <a href="/contact">Contacto</a>
              </li>
              <li>
                <a href="/register">Registro</a>
              </li>
              <li>
                <a href="/login">Iniciar Sesión</a>
              </li>

            </ul>
            <i className="bi bi-list mobile-nav-toggle"></i>
          </nav> 

        </div>
      </header>
    
    </div>
  )
}

