import React, { useState } from "react";
import ingresoDeUsuario from "../Services/ingresoDeUsuario";
import { Navigate } from "react-router-dom";

function SignIn(){
    const [auth, setAuth] = useState({id: "", contrasena: ""});
    const [ruta, setRuta] = useState(null);
    const [navegar, setNavegar] = useState(false);

    const envioForms = async (event) => {
        event.preventDefault();
        const respuesta = await ingresoDeUsuario(auth);

        if(respuesta){
            if(respuesta[1] === "alumno"){
                setRuta(`/alumno/${auth.id}`);
            }
            else{
                setRuta(`/asesor/${auth.id}`);
            }

            setNavegar(true);
        }
    }

    if(navegar){
        return <Navigate to={ruta}/>
    }

    return(
        <div>
            <form onSubmit={envioForms}>
                <label>
                    Correo:
                    <input type="text" value={auth.id} onChange={e => setAuth({...auth, id: e.target.value})}/>
                </label>
                <label>
                    Contrasena:
                    <input type="text" value={auth.contrasena} onChange={e => setAuth({...auth, contrasena: e.target.value})}/>
                </label>
                <input type="submit" value="Enviar"/>
            </form>
        </div>
    )
}

export default SignIn;