//================================Array===============================
arr = [11,22,33,44,55];

arr.push("lasttt");// add to last
arr.unshift("Firsttt!");// add to first

console.log(arr);

for(let ele in arr){
    console.log(ele, "=" ,arr[ele] );
}

arr.pop()//remove last
arr.pop()
arr.shift() //remove first

console.log(arr)