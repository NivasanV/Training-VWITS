let students = [
    {
        "rollno":1,
        "name":"Pranav",
        "noOfAttempts":1,
        "percentage":92.3,
        "subjectsLearning":["Java", "React"]
    },
    {
        "rollno":2,
        "name":"Sanket",
        "noOfAttempts":2,
        "percentage":90.3,
        "subjectsLearning":["Angular", "React"]
    }
];

students.map(s => {
    console.log(s);
});

students.map((s, index) => {
    console.log(s);
    console.log(index);
});