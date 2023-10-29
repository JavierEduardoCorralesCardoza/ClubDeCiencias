import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './Pages/Home';
import SignUp from './Pages/SignUp';
import SignIn from './Pages/SignIn';

function App() {
  return (
    <div>
      <Router>
          <Routes>
            <Route path='/' element={<Home></Home>}/>
            <Route path='/signup' element={<SignUp></SignUp>}></Route>
            <Route path='/signin' element={<SignIn></SignIn>}></Route>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
