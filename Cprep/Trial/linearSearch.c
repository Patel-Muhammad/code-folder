#include <stdio.h>
void main(){
    int arr[10];
    int n, i, target, ans;

    printf("Enter number of elements: \n");
    scanf("%d",&n);

    printf("Enter elements: \n");
    for(i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    printf("\n");
    for(i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }

    printf("Enter target: ");
    scanf("%d",&target);

    for(i = 0; i < n; i++){
        if(arr[i] == target){
            printf("Target %d is present at position: %d ",target,i+1);
        }
    }
}