const API_URL = "http://localhost:3001/proyectoferia/postProyectoPorFeria";

async function postProyectoPorFeria(proyecto_por_feria){
    try{
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "id": {
                    "proyecto_id": proyecto_por_feria.proyecto_id,
                    "feria_id": proyecto_por_feria.feria_id
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

export default postProyectoPorFeria;