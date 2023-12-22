import './App.css';
import Header from './Header';
import Footer from './Footer';
import StudentList from './StudentList';
import Login from './Login';

function App() {
  return (
    <div className="App">
      {/**
      * In the following line heading is a property of header component
      */
      }
      <Header heading="Student Management Application" />
      <Login />
      <StudentList />
      <Footer content="vwits copyright @ 2023" />
    </div>
  );
}

export default App;
