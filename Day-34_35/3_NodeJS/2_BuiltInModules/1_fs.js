// let fs= require('fs')         // valid but not recommended
let fs= require('node:fs')            //recommended
//fs module is used to deal with file system.
// fs.writeFileSync('demo.txt','Welcome to Newyork')
// fs.appendFileSync('demo.txt','Welcome to Paris')
fs.readFile('demo.txt','utf8',(err,data)=>{
    console.log(data)
})
fs.appendFileSync('demo.txt',',Welcome to Austria')