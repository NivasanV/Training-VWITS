const express = require('express')
const app = express()
const PORT = 5000

app.get("/api/student", (req, res) => {
    res.send("Fetchig all students")
})

app.get("/api/student/1", (req, res) => {
    res.send("Fetchig student by rollno")
})

app.post("/api/student", (req, res) => {
    res.send("Inserting student")
})

app.put("/api/student", (req, res) => {
    res.send("updating student")
})

app.delete("/api/student", (req, res) => {
    res.send("Deleting student")
})

app.listen(PORT, (err) => {
    if(err){
        console.log('Server Not Started')
    }
    else{
        console.log('Server Started on PORT 5000')
    }
})