// // let js = "amazing";

// // console.log(js);

// // let p1 = "Heloweffn ijdfiw";

// // console.log(p1)

// // const thisIsConstant = 'this cannot be changed';

// // Type conversion:
// const yr = "1990";
// console.log(Number(yr));
// console.log(yr);

// //type coersion:
// console.log("Hello this is " + 565 + " and that was a number");
// console.log('100' + '200' - 90);
// console.log('100' - '200' - 90);
// console.log("50" / "10");

// let n = "1" + "1"; // => n = 11
// n = n - 1; // n = 11 - 1 = 10
// console.log(n); //10


// //Equality operators:
// console.log("10" === 10); //False
// console.log("10" == 10); //True

// // == does not require type to become equal
// // === Requires type to be same 


//logical Operators:

// const val1 = true;
// const val2 = false;

// let net = (val1 && val2);
// let net2 = (val1 || val2);

// console.log(net);
// console.log(net2);


//Dolphins and koalas

const dol1 = 97;
const dol2 = 108;
const dol3 = 89;

const avgDol = (dol1 + dol2 + dol3) / 3;

const kol1 = 88;
const kol2 = 91;
const kol3 = 110;

const avgKol = (kol1 + kol2 + kol3) / 3;


if (avgDol > avgKol && avgDol > 100){
    console.log("Dolphins are winners!!");
}
else if (avgKol > avgDol && avgKol > 100){
    console.log("Koalas are winners!");
}
else{
    console.log("Its a draw");
}


