#include <stdio.h>
#include <stdlib.h>

struct bstNode{
    int data;
    struct bstNode *left;
    struct bstNode *right;
};

struct bstNode * createNode(int data){
    struct bstNode *ptr = malloc(sizeof(struct bstNode));
    ptr->data = data;
    ptr->left = NULL;
    ptr->right = NULL;

    return ptr;
}

struct bstNode * insert(struct bstNode *root,int data){
    if(root == NULL){
        root = createNode(data);
    }
    else if(data <= root->data){
        root->left = insert(root->left,data);
    }
    else{
        root->right = insert(root->right,data);
    }
    return root;
}

void search (struct bstNode *root,int data){
    if(root == NULL){
        printf("Tree empty!!\n");
    }
    else if(root->data == data){
        printf("Present!\n");
    }
    else if(data <= root->data){
        return search(root->left,data);
    }
    else{
        return search(root->right,data);
    }
}

// void printTree(struct bstNode *root){
//     if(root == NULL){
//         printf("Tree doesn't exist!");
//     }
//     else{
        
//     }
// }

void main(){
    struct bstNode *root = NULL;

    root = insert(root,30);
    root = insert(root,10);
    root = insert(root,40);
    root = insert(root,20);
    root = insert(root,0);

    search(root,100);

}
