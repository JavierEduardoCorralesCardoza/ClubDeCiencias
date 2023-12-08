import React, { useEffect, useState } from "react";
import informacionDeUsuario from "../Services/informacionDeUsuario";
import { Link, useLocation, useParams } from "react-router-dom";

function Alumno(){

    const [alumno, setAlumno] = useState(null)
    const { id } = useParams()
    const location = useLocation();

    useEffect(() => {

        informacionDeUsuario(id)
        .then(data => {
            setAlumno(data);
        })
        .catch(err => {
            console.error(err);
        });

    }, []);

    if (!alumno) {
        return <div>Cargando...</div>;
    }

    return(
        <div>
            <h1>Alumno</h1>
            <div>
                <Link to={location.pathname+"/registro"}>Registro de Feria</Link>
            </div>
            <div>
                <p>{alumno.id_alumno}</p>
                <p>{alumno.nombre_alumno}</p>
                <p>{alumno.correo_alumno}</p>
                <p>{alumno.imagen_alumno}</p>
            </div>
            <div>
                {alumno.ferias && alumno.ferias.length > 0 ? (
                    <div>
                        <h2>Ferias</h2>
                        {alumno.ferias.map((feria, index) => (
                            <p key={index}>{feria}</p>
                        ))}
                    </div>
                ) : (
                    <p>No hay ferias disponibles.</p>
                )}
            </div>
        </div>
    )
}

export default Alumno;