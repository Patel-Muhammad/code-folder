#include <stdio.h>
#include <stdlib.h>

struct node{
    struct node *left;
    int data;
    struct node *right;
};

struct node *createNode(int data){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = data;
    newNode->right = NULL;
    newNode->left = NULL;
    return newNode;
}

struct node * insertNode(struct node * root,int data){
    struct node *newNode = createNode(data);
    if(root == NULL){
        return root = newNode;
    }
    else if(root->data < data){
        root->right = insertNode(root->right,data);
    }
    else{
        root->left = insertNode(root->left,data);
    }
    return root;
}
struct node *root = NULL;

void preOrder(struct node *root){
    if(root == NULL){
        return;
    }
    printf("%d \t",root->data);
    preOrder(root->left);
    preOrder(root->right);
}

void main(){
    root = insertNode(root,23);
    root = insertNode(root,18);
    root = insertNode(root,36);
    root = insertNode(root,63);
    root = insertNode(root,30);
    root = insertNode(root,10);
    root = insertNode(root,20);

    preOrder(root);
//  23      18      10      20      36      30      63 
}

