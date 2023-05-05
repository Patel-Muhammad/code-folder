  fs.readFile("testHTML.html",(err,result)=>{
        res.write(result)
        return res.end()
    })