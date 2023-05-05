//Path has - .join ; .basename ; .format
const path = require('path');

let obj = {
    dir: "TestPath\SubPath",
    base: "Sub.txt"
}
console.log(path.format(obj))
// "TestPath\SubPath\Sub.txt"

console.log(path.sep); 
// "\"

const filePath = path.join('TestPath','SubPath','Sub.txt')
console.log(filePath) 
// "TestPath\SubPath\Sub.txt"

const base = path.basename(filePath);
console.log(base);
// "Sub.txt"

console.log(path.resolve(__dirname,'TestPath','SubPath','Sub.txt'))
// "d:\Coding\Web\Nodejs\TestPath\SubPath\Sub.txt"