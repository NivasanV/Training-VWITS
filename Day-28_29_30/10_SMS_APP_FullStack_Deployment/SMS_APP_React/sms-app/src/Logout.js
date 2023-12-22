import { Navigate } from "react-router-dom";

const Logout = () =>{
    sessionStorage.removeItem('isUserLoggedIn');

    return <Navigate to="/login"></Navigate>
}
export default Logout;