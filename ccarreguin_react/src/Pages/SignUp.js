import React, { useState } from "react";
import registroDeUsuarios from "../Services/registroDeUsuarios";
import { Navigate } from "react-router-dom";
import informacionDeUsuario from "../Services/informacionDeUsuario";

function SignUp(){
    const [usuario, setUsuario] = useState({correo:"", contrasena:"", nombre:"", jerarquia:""});
    const [navegar, setNavegar] = useState(false);

    const handleSubmit = async (event) => {
        event.preventDefault();
        const res = await registroDeUsuarios(usuario);
        console.log(res);
        setNavegar(true);
    }

    if(navegar){
        if(usuario.jerarquia === "alumno"){
            return <Navigate to={`/alumno/${usuario.correo}`}/>
        }
        return <Navigate to={`/asesor/${usuario.correo}`}/>
    }

    return(
        <div>
            <form onSubmit={handleSubmit}>
                <label>
                    Correo:
                    <input type="text" value={usuario.correo} onChange={e => setUsuario({...usuario, correo:e.target.value})}/>
                </label>
                <label>
                    Contrasena:
                    <input type="text" value={usuario.contrasena} onChange={e => setUsuario({...usuario, contrasena:e.target.value})}/>
                </label>
                <label>
                    Nombre:
                    <input type="text" value={usuario.nombre} onChange={e => setUsuario({...usuario, nombre:e.target.value})}/>
                </label>
                <label>
                    Jerarquia:
                    <select value={usuario.jerarquia} onChange={e => setUsuario({...usuario, jerarquia:e.target.value})}>
                        <option value="asesor">Asesor</option>
                        <option value="alumno">Alumno</option>
                    </select>
                </label>
                <input type="submit" value="Enviar"/>
            </form>
        </div>
    )
}

export default SignUp;