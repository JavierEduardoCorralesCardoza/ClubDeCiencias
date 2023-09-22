import React from 'react'
import { Link } from 'react-router-dom';

function LogIn(){
    return(
        <div>
            <h2>Log In</h2>
            <div>
                <label>Usuario: <input type='text'/></label> 
            </div>
            <br></br>
            <div>
                <label>Contaseña: <input type='password'/></label> 
            </div>
            <br></br>
            <div>
                <Link to="/inicio">Inicio</Link>
            </div>
        </div>
    );
}

export default LogIn;