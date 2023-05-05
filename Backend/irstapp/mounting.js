const express = require('express');
const app = express();
//Middleware function: converts frontend data to json
app.use(express.json());
app.listen(9999)


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

//Creating a mini app:
const userRouter = express.Router();
app.use('/users',userRouter);

userRouter
.route('/')
.get(getUser)
.post(postUser)
.patch(updateUser)
.delete(deleteUser)

userRouter
.route('/:id')
.get(getUserById)



function getUser(req,res){
    res.send(users);
}

function postUser(req,res){
    console.log(req.body);
    users=req.body;
    res.json({
        "msg":"Response recieved successfully"
    })
}

function updateUser(req,res){
    console.log("req.body => ",req.body);

    for(key in req.body){
        users[key] = req.body[key];
    }
    console.log("After")
    console.log("Users => ",users)
    console.log("req.body => ",req.body)
    res.json({
        "msg":"Data updated",
        "user": users
    })
}

function deleteUser(req,res){
    users = {}
    console.log("req.body => ",req.body)
    res.json({
        "msg":"Delete successfull"
    })
}

function getUserById(req,res){
    console.log(req.params);
    console.log(req.params.id);

    let obj = {};

    for(i = 0; i < users.length; i++){
        if(users[i]["id"] == req.params.id){
            obj = users[i];
        }
    }

    res.json({
        "msg": "Request recieved",
        "data": obj,
        "hello":"world"
    })

}