#include <stdio.h>
#include <stdlib.h>

struct bstNode{
    int data;
    struct bstNode *left;
    struct bstNode *right;
};

struct bstNode * createNode(int data){
    struct bstNode *newNode = malloc(sizeof(struct bstNode));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct bstNode * insert(struct bstNode * root, int data){
    if(root == NULL){
        root = createNode(data);
    }
    else if( data <= root->data){
        root->left = insert(root->left,data);
    }
    else{
        root->right = insert(root->right,data);
    }
    return root;
}

int min(struct bstNode *root){
    if(root == NULL){
        printf("Empty!!\n");
        // return -1;
    }
    else{
        while(root->left != NULL){
            root = root->left;
        }
        return root->data;
    }
}

int max (struct bstNode *root){
    if(root == NULL){
        printf("Empty!!");
    }
    else{
        while(root->right != NULL){
            root = root->right;
        }
        return root->data;
    }
}

void search(struct bstNode *root,int data){
    if(root == NULL){
        printf("Empty!1");
    }
    else if(root->data == data){
        printf("Present!!");
    }
    else if(data <= root->data){
        return search(root->left,data);
    }
    else{
        return search(root->right,data);
    }
}

void main(){
    struct bstNode *root = NULL;
    root = insert(root,1);
    root = insert(root,2);
    root = insert(root,3);
    root = insert(root,4);
    root = insert(root,5);
    root = insert(root,6);
    root = insert(root,7);
    root = insert(root,8);
    root = insert(root,9);


    
    // root = insert(root,0);

    printf("Min is : %d \n",min(root));
    printf("Max is : %d \n",max(root));
    search(root,8);
}