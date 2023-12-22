import Menu from "./Menu";
import './Header.css'
import { Fragment } from "react";

function Header(props) { // here props is accepting propertie
    // Whatever we return from a component i React is known as JSX
    // JSX is JavaScript XML
    // which is actually HTML contents wuth JavaScript in it
    // As name contains xml, we must make sure theat while returning whole contents
    //must be enclosed in one single tag (one parent tag).
    // Otherwise it's error
    return (
        <Fragment>
            {/**
             * in following line we are using the property heading from the app component
             */
            }
            <h1 className="toolbar">{props.heading}</h1>
            <Menu />
        </Fragment>
    )
}

export default Header;
