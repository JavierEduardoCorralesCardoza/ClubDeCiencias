import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import LogIn from "./Componentes/LogIn";

function App() {
  return (
    <div>
      <Router>
          <Routes>
            <Route path='/' element={<LogIn/>}/>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
