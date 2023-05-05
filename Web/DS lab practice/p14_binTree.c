#include<stdio.h>

struct node {
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->left = newNode->right = NULL;
    newNode->data = data;
    return newNode;
}

struct node *add(struct node *root,int data){
    if(root==NULL){
        root = createNode(data);
    }
    else if(root-> data >= data ){
        root->left = add(root->left,data);
    }
    else{
        root->right = add(root->right,data);
    }
    return root;
}


void main(){

}