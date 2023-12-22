let data = [
    {
        "rollno": 1,
        "name": "Pranav",
        "noOfAttempts": 2,
        "percentage": 92.3,
        "subjectsLearning": ["Java", "React"]
    },
    {
        "rollno": 2,
        "name": "Prajwal",
        "noOfAttempts": 2,
        "percentage": 82.7,
        "subjectsLearning": ["Spring", "React"]
    },
    {
        "rollno": 3,
        "name": "Sanket",
        "noOfAttempts": 1,
        "percentage": 91.9,
        "subjectsLearning": ["PHP", "React"]
    },
    {
        "rollno": 4,
        "name": "Navin",
        "noOfAttempts": 3,
        "percentage": 85.3,
        "subjectsLearning": ["Vue", "Spring"]
    },
    {
        "rollno": 5,
        "name": "Jayes",
        "noOfAttempts": 4,
        "percentage": 44.3,
        "subjectsLearning": ["Java", "Python"]
    }
];

const findAllStudents = () => {
    return data;
}
export { findAllStudents };
