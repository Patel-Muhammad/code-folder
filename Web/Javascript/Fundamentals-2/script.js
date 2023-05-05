'use strict';


// //This function can be called before defining in this type
// function ageCal(birthyr){
//     return 2022 - birthyr;
// }
// const a1 = ageCal(2003);
// console.log(a1);



// //function expression
// //In Js Function is value like string and float
// //This cannot be called before defining it
// const expFun = function(birthyr){
//     return 2022 - birthyr;
// }
// const a2 = expFun(2002);
// console.log(a2);


// //Arrow functions

// const ageCal2 = by => 2022 - by;

// const a3 = ageCal2(2000);
// console.log(a3);


// //Practice:

// const yearsUntilRetirement = (birthyr,firstNamme) => {
//     const age = 2022 - birthyr;
//     const yrsLeft = 60 - age;
//     return `${firstNamme} has left ${yrsLeft} years, until he retires.`;
// }

// const re = yearsUntilRetirement(2002,"Mr x");
// console.log(re);

// //Functions inside other function:

// function cut(apples){
//     return apples * 4;
// }

// function juice(apple,banana){
//     const ap = cut(apple);
//     const bp = cut(banana);

//     return `The apple juice has ${ap} pieces and ${bp} pieces of banana.`
// }

// console.log(juice(2,3));

// const avgCal = (a,b,c) => (a+b+c) / 3;

// const penguin = avgCal(14,0,10);
// const koala = avgCal(8,5,10);

// const checkWinner = (pen,koa)=>{
//     if(pen > koa){
//         console.log("Team Penguin wins!!");
//     }
//     else{
//         console.log("Team Koalas winn!");
//     }

// }

// checkWinner(penguin,koala);


//=================Arrays============================

// const arr = [1,2,3,"banana",4,5,"apple"];
// let length = arr.push("Mango"); //Add last returns new length
// arr.push("Umbrella");
// let element = arr.pop();//removes last and returns removed element
// console.log(arr);
// console.log(length);
// console.log(element);


// arr.unshift("Pizza");//Add to first
// console.log(arr);
// arr.shift(); //removes thee last
// console.log(arr);

// //push pop, shift, unshift

// console.log(arr.indexOf("banana"));

// console.log(arr.includes("app"));


//Tip calculator:

// const bill = [121,555,44];

// const tipCal = amt => {
//     if(amt >=50 && amt<300){
//         return amt * 0.15;
//     }
//     else{
//         return amt * 0.20;
//     }
// }
// const tt = (a,b)=> a+b;

// const tips = [tipCal(bill[0]),tipCal(bill[1]),tipCal(bill[2])];

// const total  = [bill[0]+tips[0],bill[1]+tips[1],bill[2]+tips[2]];

// console.log(bill);
// console.log(tips);
// console.log(total);


//Obj:

// const student = {
//     name : "Muhammad",
//     section : "3D",
//     id : 290,
//     friends : ["a","b","c"],
//     yr:2003,
//     age: function(){
//         this.age = 2022 -this.yr;
//         return this.age;
//     }
// }

// student.address = "Bommanahalli";
// student["insta"] = "@patelmuh2003";


// console.log(student["section"]);
// console.log(student.age());
// // student.no = prompt("Enter mob no:");



// // //Challenge:
// // console.log(`${student.name} has ${student.friends.length} and his best friend is ${student.friends[0]}`);

// console.log(student);

const norman = {
    name : "Norman",
    weight: 65,
    height: 1.82,
    bmi : function (){
        this.bmi = this.weight / (this.height * this.height);
        return this.bmi;
    }
}

const muhammad = {
    name: "Muhammad",
    weight: 63,
    height: 1.72,
    bmi: function(){
        this.bmi = this.weight / (this.height * this.height);
        return this.bmi;
    }
}

if(norman.bmi() > muhammad.bmi()){
    // document.getElementById('hs').innerHTML = `${norman.name} has more BMI  than ${muhammad.name}`;
}
else{
    // document.getElementById('hs').innerHTML = `${muhammad.name} has more  BMI has more than ${norman.name}`;
}

// console.log(norman.bmi());
// console.log(norman.bmi);

// document.getElementById('hs').innerHTML = `Norman's BMI is : ${norman.bmi()}`;
let text = "AWERFVGHJKSERTGHJ";
document.getElementById('demo').innerHTML = text.length;


let text1 = "Apple,Banana,Mango";
let part = text1.slice(6,12);
document.getElementById("demo1").innerHTML = part;