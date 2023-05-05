const express = require('express')
const app = express()

app.listen(9999,()=>{
    console.log("Server is listening at port 9999...")
})


//giving relative path with root directory
app.get('/',(req,res)=>{
    res.sendFile('/pages/index.html',{root:__dirname});
})

//giving absolute path
app.get('/about',(req,res)=>{
    res.sendFile("D:/Coding/Backend/irstapp/pages/about.html");
})

//syntax to redirect from one path to other
app.get('/about-us',(req,res)=>{
    res.redirect('/about');
})

//404 page
app.use((req,res)=>{
    res.status(404).sendFile('/pages/404.html',{root:__dirname});
})


