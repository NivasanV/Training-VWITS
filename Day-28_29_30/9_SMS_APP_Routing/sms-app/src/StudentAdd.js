import { Fragment, useState } from "react";


const StudentAdd = (props) => {

    const [student, setStudent] = useState({
        name: "",
        numberOfAttempts: 0,
        percentage: 0,
        subjectsLearning: ["React"]
    })

    const performSave = (e) => {
        e.preventDefault();
        props.addStudent(student);
    }

    return (
        <Fragment>
            <h3>Add New Student</h3>
            <form onSubmit={performSave}>
                <input type="text" placeholder="Name" onChange={e =>
                    setStudent({ ...student, name: e.target.value })
                } />
                <br />
                <input type="number" placeholder="Attempts" onChange={e =>
                    setStudent({ ...student, numberOfAttempts: e.target.value })
                } />
                <br />
                <input type="number" placeholder="percentage" onChange={e =>
                    setStudent({ ...student, percentage: e.target.value })
                } />
                <br />

                <input type="submit" value="Add" />
            </form>
        </Fragment>
    );
}
export default StudentAdd;