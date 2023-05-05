const http = require('http');

const server = http.createServer((request,response)=>{
    if(request.url === '/'){
        response.end('Welcome to the webpage!')
    }
    if(request.url === '/about'){
        response.end('This is out short history')
    }
    // else{
    //     response.end(`
    //         <h1>Oops</h1>
    //         <p>Page not found</p>
    //         <a href="/">back Home</a>`
    //     )

    // }
        
})

server.listen(8900)