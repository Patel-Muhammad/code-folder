var http = require('http');

//create a server:
http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
})



