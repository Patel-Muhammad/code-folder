// console.log("hello world")

// function add(num: number){
//     return num + 10
// }

// console.log(add(12))

// function getUpper(val: string){
//     return val.toLocaleUpperCase()
// }

// console.log(getUpper("muh"))

////////////////////////////functions///////////////////////////////////////

// function signUp(id: number, email: string, isPaid: boolean){

// }

// signUp(123,"patel@gmail.com", true)

// #Defining a function with the parameter types and the return types:

// function getValue(val: number): boolean{
//     if(val > 5){
//         return true
//     }
//     else{
//         return("Invalid")
//     }
// }

// const sayHello = (name: string): string => { // you must and should return a string
//     return ("Good morning, " + name)
//     // return 0 -- won't work
// }

// console.log(sayHello("Muhammad"))

// map function:
// const arr = ['a', 'b', 'c']

// arr.map((char: string): string => {
//     console.log(`the element is ${char}`);
//     return `the element is ${char} \n`
// })


// function consoleError(valu: string): void{
//     console.log(`console error: ${valu}`)
// }

// consoleError("value is wrong")


// function handleError(msg: string): never{
//     throw new Error(msg)
// }

// // handleError("that is thr erroe")

//# Bad behaviour of objects:

// function createUser({name: string, id: number, isPaid: boolean}){

// }

// let newUser = {name:'Muhammad',id:123, isPaid:false, email:"m@m.com"}

// createUser(newUser)

// // createUser({name:"Muhammad",id: 123,isPaid: false})

// function createCourse(): {name: string, price: number}{
//     return({name: "js",price: 1999})
// }

// # type aliass
// type user = {
//     name: string;
//     email: string;
//     isPaid: boolean;
//     id:number
// }

// function createUser(user:user):user{
//     return(user)
// }

// createUser({name:"Muhammad", email: "m@m.com", isPaid:true, id:123})

// type user = {
//     readonly _id: number; //this field cannot be changed later
//     name: string;
//     email: string;
//     isPaid: boolean;
//     creditCardDetails?: number; //this field is optional
// }

// let myUser:user = {
//     _id: 1234,
//     name: "Muhammad",
//     email: "p@p.com",
//     isPaid: true
// }

// myUser.email = "new@gmail.com"

// myUser._id = 321 --not possible as _id is readonly

type cardNumber = {
    cn: number
}

type cardDate = {
    cd: string
}

type cardDetails = cardNumber & cardDate & {
    ccvv: number
}





