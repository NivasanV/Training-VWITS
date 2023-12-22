const express = require('express')
const mongoose = require('mongoose')

const props = require('../config/app_constant')
const student = require('../model/student')

const router = express.Router()

router.get("/", (req, res) => {
    // fetch the data from the database and send it to response
    student.find().then(students => {
        res.status(200)
            .contentType(props.JS0N_TYPE)
            .send(students)
    })
})

router.get("/:rollno", (req, res) => {
    // fetch the data for a specific student from the Db and send it in response
    const rollno = req.params.rollno
    student.findOne({"rollno": rollno})
        .then(student => {
            res.status(200)
                .contentType(props.JS0N_TYPE)
                .send(student)
        })
})

router.post("/", (req, res) => {
    // in order to insert record we first recive the object from the user
    // to fecth the obje from request object we install third-party library
    // know as body-parser
    const newStudent = new student(req.body)
    newStudent.save().then(result => {
        console.log(req.body) // req.body will fetch request body
        res.status(201)
            .contentType(props.JS0N_TYPE)
            .send("Inserting student " + req.body)
    })
})

router.put("/", (req, res) => {
    const student = req.body
    const rollno = student.rollno
    student.findOneAndUpdate({ "rollno": parseInt(rollno) }, { $set: student })
        .then(result => {
            res.status(200)
                .contentType('text/plain')
                .send("Updated student " + req.body)
        })
})

router.delete("/:rollno", (req, res) => {
    const rollno = req.params.rollno;
    student.findOneAndDelete({ "rollno": parseInt(rollno) })
        .then(student => {
            res.status(204)
                .contentType('text/plain')
                .send("Student deleted with rollno " + student)
        })
})

module.exports = router