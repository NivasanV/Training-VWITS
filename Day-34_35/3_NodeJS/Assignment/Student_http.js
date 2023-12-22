const http = require('node:http')
const fs = require('node:fs')

// creatServer returns an instance of a server
const server = http.createServer((req, res) => {
    fs.readFile('Student.json', 'utf-8', (err, data) => {
        // if data found
        const header = {
            'access-control-allow-origin': '*',
            'access-control-allow-methods': '*',
            'Content-Type': 'application/json'
        }
        res.writeHead(200, header);
        res.write(data);
        // else
        // res.writeHead(404,{'content-type': 'application/json'})
        // res.write('{"message": "record doesn't exist"}')
        res.end();
    });
})
server.listen(5000);