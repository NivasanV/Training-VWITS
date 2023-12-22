import axios from 'axios';

const BASE_URL = 'http://localhost:8080/api/student'

const fetchAllStudent = () => {
    return axios.get(BASE_URL);
}

const deleteByPrimaryKey = (rollno) => {
    return axios.delete(BASE_URL + "/" + rollno);
}

const updateStudentByRollNo = (s) => {
    return axios.put(BASE_URL + "/" + s.rollno, s);
}

const createNewStudent = (s) => {
    return axios.post(BASE_URL, s);
}
export {
    fetchAllStudent,
    deleteByPrimaryKey,
    updateStudentByRollNo,
    createNewStudent
}