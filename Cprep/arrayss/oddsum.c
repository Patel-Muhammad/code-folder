#include <stdio.h>

void main(){
    int arr[50], n, sum, index;

    printf("Enter number of elements: \n");
    scanf("%d",&n);

    printf("Enter Elements: \n");
    for(index = 0; index <= n-1; index++){
        scanf("%d",&arr[index]);
    }

    sum = 0;

    for(index = 0; index <= n-1; index++){
        if(arr[index] % 2 != 0){
            sum = sum + arr[index];
        }
    }

    printf("Sum of all odd numbers in the array: %d \n",sum);
}