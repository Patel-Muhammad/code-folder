import React, { useState } from 'react';

export default function FunComp(){
    const [count,setCount] = useState(0);

    const increaseCount = () => {
        setCount(count+1);
    }

    const decreaseCount = () => {
        setCount(count-1)
    }

    const zeroCount = () => {
        setCount(0)
    }

    const [clr,setClr] = useState('black')
    const changeClr =  () => {
        setClr(clr == 'black' ? 'green' : 'black')
    }
   


    return(
        <>
            <button onClick={increaseCount}>Increase</button>
            <h1 style={{color:clr}}>Count: {count}</h1>
            <button onClick={decreaseCount}>Decrease</button>
            <br/>
            <button onClick={zeroCount}>Set to zero</button>
            <button onClick={changeClr}>Change color</button>
        </>
    )
}