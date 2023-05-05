
//===========================Objects========================
// it is like dictionaries in python and hashmaps in java

//collection of key value pairs

// let obj = {
//     key: value
// } //decraring a obj in js

let student = {
    name: "Muhammad",
    age: 19,

    dob:{
        day: 06,
        mon: 10,
        yr: 2003,
    },

    cgpa: 7.8,

    lang:["gujarati","english","hindi"],

    sayhi: function(){
        console.log("I am saying hii");
    }
};

console.log(student.name);
console.log(student.age);
console.log(student.dob.mon);
console.log(student.cgpa);
console.log(student.lang[2]);
console.log(student.sayhi());

student.add = "Stanza living bilbao house!"
// console.log(student);

//---------Delete-------
delete student.cgpa;
// console.log(student);

for(let key in student){
    console.log(key, " : ", student[key]);
}
