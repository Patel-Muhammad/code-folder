#include <stdio.h>
#include <stdlib.h>

struct node {
    int coef;
    int exp;
    struct node *next;
};

struct node * addLast(struct node *head,int coef,int exp){
    struct node *newNode = malloc(sizeof(struct node));
    newNode->coef = coef;
    newNode->exp = exp;
    newNode->next = NULL;
    if(head == NULL){
        head = newNode;
    }
    else{
        struct node *temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
    }
    return head;
}

struct node *addPoly(struct node*h1,struct node*h2){
    struct node *ptr1 = h1;
    struct node *ptr2 = h2;
    struct node *result = NULL;

    while(ptr1 != NULL && ptr2 != NULL){
        if(ptr1->exp == ptr2->exp){
            result = addLast(result,ptr1->coef+ptr2->coef,ptr1->exp);
            ptr1 = ptr1->next;
            ptr2 = ptr2->next;
        }
        else if(ptr1->exp > ptr2->exp){
            result = addLast(result,ptr1->coef,ptr1->exp);
            ptr1 = ptr1->next;
        }
        else{
            result = addLast(result,ptr2->coef,ptr2->exp);
            ptr2 = ptr2->next;
        }
    }
    return result;
}

void printPoly(struct node *head){
    struct node *temp = head;
    while(temp != NULL){
        printf("%dX^%d ", temp->coef,temp->exp);
        temp = temp->next;
    }
}

struct node * insert(struct node *head,int coef, int exp){
    struct node *temp = head;
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->coef = coef;
    newNode->exp = exp;
    newNode->next = NULL;

    if(head == NULL || exp >= head->exp){
        newNode->next = head;
        head = newNode;
    }
    else{
        
        while(temp->exp > exp && temp->next != NULL){
            temp = temp->next;
        }
        newNode->next = temp->next;
        temp->next = newNode;
    }
    return head;
}

struct node *create(struct node*head){
    int n;
    int coef;
    int exp;
    printf("Enter number of terms: ");
    scanf("%d",&n);

    for(int i = 0; i < n; i++){
        printf("Enter Coeffiecient of term %d: ",i+1);
        scanf("%d",&coef);

        printf("Enter Exponential of term %d: ",i+1);
        scanf("%d",&exp);
        head = insert(head,coef,exp);
    }
    return head;
}

void main(){
    struct node *head1 = NULL;
    struct node *head2 = NULL;
    head1 = create(head1);
    head2 = create(head2);
    printPoly(head1);
    printPoly(head2);
    printf("\n");
    struct node *result = addPoly(head1,head2);
    printPoly(result);
}