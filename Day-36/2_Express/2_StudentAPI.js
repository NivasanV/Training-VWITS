const express = require('express')
const mysql = require('mysql')
const bodyParser = require('body-parser')

const app = express()
const port = 5000
app.use(bodyParser.json()) // This is to tell body parser we are intrested to fetching
// JSON data from request body

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    port: 3306,
    database: "sms_springboot_jpa_db"
})

con.connect((err) => {
    if (err) console.log(err)
    else console.log("DB Connected")
})

app.get("/api/student", (req, res) => {
    // fetch the data from the database and send it to response
    con.query('SELECT * FROM tbl_student', (err, result) => {
        if (err) {
            console.log("Not found")
        }
        else {
            res.status(200)
                .contentType('application/json')
                .send(result)
        }
    })
})

app.get("/api/student/:rollno", (req, res) => {
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

app.post("/api/student", (req, res) => {
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

app.put("/api/student", (req, res) => {
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

app.delete("/api/student/:rollno", (req, res) => {
    const rollno = req.params.rollno;
    con.query('DELETE FROM tbl_student WHERE rollno=?', [rollno], (err, result) => {
        if (err) {
            console.log("Error")
            res.status(500)
                .contentType('text/plain')
                .send('Opration not done ')
        }
        else {
            if (result.updatedRows > 0) {
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

app.listen(port, (err) => {
    if (err) console.log('Server Not Started')
    else console.log('Server is running on http://localhost:' + port)
})