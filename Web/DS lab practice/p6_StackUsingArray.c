#include <stdio.h>
int stack[10],top = -1;

void isFull(){
        printf("StackOverflow");
}

void isEmpty(){
        printf("StackUnderFlow");
}

void push(int a){
    if(top == 10){
        isFull();
        return;
    }
    top++;
    stack[top] = a;
    printf("\nAdded %d .",a);
    return;
}

void pop (){
    if(top == -1){
        isEmpty();
        return;
    }
    printf("\n %d Element is removed.",stack[top]);
    top--;
    return;
}

void display(){
    if(top==-1){
        isEmpty();
        return;
    }
    for(int i = 0; i <= top; i++){
        printf("%d  ",stack[i]);
    }
}


void main(){
    push(33);
    push(44);
    push(66);
    push(77);
    push(88);
    display();
    pop();
    pop();
    pop();
    pop();
    display();
}