const mongoose = require('mongoose')

const props = require('../config/db_constant')

const url = `mongodb://${props.DB_HOST}:${props.DB_PORT}/${props.DB_NAME}`

mongoose.connect(url)
const studentSchema = new mongoose.Schema({
    rollno: Number,
    name: String,
    numberOfAtempts: Number,
    percentage: Number
})
const student = mongoose.model(props.COLLECTION_NAME, studentSchema)

module.exports = student