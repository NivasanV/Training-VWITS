import { Fragment, useState } from "react";

const StudentUpdate = (props) => {

    const [student, setSudent] = useState(props.student);

    const performUpdate = (e) => {
        e.preventDefault();
        console.log(student);
        props.doUpdate(student);
    }

    return (
        <Fragment>
            <form onSubmit={performUpdate}>
                <label htmlFor="rollno">Rollno:</label>
                <input type="number" id="rollno" value={student.rollno} readOnly />
                <br />
                <label htmlFor="name">Name:</label>
                <input type="text" id="name" value={student.name} />
                <br />
                <label htmlFor="attempts">Attempts:</label>
                <input type="number" id="attempts" value={student.noOfAttempts} onChange={
                    e => setSudent({ ...student, noOfAttempts: e.target.value })
                } />
                <br />
                <label htmlFor="percentage">Percentage:</label>
                <input type="number" id="percentage" value={student.percentage} onChange={
                    e => setSudent({ ...student, percentage: e.target.value })
                } />
                <br />

                <button type="submit">Update</button>
            </form>
            <br />
        </Fragment>
    );
}

export default StudentUpdate;