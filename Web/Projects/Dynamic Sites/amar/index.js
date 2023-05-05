console.log("HEllo world")

document.querySelector('#range').addEventListener("change", function(e){
    document.querySelector(".range").textContent=e.currentTarget.value;
    console.log("HEreee")
})