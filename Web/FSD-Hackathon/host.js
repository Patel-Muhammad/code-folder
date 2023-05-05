const http = require('http')
const fs = require('fs')

const server = http.createServer((req,res)=>{
    res.writeHead(200,{'content-Type':'text/html'})
    fs.readFileSync('index.html',(err,data)=>{
        if(err){
            res.writeHead(404)
            res.write('Error File not found!')
        }
        else{
            res.write(data)
        }
    })
    res.end()
}).listen(9090)