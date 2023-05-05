//It will give query into an object
const queryString= require("querystring")

let str = 'q=this+is+a+url&oq=this+is+a+url&aqs=chrome..69i57.2647j0j1&sourceid=chrome&ie=UTF-8';

console.log(queryString.parse(str));
//Output:
// [Object: null prototype] {
//     q: 'this is a url',
//     oq: 'this is a url',
//     aqs: 'chrome..69i57.2647j0j1',
//     sourceid: 'chrome',
//     ie: 'UTF-8'
//   }