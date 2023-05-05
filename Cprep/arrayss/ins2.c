#include <stdio.h>

void main(){
    int arr[100];
    int position, value, size, index;

    printf("Enter number of Elements: \n");
    scanf("%d",&size);

    printf("Enter elements: \n");
    for( index = 0; index <= size - 1; index++ ){
        scanf("%d",&arr[index]);
    } 

    printf("Enter the Value: \n");
    scanf("%d",&value);

    printf("Enter the Position: \n");
    scanf("%d",&position);

    printf("Before Insertion: \n");
    for( index = 0; index <= size - 1; index++ ){
        printf("%d ",arr[index]);
    }

    for( index = size - 1; index >= position -1 ; index--){
        arr[index + 1] = arr[index];
    }
    size++;

    arr[position - 1] = value;

    printf("\nAfter Insertion: \n");
    for( index = 0; index <= size - 1; index++ ){
        printf("%d ",arr[index] );
    }


}