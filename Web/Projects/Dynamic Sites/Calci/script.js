class Calculator{
    constructor(preOpBtn,curOpBtn){
        this.preOptxt = preOpBtn
        this.curOptxt = curOpBtn
        this.clear()
    }
    keyboardPress(e){
        switch(e.keyCode){
            case 49:
                this.curOp = this.curOp.toString() + "1"
                break
            case 50:
                this.curOp = this.curOp.toString() + "2"
                break
            case 51:
                this.curOp = this.curOp.toString() + "3"
                break
            case 52:
                this.curOp = this.curOp.toString() + "4"
                break
            case 53:
                this.curOp = this.curOp.toString() + "5"
                break
            case 54:
                this.curOp = this.curOp.toString() + "6"
                break
            case 55:
                this.curOp = this.curOp.toString() + "7"
                break                               
            case 56:
                this.curOp = this.curOp.toString() + "8"
                break
            case 57:
                this.curOp = this.curOp.toString() + "9"
                break
            case 48:
                this.curOp = this.curOp.toString() + "0"
                break
            case 13:
                //enter
                cal.compute()
                break
            case 8:
                //backspace
                break
            case 190:
                if(this.curOp.includes('.')) break
                this.curOp = this.curOp.toString() + "."
                break
        }
    }

    clear(){
        this.curOp = ""
        this.preOp = ""
        this.op = undefined
    }

    delete(){
        if (this.curOp == ''){
            return
        } 
        this.curOp = this.curOp.toString().slice(0,-1)
    }
    append(num){
        if(num === '.' && this.curOp.includes('.')) return
        this.curOp = this.curOp.toString() + num.toString()
    }
    choice(op){
        if(this.curOp ===''){
            return
        }
        if(this.preOp !== ''){
            this.compute()
        }
        this.op = op
        this.preOp = this.curOp.toString() + op.toString()
        this.curOp = ''

    }
    compute(){
        let compute
        const pre = parseFloat(this.preOp)
        const cur = parseFloat(this.curOp)
        if(isNaN(pre) || isNaN(cur)) return
        switch(this.op){
            case'+':
            compute = pre + cur
            break

            case'-':
            compute = pre - cur
            break

            case'×':
            compute = pre * cur
            break

            case'÷':
            compute = pre / cur
            break
        }
        this.curOp = compute
        this.op = undefined
        this.preOp = ''

    }
    updateDisplay(){
        this.curOptxt.innerText = this.curOp
        this.preOptxt.innerText = this.preOp
    }
}


const numBtn = document.querySelectorAll('[data-num]')
const opBtn  = document.querySelectorAll('[data-op]')

const equalsBtn = document.querySelector('[data-equals]')
const delBtn = document.querySelector('[data-del]') 
const acBtn = document.querySelector('[data-ac]')

const preOpBtn = document.querySelector('[data-preop]')
const curOpBtn = document.querySelector('[data-curop]')

const cal = new Calculator(preOpBtn,curOpBtn)

numBtn.forEach(button =>{
    button.addEventListener('click',()=>{
        cal.append(button.innerText)
        cal.updateDisplay()
    })
})

opBtn.forEach(button =>{
    button.addEventListener('click',() =>{
        cal.choice(button.innerText)
        cal.updateDisplay()
    })
})


acBtn.addEventListener('click',()=>{
    cal.clear()
    cal.updateDisplay()
})

delBtn.addEventListener('click',()=>{
    cal.delete()
    cal.updateDisplay()
})

equalsBtn.addEventListener('click',()=>{
    cal.compute()
    cal.updateDisplay()
})

document.addEventListener('keydown', e =>{
    cal.keyboardPress(e)
    cal.updateDisplay()
})