#include<stdio.h>
#include<ctype.h>

char stack [10];
int top = -1;

void isFull(){
        printf("StackOverflow");
}

void isEmpty(){
        printf("StackUnderFlow");
}

void push(char x){
    if(top == 10){
        isFull();
    }
    else{
        top++;
        stack[top] = x;
    }
}

char pop(){
    if(top ==-1){
        isEmpty();
    }
    else{
        int y = stack[top];
        top--;
        return y;

    }
}

int priority(char x){
    if(x == '(') return 0;
    if( x == '+' || x == '-')return 1;
    if(x == '*' || x == '/')return 2;
    if(x == '^')return 3;
}

void inToPost(char s[]){
    int i = 0;
    char p;

    while(s[i] != '\0'){
        if(isalnum(s[i]))printf("%c",s[i]);

        if(s[i] == '(')push('(');

        if(s[i] == ')'){
            while(p = pop()!='('){
                printf("%c",p);
            }
        }
        else{
            while(priority(stack[top]) >= priority(s[i]) ){
                printf("%c",pop());
            }
            push(s[i]);
        }
        i++;
    }
    while(top != '\0'){
        printf("%c",pop());
    }
}

void main(){
    char strr[] = "A+B*C";
    inToPost(strr);
}