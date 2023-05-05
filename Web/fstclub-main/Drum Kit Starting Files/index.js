const w = new Audio()
const a = new Audio()
const s = new Audio()
const d = new Audio()
const j = new Audio()
const k = new Audio()
const l = new Audio()
w.src = "sounds/crash.mp3"
a.src = "sounds/kick-bass.mp3"
s.src = "sounds/snare.mp3"
d.src = "sounds/tom-1.mp3"
j.src = "sounds/tom-2.mp3"
k.src = "sounds/tom-3.mp3"
l.src = "sounds/tom-4.mp3"
console.log("Hoii")


document.body.addEventListener('keydown',(e)=>{
    if(e.keyCode == 87){
        w.play()
    }
})