import { Fragment, useState } from "react";
import './StudentList.css'
import Student from "./Student";
import SearchStudent from "./SearchStudent";
import { findAllStudents } from "./service/StudentDataService";
import StudentUpdate from "./StudentUpdate";
const StudentList = () => {

    let data = findAllStudents();

    // useState is a built-in react hook which returns an array
    // first element of the array is modified state
    // second element is a function to modify the state
    // useStae accepts value which is initial state
    // to change the state you must call the function which was return by
    //useState function(setStudents)
    const [students, setStudents] = useState(data);
    const [message, setMessage] = useState("");
    // following statefull variable is used to conditionally show update component
    const [showUpdateForm, setShowUpdateForm] = useState(false);
    const [selectedStudent, setSelectedStudent] = useState(
        {
            "rollno": 0,
            "name": "",
            "noOfAttempts": 0,
            "percentage": 0,
            "subjectsLearning": []
        }
    );

    // following component is called by child component when user clicks on updtae button
    // this function is resposible for changing the value of showUpdateForm variable
    const showUpdate = (s) => {
        setShowUpdateForm(true);
        console.log(s);
        setSelectedStudent(s);
    }

    const doUpdate = (updatedStudent) => {
        let modifiedStudents = students.map(student => {
            if (student.rollno == updatedStudent.rollno) {
                return {
                    ...student,
                    noOfAttempts: updatedStudent.noOfAttempts,
                    percentage: updatedStudent.percentage
                };
            }
            return student;
        });
        setStudents(modifiedStudents);
        setShowUpdateForm(false);
    }


    // Following function will be called from child component when we recieve the
    // the confirmstion from user
    const deleteByRollno = (rollno) => {
        console.log(rollno);
        //students = students.filter( s => s.rollno != rollno)
        setStudents(students.filter(s => s.rollno !== rollno));
        setMessage("Student Deleted with Rollno " + rollno);
    }

    const serachByAttempts = (atmpts) => {
        setStudents(students.filter(s => s.noOfAttempts <= atmpts));
    }



    return (students.length > 0 ? ( //  using ternary operator to show the data conditionaly
        <Fragment>
            <SearchStudent serachByAttempts={serachByAttempts} />
            <table align="center">
                <thead>
                    <tr>
                        <th>Roll No</th>
                        <th>Name</th>
                        <th>Attemps</th>
                        <th>Percentage</th>
                        <th>Subjects</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        // in the folowing line we are passing custom property student wuth value 's'
                        // to a component student
                        // because this component returnts within mao function it will be shown
                        // number of times based on number elements in the array students
                        // we are passing a property deleteStudent which is referring to the a function
                        // this allows child componenty to call this function & pass data from child
                        // to child by using the properties
                        students.map(s => (
                            <Student student={s} key={s.rollno} deleteStudent={deleteByRollno}
                                updateStudent={showUpdate} />
                        ))
                    }
                </tbody>
            </table>
            <p>{message}</p>
            {showUpdateForm && <StudentUpdate student={selectedStudent} doUpdate={doUpdate} />}
        </Fragment>
    )
        :
        (<h2>no data</h2>)
    )
}

export default StudentList;