import React, { useContext } from 'react'
import { useNavigate } from 'react-router-dom';
import { userCont } from '../../context/UserContext'
import "../../css/login.css"

export default function LogOut() {

    const context = useContext(userCont)
    const navigate = useNavigate();

    const handleLogOut=()=>{
        localStorage.removeItem("token")
        context.setUser({
            logged:false,
            name:"",
            id:""
        })
        navigate("/",{
            replace:true
        })
    }
    return (
        <a type='button' href='/#' className='titleLogout' onClick={handleLogOut}>
            Cerrar sesión
        </a>
    )
}
