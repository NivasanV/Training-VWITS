import { Fragment, useState } from "react";

const Login = () => {
    const [isValid, setIsValid] = useState(true);

    const check = (ev) => {
        let username = ev.targent.value;
        if(username.length<4){
            setIsValid(false);
        }
    }
    return ( 
        <Fragment>
            <form>
                <label htmlFor="username">Username</label>
                <input type="text" id="username" className={isValid?'valid':'invalid'}
                onChange={check} />
                <br />
                <input type="button" value="Login" />
            </form>
        </Fragment>
     );
}
 
export default Login;