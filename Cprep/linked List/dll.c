#include<stdio.h>
#include<stdlib.h>

struct node {
    struct node *pre;
    int data;
    struct node *nxt;

};

struct node * createNode(int value){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = value;
    newNode->pre = NULL;
    newNode->nxt = NULL;
    return newNode;
}

struct node * addFirst(struct node *head, int value){
    if(head == NULL){
        head = createNode(value);
    }
    else{
        struct node *newNode = createNode(value);
        newNode->nxt = head;
        head->pre = newNode;
        head = head->pre;
    }
    return head;
}

struct node * addLast(struct node *head,int value){
    if(head == NULL){
        head = createNode(value);
    }
    else{
        struct node *newNode = createNode(value);
        struct node *temptr = head;
        while(temptr->nxt != NULL){
            temptr= temptr->nxt;
        }
        temptr->nxt = newNode;
        newNode->pre =  temptr;
    }
    return head;
}

struct node * addAtPos(struct node * head,int value){
    if(head == NULL){
        head = createNode(value);
    }
    else{
        struct node *newNode = createNode(value);
        

    }
}

void printList(struct node *head){
    while(head != NULL){
        printf("%d <-> ",head->data);
        head = head->nxt;
    }
    printf("NULL\n");
}




void main(){
    struct node * head = NULL;
    head = addFirst(head,21);
    head = addFirst(head,99);
    head = addFirst(head,65);
    head = addLast(head,0);
    head =addLast(head,11);
    printList(head);
}