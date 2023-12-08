const API_URL = "http://localhost:3001/alumno/infoAlumno";

async function informacionDeUsuario(id){
    try{
        const response = await fetch(`${API_URL}?id=${encodeURIComponent(id)}`, {
            method: "GET",
            headers: {
                'Content-Type': 'application/json'
            }
        });

        const data = await response.json();
        console.log(data);
        return data;
    }
    catch(err){
        console.log(err)
        throw err;
    }
}

export default informacionDeUsuario;