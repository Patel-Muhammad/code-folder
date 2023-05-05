#include <stdio.h>
#include <stdlib.h>

struct node {
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

int minData(struct node *root){
    if(root == NULL){
        return -1;
    }
    while(root->left != NULL){
        root = root->left;
    }
    return root->data;
}

int recursionMinData(struct node *root){
    if(root->left ==NULL){
        return root->data;
    }
    return recursionMinData(root->left);
}

struct node *root = NULL;

void main(){
     root = insertNode(root,23);
    root = insertNode(root,18);
    root = insertNode(root,36);
    root = insertNode(root,63);
    root = insertNode(root,30);
    // root = insertNode(root,10);
    root = insertNode(root,20);
    // root = insertNode(root,2);

    printf("Min data in BST: %d \n",minData(root));
    printf("Min data in BST(Using reccursion): %d",recursionMinData(root));
}