#include <stdio.h>
int queue[10],front = -1;
int rear= -1;

void isFull(){
        printf("StackOverflow");
}

void isEmpty(){
        printf("StackUnderFlow");
}

void dequeue(){
    if(front ==-1 && rear ==-1 || front ==rear){
        isEmpty();
        return;
    }
    front++;
}
void enqueue(int a){
    if(rear == 10){
        isFull();
        return;
    }
    if(front == -1 && rear ==-1){
        front++;
    }
    rear++;
    queue[rear] = a;
    return; 
}

void display(){
    for(int i = front; i <= rear; i++){
        printf("%d  ",queue[i]);
    }
}

void main(){
    enqueue(44);
    enqueue(55);
    enqueue(66);
    enqueue(77);
    enqueue(88);
    display();
    dequeue();
    dequeue();
    dequeue();
    display();
}