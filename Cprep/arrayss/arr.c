#include <stdio.h>

void main(){
    
    int arr[4];

    printf("Enter Values : \n");

    for(int index = 0; index <=4; index++ ){
        scanf("%d",&arr[index]);
    }

    for(int index = 0; index <=4; index++ ){
        printf("%d ",arr[index]);
    }


    
}