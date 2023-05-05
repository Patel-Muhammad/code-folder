#include <stdio.h>

void main(){
    int n,i;
    

    printf("Enter how many elements do u need: \n");
    scanf("%d",&n);

    int arr[n];
    
    for (i = 0; i < n; i++ ){
        scanf("%d",&arr[i]);
    }

    for (i = 0; i < n; i++ ){
        printf("%d ",arr[i]);
    }

}