const http = require('node:http')
const mysql = require('mysql')

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "root",
    port: 3306,
    database: "sms_springboot_jpa_db"
});

let records;

con.connect((err) => {
    if (err) {
        console.log(err)
    }
    else {
        console.log("Connected")
    }
})

con.query('SELECT * FROM tbl_student', (err, result) => {
    if (err) console.log("Error")
    else records = result;
})

con.end((err) => {
    if (err) {
        console.log("Connection not closed");
    }
    else {
        console.log("Connection closed");
    }
})

const server = http.createServer((req, res) => {
    const uri = req.url;
    const httpMethod = req.method
    console.log(uri)
    console.log(httpMethod)
    // In the following code we are manually doing http routing which is not only time consuming
    // But error promne also In order to avoid this low level code, it typically use frameworks
    //in node to perform to low level task we use one of the most popular web apllication framework
    //Know as Express
    if (uri == '/api/student' && httpMethod == 'GET') {
        // const header = {
        //     'access-control-allow-origin': '*',
        //     'access-control-allow-methods': '*',
        //     'Content-Type': 'application/json'
        // }
        // res.writeHead(200, header);
        res.write(JSON.stringify(records))
    }
    else if(uri == '/api/student' && httpMethod == 'POST'){
        // insert db
        res.write('record inserted')
    }
    res.end();
})
server.listen(5000);