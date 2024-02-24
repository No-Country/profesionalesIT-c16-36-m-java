import React from 'react'
import { Link } from 'react-router-dom';

export default function SideUserInfo () {
  return (
    <>
      <img src="src/assets/img/image.jpg" alt="Profile picture"/>
      <h1>Name Lastname</h1>
      <h2>Seniority Position</h2>
      <div>
        {/* pending task: personalizated url */}
        <Link to="/message/user">
          <button>Send message</button>
        </Link>
      </div>
    </>
  );
}