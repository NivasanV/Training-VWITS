--- MongoDB ---
    1. NoSQL Database
    2. Document based Database
    3. It stores data in JSON link format known as BSON(Binary JSON)
    4. Document is stored in Collection
    5. Collection is stored in Database
    6. In newer versions of Mongo we have to explicity download the command line which can connet
       to mongo server
    7. By default Mongo server runs on 27017

commands
    use databasename : it is used to switch db

    db.students.insert({"rollno":1, "name":"Pranav", "numberOfAtempts":1,"percentage":89})

    db.students.insertOne({"rollno":2, "name":"Sanket", "numberOfAtempts":1,"percentage":89.5})


---- Mongoose ----
    - It is Object Data Modeling (ODM) library for MongoDB
    - It allows you to deal with models
    Steps to follow:
        1. npm install mongoose
        2. const mongoose = require('mongoose')
        3. connet to the Database using url
        4. create schema
            const studentsSchema = new mongoose.Schema({
                rollno: Number,
                name: String,
                numberOfAtempts: Number,
                percentage: Number
            })
        
        5. create a model
            const student = mongoose.model('student',studentsSchema)

        6. use model object to invoke different methods based on requirement