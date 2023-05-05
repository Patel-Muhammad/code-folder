#include <stdio.h>

char stack[20];
int top = -1;
char arr[10];

void push(char x){
    if(top == 20){
        return;
    }
    top++;
    stack[top] == x;
}

char pop(){
    if(top == -1){
        return 'n';
    }
    char y = stack[top];
    top--;
    return y;
}

void intoPost(char strr[]){
    int i = 0;
    char x;
    while(i != '\0'){
        if(strr[i] == '(')push('(');
        else if(isalnum(strr[top]))printf("%c",strr[i]);
        else if(strr[i]==')'){
            while((x = pop() != '(')){
                printf("%c",x);
            }
        }
        else{
            while(priority(stack[top]) >= priority(strr[i])){
                printf("%c",pop());
            }
            push(strr[i]);
        }
        i++;
    }
}

void main(){

}