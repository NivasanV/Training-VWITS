import { Fragment, useEffect, useState } from "react";
import './StudentList.css'
import Student from "./Student";
import SearchStudent from "./SearchStudent";
import StudentUpdate from "./StudentUpdate";
import { createNewStudent, deleteByPrimaryKey, fetchAllStudent, updateStudentByRollNo } from "./service/StudentRestService";
import StudentAdd from "./StudentAdd";
const StudentList = () => {


    // useState is a built-in react hook which returns an array
    // first element of the array is modified state
    // second element is a function to modify the state
    // useStae accepts value which is initial state
    // to change the state you must call the function which was return by
    //useState function(setStudents)
    const [students, setStudents] = useState({});
    const [message, setMessage] = useState("");
    // following statefull variable is used to conditionally show update component
    const [showUpdateForm, setShowUpdateForm] = useState(false);
    const [selectedStudent, setSelectedStudent] = useState(
        {
            "rollno": 0,
            "name": "",
            "numberOfAttempts": 0,
            "percentage": 0,
            "subjectsLearning": []
        }
    );

    // following lines are to add the student
    const [showAddForm, setShowAddForm] = useState(false);

    const addStudent = (newStudent) => {
        createNewStudent(newStudent).then(res => {
            if (res.status == 201) {
                console.log(newStudent);
                setStudents([...students, newStudent]);
                setShowAddForm(false);
            }
            else {
                setMessage("Error occured try Again :(")
            }
        });
    }

    // useEffect is a built-in hook used by react 
    // this hook is used to perform an operation based on the values mentioned as second argument
    // meaning fisrt arrow function is executed
    //if there are changes in the values given in array as second argument
    // officially called it as this hook allow you to perform side effect function
    // Example: fecting the data from Server
    useEffect(() => {
        fetchAllStudent().then((res) => {
            setStudents(res.data);
        })
    }, []);

    // following component is called by child component when user clicks on updtae button
    // this function is resposible for changing the value of showUpdateForm variable
    const showUpdate = (s) => {
        setShowUpdateForm(true);
        console.log(s);
        setSelectedStudent(s);
    }

    const doUpdate = (updatedStudent) => {
        // make a REST call to web service
        updateStudentByRollNo(updatedStudent).then(res => { // for sever
            // checking appropriate status code from server
            if (res.status == 200) {
                // following things for client side based on the response from the server
                let modifiedStudents = students.map(student => {
                    if (student.rollno === updatedStudent.rollno) {
                        return {
                            ...student,
                            numberOfAttempts: updatedStudent.numberOfAttempts,
                            percentage: updatedStudent.percentage
                        };
                    }
                    return student;
                });
                setStudents(modifiedStudents);
                setShowUpdateForm(false);
            }
        });
    }


    // Following function will be called from child component when we recieve the
    // the confirmstion from user
    const deleteByRollno = (rollno) => {
        console.log(rollno);
        //students = students.filter( s => s.rollno != rollno)
        //setStudents(students.filter(s => s.rollno !== rollno));
        //setMessage("Student Deleted with Rollno " + rollno);

        // make a call to webservice to delete the record
        // if server takes longer period of time to complete the process it si responsiblity of
        //client some processing is happening
        // this will make better user experience
        deleteByPrimaryKey(rollno).then(res => {
            console.log(res.status);

            // its important for client application to check the http status code
            //and then accordingly take appropriate action on the client side
            // for which it mandatory that server respond with appropriate status code
            if (res.status == 204 || res.status == 200) {
                // TODO improve server to return appropriate status code
                setStudents(students.filter(s => s.rollno !== rollno));
                setMessage("Student Deleted with Rollno " + rollno);
            }
            else {
                setMessage('Some error try again :(');
            }
        }
        );
    }

    const serachByAttempts = (atmpts) => {
        setStudents(students.filter(s => s.noOfAttempts <= atmpts));
    }




    return (students.length > 0 ? ( //  using ternary operator to show the data conditionaly
        <Fragment>
            <h2><i>Students List</i></h2>
            <div className="table-top">
                <button className="btn-add" onClick={() => setShowAddForm(true)}>Add Student</button>
                <span><SearchStudent serachByAttempts={serachByAttempts} /></span>
            </div>
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
            {showAddForm && <StudentAdd addStudent={addStudent} />}
        </Fragment>
    )
        :
        (<h2>no data</h2>)
    )
}

export default StudentList;