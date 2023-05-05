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
    newNode->left = newNode->right = NULL;
    return newNode;
}

struct node *insertNode(struct node *root,int data){
    struct node *newNode = createNode(data);
    if(root == NULL){
        return root = newNode;
    }
    else if(data > root->data){
        root->right = insertNode(root->right,data);
    }
    else{
        root->left = insertNode(root->left,data);
    }
    return root;
}

int maxData (struct node *root){
    if(root == NULL){
        return -1;
    }
    while(root->right != NULL){
        root = root->right;
    }
    return root->data;
}

int recursionMaxData(struct node *root){
    if(root->right ==NULL){
        return root->data;
    }
    return recursionMaxData(root->right);
}

struct node *root = NULL;

void main(){
     root = insertNode(root,23);
    root = insertNode(root,18);
    // root = insertNode(root,36);
    // root = insertNode(root,63);
    root = insertNode(root,30);
    // root = insertNode(root,99);
    root = insertNode(root,10);
    root = insertNode(root,20);

    printf("Max data in BST: %d \n",maxData(root));
    printf("Max data in BST(Using reccursion): %d",recursionMaxData(root));
}