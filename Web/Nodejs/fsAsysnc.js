const {readFile,writeFile} = require('fs');
const {join} = require('path')

readFile(join('TestPath','First.txt'),'utf8',(err,res)=>{
    if(err){
        console.log(err);
        return;
    }
    
    const first = res;

    readFile(join('TestPath','Second.txt'),'utf8',(err,res)=>{
        if(err){
            console.log(err);
            return;
        }
        const second = res;

        writeFile(join('TestPath','result.txt'),`the result is : ${first} and ${second}`,(err)=>{
            if(err){
                return;
            }
            console.log("Done>>")
        })
    })
    
})