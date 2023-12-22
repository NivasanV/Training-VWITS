import { Fragment, useState } from "react";
const SearchStudent = (props) => {
    const [attempts, setAttempts] = useState('');
    const [isDisabled, setIsDisabled] = useState(true);

    const handleAttemptChange = (e) => {
        setAttempts(e.target.value);
        setIsDisabled(!e.target.value);
    };

    const handleSubmit = () => {
        console.log(attempts);
        props.serachByAttempts(attempts);
    };

    return (
        <Fragment>
            <label>Number of Attempts:</label>
            <input className="search" type="number" value={attempts} onChange={handleAttemptChange} placeholder="Search" />
            <button className="btn-search" disabled={isDisabled} onClick={handleSubmit}>submit</button>
        </Fragment>
    );
}

export default SearchStudent;