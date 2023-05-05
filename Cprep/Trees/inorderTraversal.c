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

void inOrder(struct node *root){
    if(root==NULL){
        return;
    }
    inOrder(root->left);
    printf("%d\t",root->data);
    inOrder(root->right);
}

struct node *root = NULL;

void main(){
    root = insertNode(root,23);
    root = insertNode(root,18);
    root = insertNode(root,36);
    root = insertNode(root,63);
    root = insertNode(root,30);
    root = insertNode(root,10);
    root = insertNode(root,20);

    inOrder(root);
//  10      18      20      23      30      36      63
}