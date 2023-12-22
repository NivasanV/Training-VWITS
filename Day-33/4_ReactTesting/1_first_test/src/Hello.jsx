import { Fragment } from "react";

const Hello = (props) => {
    return (
        <Fragment>
            <h1>Welcome</h1>
            <p>{props.name}</p>
        </Fragment>
    )
}
 
export default Hello;