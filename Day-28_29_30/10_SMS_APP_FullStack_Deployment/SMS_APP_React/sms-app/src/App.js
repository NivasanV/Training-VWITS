import './App.css';
import Header from './Header';
import Footer from './Footer';
import StudentList from './StudentList';
import Login from './Login';
import Logout from './Logout';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { ProtectedRoute } from './ProtectedRoute';

function App() {
  return (
    <div className="App">
      {/**
      * In the following line heading is a property of header component
      */
      }
      <BrowserRouter>
        <Header heading="Student Management Application" />
        <Routes>
          <Route path='/login' element={<Login />}></Route>
          <Route path='/students' element={
            // write some logic here which checks user is logged in or not
            // if not navigate user
            <ProtectedRoute>
              <StudentList />
            </ProtectedRoute>
          }>
          </Route>
          <Route path='/logout' element={<Logout />}></Route>
        </Routes>
        <Footer content="vwits copyright @ 2023" />
      </BrowserRouter>
    </div>
  );
}

export default App;
