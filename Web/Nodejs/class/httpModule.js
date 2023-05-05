const http = require("http")

const server = http.createServer((req,res)=>{
    if(req.url ==="/"){
        res.write("This is Homepage welcome to out page")
        res.end()
    }
    else if(req.url === "/about"){

        res.write('About us')
        res.end()
    }
    else{
        res.end(
            `<h1>Opps</h1>
            <p>Page not found!!</p>
            <a href="/">Back home</a>
            `
        )
    }
})

server.listen(8090)