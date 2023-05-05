//URl Module - Used to split a url into different parts

const url = require('url');
let uu = url.parse("https://www.google.com/search?q=this+is+a+url&oq=this+is+a+url&aqs=chrome..69i57.2647j0j1&sourceid=chrome&ie=UTF-8")
console.log(uu);
console.log(uu.pathname)
console.log(uu.query)
console.log(uu.host)
console.log(uu.search)
console.log(uu.query)

// Url {
//     protocol: 'https:',
//     slashes: true,
//     auth: null,
//     host: 'www.google.com',
//     port: null,
//     hostname: 'www.google.com',
//     hash: null,
//     search: '?q=this+is+a+url&oq=this+is+a+url&aqs=chrome
//   ..69i57.2647j0j1&sourceid=chrome&ie=UTF-8',
//     query: 'q=this+is+a+url&oq=this+is+a+url&aqs=chrome..
//   69i57.2647j0j1&sourceid=chrome&ie=UTF-8',
//     pathname: '/search',
//     path: '/search?q=this+is+a+url&oq=this+is+a+url&aqs=c
//   hrome..69i57.2647j0j1&sourceid=chrome&ie=UTF-8',
//     href: 'https://www.google.com/search?q=this+is+a+url&
//   oq=this+is+a+url&aqs=chrome..69i57.2647j0j1&sourceid=ch
//   rome&ie=UTF-8'
//   }