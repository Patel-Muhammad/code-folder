#include <stdio.h>

void main(){
    int arr[100], n, index, target, count;

    printf("Enter number of elements \n");
    scanf("%d",&n);

    printf("Enter Elements: \n");
    for(index = 0; index <= n-1; index++){
        scanf("%d",&arr[index]);
    }

    printf("Enter target: \n");
    scanf("%d",&target);

    for(index = 0; index <= n-1; index++){
        printf("%d ",arr[index]);
    }

    count = 0;

    for(index = 0; index <= n-1; index++){
        if(arr[index] == target){
            count++;
        }
    }

    printf("\nFreq :%d",count);
}