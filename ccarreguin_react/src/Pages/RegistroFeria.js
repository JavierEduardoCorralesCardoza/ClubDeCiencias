import React, { useEffect, useState } from "react";
import getProyectosDeAlumno from "../Services/getProyectosDeAlumno";
import { useParams } from "react-router-dom";
import getFerias from "../Services/getFerias";

function RegistroFeria(){
    const [ferias, setFerias] = useState(null);
    const [feria, setFeria] = useState(null);
    const [proyecto, setProyecto] = useState(null);
    const [proyectos, setProyectos] = useState(null);
    const [premio, setPremio] = useState(null);
    const [patrocinador, setPatrocinador] = useState(null);
    const [apoyo, setApoyo] = useState(null);
    const { id } = useParams()

    const manejarCambio = (evento, setter) => {
        setter(evento.target.value);
    };

    const handleSubmit = async (event) => {
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
                    <select value={feria} onChange={e => manejarCambio(e, setFeria)}>
                        {ferias && ferias.map((item, index) => (
                            <option key={index} value={item}>
                                {item}
                            </option>
                        ))}
                    </select>
                </label>
                <label>
                    Proyecto:
                    <select value={proyecto} onChange={e => manejarCambio(e, setProyecto)}>
                        {proyectos && proyectos.map((item, index) => (
                            <option key={index} value={item}>
                                {item}
                            </option>
                        ))}
                    </select>
                </label>
                <label>
                    Premio:
                    <input type="text" value={premio} onChange={e => manejarCambio(e, setPremio)}/>
                </label>
                <label>
                    Patrocinador:
                    <input type="text" value={patrocinador} onChange={e => manejarCambio(e, setPatrocinador)}/>
                </label>
                <label>
                    Apoyo Otorgado:
                    <input type="number" value={apoyo} onChange={e => manejarCambio(e, setApoyo)}/>
                </label>
                <input type="submit" value="Registrar"/>
            </form>
        </div>
    )
}

export default RegistroFeria;