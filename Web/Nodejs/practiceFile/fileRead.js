let fs = require('fs')
let http = require('http')
let path = require("path")

// fs.appendFile("testHTML.html","<h6>THIS IS OUR ABOUT US PAGE</h6>",(err,result)=>{
    //             if(err){
    //                 console.log("/about errr")
    //                 return res.end()
    //             }
    //         })
    //fs.readFile("testHTML.html","utf-8",(err,result)=>{
        //             if(err){
        //                 console.log("Errrrrr")
        //                 console.log(err)
        //                 return res.end()
        //             }

fs.unlink("p.txt",(err)=>{
    if(err){
        console.log(err)
    }
})


// const server = http.createServer((req,res)=>{
//     if(req.url === '/'){
//         
//             res.end(result)
//         }) 

//     }
//     else if(req.url === '/about'){
//        
//         fs.readFile("testHTML.html",(err,result)=>{
//             if(err){
//                 console.log("readfile in abt err")
//                 return res.end()
//             }
//             res.end(result)
//         })
//     }
// })
// server.listen(8090)