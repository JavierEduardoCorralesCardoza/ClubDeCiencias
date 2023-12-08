const API_URL = "http://localhost:3001/asesores/getAsesores";

async function getAsesores(){
    try{
        const response = await fetch(API_URL, {
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

export default getAsesores;