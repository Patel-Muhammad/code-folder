//Util has .isArray and .format methods
const util = require("util")

console.log(util.format('%s:%s',"Replace with thissss!","toss"))
// Replace with thissss!:%s

console.log(util.format('%s:%s',"a","b","c","d"))
// a:b c d

console.log(util.format(10,20,30))
// 10 20 30

let arr = [32,54,88]
let obj = {
    a: "name",
    b: "roll"
}
console.log(util.isArray(arr))
// true

console.log(util.isArray(obj))
// false
