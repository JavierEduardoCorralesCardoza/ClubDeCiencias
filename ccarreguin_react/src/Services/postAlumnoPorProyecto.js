const API_URL = "http://localhost:3001/alumnoproyecto/postAlumnoPorProyecto";

async function postAlumnoPorProyecto(alumno_por_proyecto){
    try{
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "id": {
                    "alumno_correo": alumno_por_proyecto.alumno_correo,
                    "proyecto_id": alumno_por_proyecto.proyecto_id
                }
            })
        });

        console.log('Status:', response.status);

        if(response.status != 201){
            return null;
        }
        const data = await response.json();
        return data;
    }
    catch(err){
        console.error("ERROR:", err);
        throw err;
    }
}

export default postAlumnoPorProyecto;