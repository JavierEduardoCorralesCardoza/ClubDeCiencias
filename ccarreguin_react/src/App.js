import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './Pages/Home';
import SignUp from './Pages/SignUp';
import SignIn from './Pages/SignIn';
import Alumno from './Pages/Alumno';
import Asesor from './Pages/Asesor';
import RegistroFeria from './Pages/RegistroFeria';
import RegistroProyecto from './Pages/RegistroProyecto';

function App() {
  return (
    <div>
      <Router>
          <Routes>
            <Route path='/' element={<Home></Home>}/>
            <Route path='/signup' element={<SignUp></SignUp>}></Route>
            <Route path='/signin' element={<SignIn></SignIn>}></Route>
            <Route path='/alumno/:id' element={<Alumno></Alumno>}></Route>
            <Route path='/asesor/:id' element={<Asesor></Asesor>}></Route>
            <Route path='/alumno/:id/registroFeria' element={<RegistroFeria></RegistroFeria>}></Route>
            <Route path='/alumno/:id/registroProyecto' element={<RegistroProyecto></RegistroProyecto>}></Route>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
