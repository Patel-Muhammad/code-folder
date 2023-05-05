let pro = new Promise((resolve,reject)=>{
    let a  = 1 + 1 + 1
    if(a == 3){
        resolve("Success, a = " + a)
    }
    else{
        reject("Fail, a != 3")
    }
})

pro
.then((msg)=>{console.log("This is then: " + msg)})
.catch((msg)=>{console.log("This is catch: " + msg)})