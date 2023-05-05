const hourE1 = document.getElementById("hours")
const minE2 = document.getElementById("minutes")
const secE3 = document.getElementById("seconds")
const ampmE4 = document.getElementById("ampm")

function updateClock(){
    let h = new Date().getHours()
    let m = new Date().getMinutes()
    let s = new Date().getSeconds()
    let ampm = "AM"

    if (h > 12){
        h = h - 12
        ampm = "PM"
    }
    if(h < 10){
        h = "0" + h   
    }

    hourE1.innerText = h
    minE2.innerText = m
    secE3.innerText = s
    ampm.innerText = ampm

    setTimeout(
        ()=>{updateClock()},1000)
}
updateClock()