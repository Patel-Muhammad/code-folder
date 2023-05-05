
const express = require('express');
const app = express();

let users = [
    {
        id: 101,
        name: "Muhammad"
    },
    {
        id:102,
        name: "Person2"
    },
    {
        id:103,
        name:"sanjay"
    },
    {
        id:104,
        name:"priyansh"
    }
];

//Middleware function: converts frontend data to json
app.use(express.json())

app.listen(9999,()=>{
    console.log("Server is listening at port 9999...")
})

// app.get('/users',(req,res)=>{
//     res.send(users);
// })

//parameters after the users
app.get('/users/:id',(req,res)=>{
    console.log("req.params.id => ",req.params.id);
    console.log('req.params => ',req.params);
    res.send("User id recieved")
})

//filtering using the query
app.get('/users',(req,res)=>{
    console.log('req.query => ',req.query)
    res.send("users")
})

//Post is to send data from frontend to backend.
//data from frontend to backend goes in res.body
app.post('/users',(req,res)=>{
    console.log(req.body);
    users=req.body;
    res.json(
        {
            "msg":"Response successfully recieved!",
            "user":req.body
        }
    )
});


//patch is used to update
app.patch('/users',(req,res)=>{
    console.log("req.body =>",req.body);
    for(key in req.body){
        users[key] = req.body[key];
    }
    console.log("\n Afterr")
    console.log("users => ",users)
    console.log("req.body => ",req.body)
    res.json({
        "msg": "Data update successfull",
        "user":req.body
    })
})

//to delete data in user{} obj
app.delete('/users',(req,res)=>{
    users = {}
    console.log("req.body => ",req.body)
    res.json({
        "msg": "Delete successfull"
    })
})
