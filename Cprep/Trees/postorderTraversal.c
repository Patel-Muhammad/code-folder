#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node *left;
    int data;
    struct node *right;
};

struct node *createNode(int data){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->left = newNode->right = NULL;
    newNode->data = data;
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


void postOrder(struct node *root){
    if(root == NULL){
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    printf("%d\t",root->data);
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

    postOrder(root);
//  10      20      18      30      63      36      23

}
