const express = require('express')
const bodyParser = require('body-parser') // npm install body-parser
const studentRouter = require('./StudentController')
const cors = require('cors') // npm install cors

const app = express()
const port = 5000

app.use(bodyParser.json())
app.use(cors()) // This is to tell set the header needed for CORS
app.use('/api/student', studentRouter)

app.listen(port, (err) => {
    if (err) console.log('Server Not Started')
    else console.log('Server is running on http://localhost:' + port)
})