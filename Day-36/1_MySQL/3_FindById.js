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

con.query('SELECT * FROM tbl_student where rollno=?',[5],(err, result) => {
    if(err) console.log("Error")
    else console.log(result)
})

con.end( (err) => {
    if(err){
        console.log("Connection closed");
    }
    else{
        console.log("Connection closed");
    }
})
