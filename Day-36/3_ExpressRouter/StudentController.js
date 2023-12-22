const express = require('express')
const db = require('./db_connection')

const router = express.Router()
const con = db.con

router.get("/",(req, res) => {
    // fetch the data from the database and send it to response
    con.query('SELECT * FROM tbl_student', (err, result) => {
        if (err) {
            console.log("Not found")
        }
        else {
            let students = result
            students.subjectsLearning = ['Express']
            res.status(200)
                .contentType('application/json')
                .send(students)
        }
    })
})

router.get("/:rollno", (req, res) => {
    // fetch the data for a specific student from the Db and send it in response
    const rollno = req.params.rollno;
    con.query('SELECT * FROM tbl_student WHERE rollno=?', [rollno], (err, result) => {
        if (err || result == '') {
            console.log("Not Found")
            res.status(404)
                .contentType('text/plain')
                .send('Student with rollno ' + rollno + ' not exist')
        }
        else {
            res.status(200)
                .contentType('application/json')
                .send(result[0])
        }
    })
})

router.post("/", (req, res) => {
    // in order to insert record we first recive the object from the user
    // to fecth the obje from request object we install third-party library
    // know as body-parser
    const std = req.body
    con.query('INSERT INTO tbl_student VALUES(?,?,?,?)',
        [std.rollno, std.st_name, std.number_of_attempts, std.percentage],
        (err, result) => {
            if (err) console.log("Error")
            else {
                console.log(req.body) // req.body will fetch request body
                res.status(201)
                    .contentType('application/json')
                    .send("Inserting student " + req.body)
            }
        }
    )
})

router.put("/", (req, res) => {
    const std = req.body
    con.query('UPDATE tbl_student SET st_name=?,number_of_attempts=?,percentage=? WHERE rollno=?',
        [std.st_name, std.number_of_attempts, std.percentage, std.rollno],
        (err, result) => {
            if (err) console.log("Error")
            else {
                console.log(req.body) // req.body will fetch request body
                res.status(200)
                    .contentType('text/plain')
                    .send("Updated student " + req.body)
            }
        }
    )
})

router.delete("/:rollno", (req, res) => {
    const rollno = req.params.rollno;
    con.query('DELETE FROM tbl_student WHERE rollno=?', [rollno], (err, result) => {
        if (err) {
            console.log("Error")
            res.status(500)
                .contentType('text/plain')
                .send('Opration not done ')
        }
        else {
            if (result.affectedRows > 0) {
                res.status(204)
                    .contentType('text/plain')
                    .send("Student deleted with rollno " + rollno)
            }
            else {
                res.status(404)
                    .contentType('text/plain')
                    .send('Student with rollno ' + rollno + ' not exist')
            }
        }
    })
})

module.exports = router