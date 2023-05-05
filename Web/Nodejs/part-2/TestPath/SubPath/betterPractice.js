const {readFile} = require('fs')
const {join} = require('path')
const util = require('util')

const textRead = (path)=>{
    return new Promise ((resolve,reject)=>{
        readFile(path,'utf8',(err,res)=>{
            if(err){
                reject(err)
            }
            else{
                resolve(res)
            }
        })
    })
}


const start = async() =>{
    try {
        const first = await textRead('First.txt');
        const second = await textRead('Second.txt');
        console.log("First.txt : " + first);
        console.log("Second.txt: " + second);
        
    } catch (error) {
        console.log(error);
    }
}
start();


// textRead(join('First.txt'))
// .then(result => console.log(result))
// .catch(err => console.log(err))
