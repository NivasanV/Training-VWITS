const http = require('node:http')
//createServer()  returns an instance of a server
const server= http.createServer((req,res)=>{
    res.writeHead(200,{"content-type":"text/plain"}) //it returns status code and content type
    res.write('<h1>response from node server</h1>')
    res.end()
})
server.listen(3010);
//server's job is to run continously and listen to the request
//req -request , res-response