import { Fragment } from "react"
import { Link } from "react-router-dom"

const Menu = () => {

    return (
        <Fragment>
            <nav>
                <Link to='/login'>Login</Link>
                <Link to='/students'>Student</Link>
                <Link to="/logout">logout</Link>
            </nav>
        </Fragment>
    )
}

export default Menu