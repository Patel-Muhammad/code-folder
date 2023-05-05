const {readFileSync,writeFileSync,appendFileSync} = require('fs')
const path = require('path')

const first = readFileSync(path.join('TestPath','First.txt'),'utf-8')
const second = readFileSync(path.join('TestPath','Second.txt'),'utf-8')

console.log(first)
console.log(second)

writeFileSync(path.join('TestPath','result.txt'),`Heyy this is the concatination of first and second : ${first} and ${second}`,{flag:'a'})