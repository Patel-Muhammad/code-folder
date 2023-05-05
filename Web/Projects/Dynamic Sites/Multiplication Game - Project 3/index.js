
   const num1 = Math.ceil((Math.random()*10))
    const num2 = Math.ceil((Math.random()*10))
    const re = document.querySelector(".reset")

    const question = document.getElementById("que")
    question.innerText = `What is ${num1} * ${num2} ?`

    const correctAns = num1 * num2

const form = document.getElementById("f")
const input = document.getElementById("in")
const scoreEl = document.getElementById("score")

let score = JSON.parse(sessionStorage.getItem("score"))
if(!score){
    score = 0
}
scoreEl.innerText = `Score: ${score}`

function refreshPage(){
    if(confirm("Are you sure, you want RESET ?")){
        score = 0
        updatesessionStorage()
        window.location.reload();
    }
}

form.addEventListener("submit", () => {
    const userAns = +input.value
    if (userAns === correctAns){
        score++
        updatesessionStorage()
    }
    else{
        score--
        updatesessionStorage()
    }
})


function updatesessionStorage(){
    sessionStorage.setItem("score", JSON.stringify(score))
}