const mysql = require('mysql')

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

module.exports = { con }