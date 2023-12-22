import { Fragment, useState } from "react";
import "./Login.css"
import { useNavigate } from "react-router-dom";

const Login = () => {
    // folloeing function is responsble for fetching value of username filed
    //by handling an event
    //NOTE: this Tradition and Old approach of writting a seperate function
    let handleUsernameChange = (ev) => {
        //console.log(ev.target.value);
        setUsername(ev.target.value);
    }

    const [message, setMessage] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [msgColor, setMsgColor] = useState("");
    const navigate = useNavigate(); // use navigate is used to

    let handelSubmit = (ev) => {
        ev.preventDefault(); // this is to avoid form submission on server
        // so that page is not reloaded
        if (username === "admin" && password === "admin") {
            sessionStorage.setItem('isUserLoggedIn',true);
            setMessage("Logged in successful");
            setMsgColor("success");
            navigate('/students')
        }
        else {
            setMessage("Login failed")
            setMsgColor("fail");
        }
    }

    return (
        <Fragment>
            <h2><i>Login Form</i></h2>
            <form onSubmit={handelSubmit} className="login-form">
                <input type="text" onChange={handleUsernameChange} placeholder="username" />
                <br />
                <input type="password" onChange={(ev) => setPassword(ev.target.value)} placeholder="password" />
                <br />
                <input className="btn-login" type="submit" value="Login" />
            </form>
            <p className={msgColor}>{message}</p>
        </Fragment>
    );
}

export default Login;