import React, { useEffect, useState } from "react";
import getProyectosDeAlumno from "../Services/getProyectosDeAlumno";
import { useParams } from "react-router-dom";
import getFerias from "../Services/getFerias";
import postAlumnoPorProyecto from "../Services/postAlumnoPorProyecto";
import postProyectoPorFeria from "../Services/postProyectoPorFeria";
import postAlumnoPorFeria from "../Services/postAlumnoPorFeria";

function RegistroFeria(){
    const { id } = useParams()
    const [ferias, setFerias] = useState([]);
    const [proyectos, setProyectos] = useState([]);
    const [alumno_por_proyecto, setAlumno_por_proyecto] = useState({id: {alumno_correo: id, proyecto_id: null}});
    const [proyecto_por_feria, setProyecto_por_feria] = useState({id: {proyecto_id: null, feria_id: null}});
    const [alumno_por_feria, setAlumno_por_feria] = useState({id: {alumno_correo: id, feria_id: null}, premio: "", patrocinador: "", apoyo_otrogado: 0});

    const handleSubmit = async (event) => {
        event.preventDefault();
        postAlumnoPorProyecto(alumno_por_proyecto);
        postProyectoPorFeria(proyecto_por_feria);
        postAlumnoPorFeria(alumno_por_feria);
    }

    const cambioAtributo = (e, setter, object, atribute) => {
        setter({...object, [atribute]: e.target.value})
    }

    useEffect(() => {
        getProyectosDeAlumno(id)
        .then(data => setProyectos(data))
        .catch(err => console.error(err));

        getFerias()
        .then(data => setFerias(data))
        .catch(err => console.error(err))
    }, []);

    return(
        <div>
            <form onSubmit={handleSubmit}>
                <label>
                    Feria:
                    <select onChange={ e => {
                        cambioAtributo(e, setProyecto_por_feria, proyecto_por_feria, proyecto_por_feria.id.feria_id);
                        cambioAtributo(e, setAlumno_por_feria, alumno_por_feria, alumno_por_feria.id.feria_id);
                    }}>
                        {ferias.map((item, index) => 
                            <option key={index} value={item.id_feria}>{item}</option>
                        )}
                    </select>
                </label>
                <label>
                    Proyecto:
                    <select onChange={ e => {
                        cambioAtributo(e, setAlumno_por_proyecto, alumno_por_proyecto, alumno_por_proyecto.id.proyecto_id);
                        cambioAtributo(e, setProyecto_por_feria, proyecto_por_feria, proyecto_por_feria.id.proyecto_id);
                    }}>
                        {proyectos.map((item, index) => 
                            <option key={index} value={item.id_proyecto}>{item}</option>
                        )}
                    </select>
                </label>
                <label>
                    Premio:
                    <input type="text" value={alumno_por_feria.premio} onChange={ e => {
                        cambioAtributo(e, setAlumno_por_feria, alumno_por_feria, alumno_por_feria.premio)
                    }}/>
                </label>
                <label>
                    Apoyo otorgado:
                    <input type="number" value={alumno_por_feria.apoyo_otrogado} onChange={ e => {
                        cambioAtributo(e, setAlumno_por_feria, alumno_por_feria, alumno_por_feria.apoyo_otrogado)
                    }}/>
                </label>
                <label>
                    Patrocinador:
                    <input type="text" value={alumno_por_feria.patrocinador} onChange={ e => {
                        cambioAtributo(e, setAlumno_por_feria, alumno_por_feria, alumno_por_feria.patrocinador)
                    }}/>
                </label>
                <input type="submit" value="Registrar"/>
            </form>
        </div>
    )
}

export default RegistroFeria;