const API_URL = "http://localhost:3001/home/signup";

async function registroDeUsuarios(usuario){
    try{
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "correo": usuario.correo,
                "contrasena": usuario.contrasena,
                "nombre": usuario.nombre,
                "imagen": "Ruta/definida/luego",
                "jerarquia": usuario.jerarquia
            })
        });

        console.log('Status:', response.status);
        const data = await response.json();
        return data;
    }
    catch(err){
        console.error("ERROR:", err);
        throw err;
    }
}

export default registroDeUsuarios;