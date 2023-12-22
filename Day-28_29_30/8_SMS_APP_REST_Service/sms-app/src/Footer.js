import { Fragment } from "react";
import "./Footer.css"
function Footer(props) {
    return (
        <Fragment>
            <p className="Footer">{props.content}</p>
        </Fragment>
    );
}

export default Footer;