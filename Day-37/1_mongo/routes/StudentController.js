const express = require('express')
const mongodb = require('mongodb')
const props = require('../config/constant')

const router = express.Router()

let db
const url = `mongodb://127.0.0.1:${props.DB_PORT}/student_db`
const mongoClient = mongodb.MongoClient
mongoClient.connect(url).then((connection) => {
    db = connection.db()
}).catch(err => console.log(err))
const COLLECTION_NAME = 'students'
const JS0N_TYPE = 'application/json'

router.get("/", (req, res) => {
    // fetch the data from the database and send it to response
    db.collection(COLLECTION_NAME).find().toArray().then(students => {
        res.status(200)
            .contentType(JS0N_TYPE)
            .send(students)
    })
})

router.get("/:rollno", (req, res) => {
    // fetch the data for a specific student from the Db and send it in response
    db.collection(COLLECTION_NAME).findOne({ "rollno": parseInt(req.params.rollno) })
        .then(student => {
            res.status(200)
                .contentType(JS0N_TYPE)
                .send(student)
        })
})

router.post("/", (req, res) => {
    // in order to insert record we first recive the object from the user
    // to fecth the obje from request object we install third-party library
    // know as body-parser
    const student = req.body
    db.collection(COLLECTION_NAME).insertOne(student).then(result => {
        console.log(req.body) // req.body will fetch request body
        res.status(201)
            .contentType(JS0N_TYPE)
            .send("Inserting student " + req.body)
    })
})

router.put("/", (req, res) => {
    const student = req.body
    const rollno = student.rollno
    db.collection(COLLECTION_NAME).findOneAndUpdate({ "rollno": parseInt(rollno) }, { $set: student })
        .then(result => {
            res.status(200)
                .contentType('text/plain')
                .send("Updated student " + req.body)
        })
})

router.delete("/:rollno", (req, res) => {
    const rollno = req.params.rollno;
    db.collection(COLLECTION_NAME).findOneAndDelete({ "rollno": parseInt(rollno) })
        .then(student => {
            res.status(204)
                .contentType('text/plain')
                .send("Student deleted with rollno " + student)
        })
})

module.exports = router