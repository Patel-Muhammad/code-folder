package Fixes;
public class Main {
    public static void postfix(String exp){
        int i;
        stack p = new stack();
        int l = exp.length();

        for(i = 0; i < l ; i++){
            if(exp.charAt(i) == '('){
                p.push('(');
            }
            else if(exp.charAt(i) == ')'){
                while(p.top() != '('){
                    p.pop();
                }
                p.pop();
            }
            else if(exp.charAt(i) == '+' ){
                p.push('+');
                if(exp.charAt(i) == '+'){
                    if(p.lastTop() == '+'){
                        p.pop();
                    }
                    else if(p.lastTop() == '-'){
                        p.shift();
                    }
                    else if(p.lastTop() == '*'){
                        p.shift();
                    }
                    else if(p.lastTop() == '/'){
                        p.shift();
                    }
                }
            }
            else if(exp.charAt(i) == '-' ){
                p.push('-');
                if(exp.charAt(i) == '-'){
                    if(p.lastTop() == '+'){
                        p.shift();
                    }
                    else if(p.lastTop() == '-'){
                        p.pop();
                    }
                    else if(p.lastTop() == '*'){
                        p.shift();
                    }
                    else if(p.lastTop() == '/'){
                        p.shift();
                    }
                }
            }
            else if(exp.charAt(i) == '*' ){
                p.push('*');
                if(exp.charAt(i) == '*'){
                    if(p.lastTop() == '*'){
                        p.pop();
                    }
                    else if(p.lastTop() == '/'){
                        p.shift();
                    }
                }
            }
            else if(exp.charAt(i) == '/' ){
                p.push('/');
                if(exp.charAt(i) == '/'){
                    if(p.lastTop() == '*'){
                        p.shift();
                    }
                    else if(p.lastTop() == '/'){
                        p.pop();
                    }
                }
            }
            else{
                System.out.print(exp.charAt(i));
            }
        }
        if(p.topIndex() != -1){
            int ind = p.topIndex();
            while(ind != -1){
                p.pop();
                ind--;
            }
        }
    }
   
    public static void main(String[] args) {
        String expression = "a+b*(c+d)/f+d*e";
        postfix(expression);

    }
    
}
