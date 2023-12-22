import { Fragment, useState } from "react";
import axios from "axios";
const Hello = () => {

    const BASE_URL = 'https://potential-winner-vrw5r5465pjfwgxp-8080.app.github.dev/hello';

    const [msg, setMsg] = useState('Hi');

    const handelClick = () => {
        axios.get(BASE_URL).then( 
            res => console.log(res)
        )
    }

    return (
        <Fragment>
            <button onClick={handelClick}>Get Hello World</button>
            <p>{msg}</p>
        </Fragment>
    );
}

export default Hello;