import React from "react";
import { Link } from "react-router-dom";

function Home(){
    return(
        <div>
            <Link to="/signup">Registro</Link>
            <Link to="/signin">Ingreso</Link>
        </div>
    )
}

export default Home;