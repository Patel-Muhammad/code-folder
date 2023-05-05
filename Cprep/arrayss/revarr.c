#include <stdio.h>
void main(){
    int arr[50], n, index;

    printf("Enter number of elements: \n");
    scanf("%d",&n);

    printf("Enter Elements: \n");
    for(index = 0; index <= n-1; index++){
        scanf("%d",&arr[index]);
    }

    printf("Before swapping: \n");
    for(index = 0; index <= n-1; index++){
        printf("%d ",arr[index]);
    }

    for(index = 0; index < (n/2); index++){
        int temp = arr[index];
        arr[index] = arr[n-1-index];
        arr[n-1-index] = temp;
    }

    printf("\nAfter Swapping: \n");
    for(index = 0; index <= n-1; index++){
        printf("%d ",arr[index]);
    }
}