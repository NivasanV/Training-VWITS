const mysql = require('mysql')
const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    port: 3306,
    database: "sms_springboot_jpa_db"
})

con.connect((err) => {
    if(err){
        console.log(err)
    }
    else{
        console.log("Connected")
    }
})

con.query('INSERT INTO tbl_student VALUES(?,?,?,?)',[34,"Jackson",3,89],(err, result) => {
    if(err) console.log("Error")
    else console.log("Rows inserted "+ result.affectedRows)
})

con.end( (err) => {
    if(err){
        console.log("Connection closed");
    }
    else{
        console.log("Connection closed");
    }
})
