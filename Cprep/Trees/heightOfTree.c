// Height - 
//It is the number of edged in the longest path from root to a leaf node.

#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node * left;
    int data;
    struct node * right;
};

struct node *createNode(int data){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->left =newNode->right = NULL;
    newNode->data = data;
    return newNode;
}

struct node *insertNode(struct node *head,int data){
    struct node *newNode = createNode(data);
    if(head == NULL){
        return head = newNode;
    }
    else if (data > head->data){
        head->right = insertNode(head->right,data);
    }
    else{
        head->left = insertNode(head->left,data);
    }
    return head;
}