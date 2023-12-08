const API_URL = "http://localhost:3001/alumnoproyecto/postAlumnoPorProyecto";

async function postAlumnoPorFeria(alumno_por_feria){
    try{
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "id": {
                    "alumno_correo": alumno_por_feria.alumno_correo,
                    "feria_id": alumno_por_feria.feria_id
                },
                "premio": alumno_por_feria.premio,
                "patrocinador": alumno_por_feria.patrocinador,
                "apoyo_otorgado": alumno_por_feria.apoyo_otorgado
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

export default postAlumnoPorFeria;