#include<stdio.h>
struct node{
    int data;
    struct node *left;
    struct node * right;
};

struct node * createNode(int data){
    struct node * newNode=malloc(sizeof(struct node));
    newNode->left = newNode->right = NULL;
    newNode->data = data;
    return newNode;
}

struct node * push(struct node * root,int data){
    if(root == NULL){
        root = createNode(data);
    }
    else if (root->data > data){
        root->left = push(root->left,data);
    }
    else{
        root->right = push(root->right,data);
    }
    return root;
}

void search(struct node* root,int target){
    if(root->right != NULL && root->right->data == target || root->left != NULL && root->left->data ==target){
        printf("Element found");
    }
    else if (root->data > target){
        return search(root->left,target);
    }
    else{
        return search(root->right,target);
    }
}

void inOrder(struct node * root){
    inorder(root->left);
    printf("%d",root->data);
    inorder(root->right);
}

void preorder(struct node* root){
    printf("%d",root->data);
    preorder(root->left);
    preorer(root->right);
}

void postOrder(struct node *root){
    postOrder(root->left);
    postOrder(root->right);
    printf("%d",root->data);
}

void main(){

}