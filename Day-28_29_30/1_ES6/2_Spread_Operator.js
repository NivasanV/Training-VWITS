let arr = [10, 20];
let a = [...arr]; // copy the existing array to new array
console.log(a);

a = [...arr, 30]; // copy the existing array to new array with additional element
console.log(a);

let student = {
    "rollno":1,
    "name":"Pranav",
    "noOfAttempts":1,
    "percentage":92.3,
    "subjectsLearning":["Java", "React"]
};

let newStudent = {...student}; // copy existing object into new object
console.log(newStudent);

let updatedStudent = {...student, noOfAttempts:2} // copy existing object into new object
console.log(updatedStudent);

let students = [
    {
        "rollno":2,
        "name":"nivasan",
        "noOfAttempts":1,
        "percentage":82.3,
        "subjectsLearning":["Java", "React"]
    },
    {
        "rollno":3,
        "name":"Sanket",
        "noOfAttempts":2,
        "percentage":91.3,
        "subjectsLearning":["Angular", "React"]
    }
];

let modifiedStudents = [...students, newStudent];
console.log(modifiedStudents); // copying existing arry into new and adding a new element

// modifu number of attempts for student whise rollno is 2
// NOTE: use map function

let s = modifiedStudents.map(stud => {
    if(stud.rollno == 2){
        return {...student, noOfAttempts:100};
    }
    return student;
});
console.log(s);

// Delete a student whose rollno is 2
// use filter()

s = students.filter(
    stud => stud.rollno !== 2
);
console.log(s);