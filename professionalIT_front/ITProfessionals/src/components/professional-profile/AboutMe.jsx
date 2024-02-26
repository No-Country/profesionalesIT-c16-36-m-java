import React from 'react'

export default function AboutMe () {
  return (
    <>
        <h3>What I offer</h3>

        <h4>About me</h4>

        <h5>Presentation:</h5>
        <p className="description">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Mollitia nihil voluptatem harum omnis neque aspernatur, amet eius deserunt, odio voluptatum veniam, possimus facilis consequatur molestias placeat vel magnam asperiores. Quae.</p>

        <div className="info">
        <h5 className="tagdescription">Ubication:</h5>
        <p className="tag">México</p>
        <p className="tag">Distrito Federal</p>
        <p className="tag">Mexicali</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Languages:</h5>
        <p className="tag">Spanish basic</p>
        <p className="tag">English native</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Soft Skills:</h5>
        <p className="tag">Teamwork</p>
        <p className="tag">Communication</p>
        <p className="tag">Problem solving</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Last profile picture update:</h5>
        <p className="tag">1 year ago</p>
        <h5 className="tagdescription">Last information update:</h5>
        <p className="tag">3 months ago</p>
        </div>

        <h4>Experience</h4>

        <div className="info">
        <h5 className="tagdescription">Hard Skills:</h5>
        <p className="tag">Java advanced</p>
        <p className="tag">Spring Boot intermediate</p>
        <p className="tag">MySQL advanced</p>
        </div>

        <h5>Experience:</h5>
        <h6 style={{ marginBottom: '2%', marginTop: '2%' }}>QA Tester Junior</h6>
        <div className="companyInfo">
        <p>Company</p>  <p>|</p>
        <p>5 months</p> <p>-</p>
        <p>actuality</p>  <p>|</p>
        <p>Country, Province, City</p>  <p>|</p>
        <p>(OPTIONAL) Job obtained through IT Professionals.</p>
        </div>
        <ul>
        <li>
            Lorem ipsum dolor, luptates, recusandae excepturi tenetur, sequi eveniet? Saepe!
        </li>
        <li>
            Lorem um incidunt quod dolorem saepe, quia neque dolores hic voluptates, recusandae excepturi tenetur, sequi eveniet? Saepe!
        </li>
        </ul>
        <div className="companyInfo">
        <p>🏆</p> <p>My achievements were...</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Links:</h5>
        <a target="_blank" href="linkedin.com"> <div className="button">LinkedIn</div> </a>
        <a target="_blank" href="linkedin.com"> <div className="button">Repository</div> </a>
        <a target="_blank" href="linkedin.com"> <div className="button">Portfolio</div> </a>
        <a target="_blank" href="linkedin.com"> <div className="button">Other</div> </a>
        </div>

        <h4>Knowledge</h4>

        <h5>Academic:</h5>

        <h6 style={{ marginBottom: '2%', marginTop: '2%' }}>Bachelor's Degree at Computer Systems</h6>
        <div className="companyInfo">
        <p>Company</p>  <p>|</p>
        <p>5 months</p> <p>-</p>
        <p>in progress</p>  <p>|</p>
        <p>Country, Province, City</p>
        </div>

        <h5 style={{ marginBottom: '2%', marginTop: '5%' }}>Certifications:</h5>
        <h6 style={{ marginBottom: '2%', marginTop: '3%' }}>MySQL advanced</h6>
        <div className="companyInfo">
        <p>Coursera</p>  <p>|</p>
        <p>3 months</p> <p>-</p>
        <p>finished</p>
        </div>
        <a target="_blank" href="linkedin.com"> <div className="button">Certificate</div> </a>

        <h4>Availability</h4>

        <div className="info">
        <h5 className="tagdescription">Open to work:</h5>
        <p className="tag">Yes</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Immediate availability:</h5>
        <p className="tag">Yes</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Availability to travel:</h5>
        <p className="tag">Yes</p>
        </div>

        <div className="info">
        <h5 className="tagdescription">Contact me during the following hours:</h5>
        <p className="tag">Monday-Friday from 09am to 18pm</p>
        </div>
    </>
  );
}