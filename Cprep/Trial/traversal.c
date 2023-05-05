#include <stdio.h>

void main(){
    int arr[100],n,i;

    printf("Enter number of elements: \n");
    scanf("%d",&n);

    printf("Enter elements: \n");
    for(i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }

    for(i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }
}