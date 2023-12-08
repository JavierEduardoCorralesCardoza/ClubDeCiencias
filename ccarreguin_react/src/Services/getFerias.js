const API_URL = "http://localhost:3001/ferias/getFerias";

async function getFerias(){
    try{
        const response = await fetch(`${API_URL}`, {
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

export default getFerias;