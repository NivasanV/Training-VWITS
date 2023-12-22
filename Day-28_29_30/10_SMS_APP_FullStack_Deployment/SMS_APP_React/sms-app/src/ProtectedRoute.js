import { Navigate } from "react-router-dom";

const ProtectedRoute = (props) => {

    const isUserLoggedIn = sessionStorage.getItem('isUserLoggedIn'); // Right now the value is hardcoded but it will fetch the real value
    if(isUserLoggedIn == undefined || isUserLoggedIn == ''){
        return <Navigate to="/login"></Navigate>
    }
    else{
        return <div>{props.children}</div>;
    }
}
export { ProtectedRoute }