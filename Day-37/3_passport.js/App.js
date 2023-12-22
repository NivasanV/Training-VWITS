const express = require('express')
const cors = require('cors')
const cookieSession = require('cookie-session')
const passport = require('passport')

const setup = require('./credentialSetupt')
const router = require('./routes')

const app = express()

app.use(cookieSession({
    name: "session",
    keys: ["smsapp"],
    maxAge: 60 * 100
}))
app.use(passport.initialize())
app.use(passport.session())
app.use("/",router)

app.use(cors()) // This is to tell set the header needed for CORS

app.listen(5000, (err) => {
    if (err) console.log('Server Not Started')
    else console.log('Server is running on http://localhost:' + 5000)
})