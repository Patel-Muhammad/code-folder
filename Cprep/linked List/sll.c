#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *link; //node contains this member which is a pointer which can refer to datatype of struct node
};
    int count = 0;

//------------------------------------Creating a Node:---------------

struct node * createNode(int value){
    struct node *ptr;
    ptr = malloc(sizeof(struct node));  

    ptr->data = value;
    ptr->link = NULL;
    count++;
    return ptr;
}
//-------------------------------------------------------------------


//<<<<<<<<<<<<<<<<<<<<<<<<<Insertion>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//------------------------Add to last--------------------------------
struct node * addLast(struct node *head,int value){
    if(head == NULL){//There is no element in the linked list
        head = createNode(value);
    }
    else{//If already a linked list exist9i
        struct node *temptr = head;//create a temptr that will point where head is pointing
        while(temptr->link != NULL){//goint to the last node
            temptr = temptr->link;
        }
        struct node *newNode = createNode(value);//create a newNode and give it it pointer
        temptr->link = newNode;//Make the link of the last node point where newNode is pointing
    }
    return head;
}
//--------------------------------------------------------------------


//-----------------------------Add to first---------------------------
struct node * addFirst(struct node *head, int value){
    if(head == NULL){//There is no element in the linked list
        head = createNode(value);
    }
    else{
        struct node *newNode = createNode(value);
        newNode->link = head;
        head = newNode;
    }
    return head;
}
//--------------------------------------------------------------------

//-------------------Add at particular position-----------------------
struct node* addAt(struct node *head,int value,int pos){
    if(head == NULL){
        head = createNode(value);
    }
    else{
        struct node *newNode = createNode(value);
        
        struct node *temptr = head;
        for(int i = 2; i < pos; i++){
            temptr = temptr->link;
        }
    newNode->link = temptr->link;
    temptr->link = newNode;
    }
    return head;
}
//---------------------------------------------------------------------

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



//---------------------------Printing list-----------------------------
void printList(struct node *head){
    struct node *temp = head; //create a temptr that will point where head is pointing
    while (temp != NULL){
        printf("%d -> ",temp->data);
        temp = temp->link;
    }
    printf("Null \n");
}
//---------------------------------------------------------------------



//<<<<<<<<<<<<<<<<<<<<<<<<<<<<Deletion>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//------------------------Delete from  first---------------------------
struct node* delFirst(struct node * head){
    if(head == NULL){
        printf("Cannot delete from an Empty list.");
    }
    else{
        struct node *temptr = head;
        head = head->link;
        free(temptr);
        temptr = NULL;
    }
    return head;
}
//---------------------------------------------------------------------

//-------------------------Delete from end-----------------------------
struct node* delLast (struct node* head){
    if(head == NULL){
        printf("Cannnot Delete from an empty list.\n");
    }
    else{
        struct node *temptr = head;
        while(temptr->link->link != NULL){
            temptr = temptr->link;
        }
        free(temptr->link);
        temptr->link = NULL;
    }
    return head;
}
//---------------------------------------------------------------------
struct node* delAt(struct node *head, int pos){
    if(head == NULL){
        printf("Cannot delete from an empty list.");
    }
    else if (pos > count){
        printf("Index out of bound.");
    }
    else{
        struct node *temp1 = head;
        struct node *temp2 = head->link;

        for(int i = 2; i < pos ; i++){
            temp1 = temp1->link;
            temp2 = temp2->link;
        }
        temp1->link = temp2->link;
        free(temp2);
        temp2 = NULL;
    }
    return head;
    
}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//------------------------------Searching------------------------------
int searchInLl(struct node*head,int target){
    int postion = 1;
    int ans = -1;
    struct node *temptr = head;
    while (temptr != NULL){
        if(temptr->data == target){
            ans  = postion;
            break;
        }
        temptr = temptr->link;
        postion++;
    }
    return ans;
}
//---------------------------------------------------------------------

void main(){
    struct node *head; //creating a pointer which can refer a datatype of struct node
    head = NULL;

    head = addLast(head,34);
    head = addLast(head,90);
    head = addLast(head,55);
    head = addFirst(head,8);
    head = addFirst(head,44);
    head = addAt(head,444,4);
    printList(head);
    printf("\n");
    head = delFirst(head);
    printList(head);
    head = delAt(head,4);
    printList(head);
    printf("Element is at %d",searchInLl(head,55));

    










    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");
    // head = delFirst(head);
    // printList(head);
    // printf("\n");

    // printList(head);
}