const getColor = () => {
    const randomNumber = Math.floor(Math.random() * 16777215)
    const randomColor = '#' + randomNumber.toString(16)
    document.body.style.backgroundColor = randomColor
    document.getElementById('cc').innerHTML = randomColor
    navigator.clipboard.writeText(randomColor)
}
getColor()

document.getElementById('btn').addEventListener('click',getColor)

let ele = document.querySelector('#btn')

console.log(ele.previousElementSibling)

