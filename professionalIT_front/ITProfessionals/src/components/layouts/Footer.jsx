import React from 'react'

const Footer = () => {
  return (
      <div>
       <footer id="footer" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">
            
        <div className="footer-top">
          <div className="container">
            <div className="row">

              <div className="col-lg-3 col-md-6 footer-links">
                <h4>Links</h4>
                <ul>
                  <li><i className="bx bx-chevron-right"></i> <a href="/#">Contacto</a></li>
                  <li><i className="bx bx-chevron-right"></i> <a href="/#">Registro</a></li>
                  <li><i className="bx bx-chevron-right"></i> <a href="/#">Iniciar sesión</a></li>
                </ul>
              </div>

              <div className="col-lg-3 col-md-6 footer-links">
                <h4>Nuestro objetivos</h4>
                <ul>
                  <li><i className="bx bx-chevron-right"></i>Potenciar el desarrollo web</li>
                  <li><i className="bx bx-chevron-right"></i> Unir programadores y empresas</li>
                  <li><i className="bx bx-chevron-right"></i>Fomentar la tecnología</li>
                </ul>
              </div>

              <div className="col-lg-3 col-md-6 footer-contact">
                  <h4>Contacto</h4>
                <p> Dirección: Adam 108 </p>
                <p> Email: info@jobsearch.com </p>
                <p> Teléfono:  028456995</p>
              </div>

              <div className="col-lg-3 col-md-6 footer-info">
                <h3>Sobre Job-Search</h3>
                <p>Espacio dedicado especialmente a desarrolladores de todo el mundo</p>
                <div className="social-links mt-3">
                  <a href="/#" className="twitter"><i className="bx bxl-twitter"></i></a>
                  <a href="/#" className="facebook"><i className="bx bxl-facebook"></i></a>
                  <a href="/#" className="instagram"><i className="bx bxl-instagram"></i></a>
                  <a href="/#" className="linkedin"><i className="bx bxl-linkedin"></i></a>
                </div>
              </div>

            </div>
          </div>
        </div>
      </footer>
    </div>       
  )
}

export default Footer