const os = require('os');

//info about current user:
const user = os.userInfo();
console.log(user);

//system uptime in seconds:
let up = os.uptime();
up = up / 3600;
console.log(`The system uptime is ${up} hours`)

const currSystem = {
    name: os.type(),
    release: os.release(),
    totalMemory: os.totalmem(),
    freeMomory: os.freemem(),
}

console.log(currSystem);