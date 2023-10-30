const API_URL = "http://localhost:3001/home/signin";

async function ingresoDeUsuario(auth){
    try{
        const response = await fetch(`${API_URL}?correo=${encodeURIComponent(auth.correo)}&contrasena=${encodeURIComponent(auth.contrasena)}`, {
            method: "GET",
            headers: {
                'Content-Type': 'application/json'
            }
        });

        console.log("Status:", response.status);

        if(response.status !== 202){
            return null;    
        }

        const data = await response.json();
        return data;
    }
    catch(err){
        throw err;
    }
}

export default ingresoDeUsuario;