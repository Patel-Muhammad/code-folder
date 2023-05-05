#include <stdio.h>
void main(){
    int arr[10];
    int n, i, j;

//take number of elements input
    printf("Enter number of elements: \n");
    scanf("%d",&n);

//take arraay input
    printf("Enter Elements: \n");
    for(i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }

//print array input
    for(i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }

//bubble sort
    for(i = 0; i < n; i++){
        for(j = 1; j < n-i; j++){
            if( arr[j] < arr[j-1]){
            //swap
            int temp = arr[j];    
            arr[j] = arr[j-1];    
            arr[j-1] = temp;
            }
        }
    }
    printf("\n");
    for(i = 0; i < n; i++){
        printf("%d ",arr[i]);
    }

}