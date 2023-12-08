import React, { useEffect, useState } from "react";
import getAsesores from "../Services/getAsesores";
import { useParams } from "react-router-dom";

function RegistroProyecto(){
    const { id } = useParams();
    const [asesores, setAsesores] = useState([]);
    const [proyecto, setProyecto] = useState({nombre_proyecto: "", categoria: "", asesor: ""});
    const [asesor, setAsesor] = useState(null);

    useEffect(() => {
        getAsesores()
        .then(data => setAsesores(data))
        .catch(err => console.error(err));
    }, []);

    const cambioAtributo = (e, setter, object, atribute) => {
        setter({...object, [atribute]: e.target.value})
    }

    const handleSubmit = async (event) => {
    }

    return(
        <div>
            <h1>Regsitro de Proyecto</h1>
            <form onSubmit={handleSubmit}>
                <label>
                    Nombre del proyecto:
                    <input type="text" value={proyecto.nombre_proyecto} onChange={ e => cambioAtributo(e, setProyecto, proyecto, "nombre_proyecto")}/>
                </label>
                <label>
                    Categoria:
                    <select value={proyecto.categoria} onChange={ e => cambioAtributo(e, setProyecto, proyecto, "categoria")}>
                        <option>categoria 1</option>
                        <option>categoria 2</option>
                        <option>categoria 3</option>
                    </select>
                </label>
                <label>
                    Asesor:
                    <select value={asesor} onChange={e => setAsesor(e.target.value)}>
                        {
                            asesores.map((item, index) => (
                                <option key={index} value={item}>{item.nombre_asesor}</option>
                            ))
                        }
                    </select>
                </label>
            </form>
            <input type="submit" value="Registrar"/>
        </div>
    )
}

export default RegistroProyecto;