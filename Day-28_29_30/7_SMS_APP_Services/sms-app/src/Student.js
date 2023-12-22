import { Fragment } from "react";
import "./Student.css";

const Student = (props) => {

    const handleDelete = () => {
        const confirmDelete = window.confirm("Are you sure to delete ?")
        if (confirmDelete) {
            //alert("Deleting student with rollno " + props.student.rollno);
            props.deleteStudent(props.student.rollno);
        }
    }

    const handleUpdate = () => {
        props.updateStudent(props.student); // this will call function in parent component showUpdate
    }

    return (
        <Fragment>
            <tr>
                <td>{props.student.rollno}</td>
                <td>{props.student.name}</td>
                <td>{props.student.noOfAttempts}</td>
                <td>{props.student.percentage}</td>
                <td>
                    <ul>
                        {
                            props.student.subjectsLearning.map((sub, i) => (
                                <li key={i}>{sub}</li>
                            ))
                        }
                    </ul>
                </td>
                <td className="action">
                    <button className="btn-delete" onClick={handleDelete}>Delete</button>
                    <button className="btn-update" onClick={handleUpdate}>Update</button>
                </td>
            </tr>
        </Fragment>
    )
}

export default Student;