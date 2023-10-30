import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './Pages/Home';
import SignUp from './Pages/SignUp';
import SignIn from './Pages/SignIn';
import Alumno from './Pages/Alumno';
import Asesor from './Pages/Asesor';

function App() {
  return (
    <div>
      <Router>
          <Routes>
            <Route path='/' element={<Home></Home>}/>
            <Route path='/signup' element={<SignUp></SignUp>}></Route>
            <Route path='/signin' element={<SignIn></SignIn>}></Route>
            <Route path='/alumno/:correo' element={<Alumno></Alumno>}></Route>
            <Route path='/asesor/:correo' element={<Asesor></Asesor>}></Route>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
