#include <stdio.h>
void main(){
    int arr[100]; //= {23, 45, 67, 7, 99, 28};
    int value,index,position,n;

    printf("Enter total number of elements in the array: \n");
    scanf("%d",&n);

    printf("Enter Elements:\n");
    
    for (index = 0; index < n; index++){
        scanf("%d",&arr[index]);
    }
    
    printf("Enter the value to be inserted: \n");
    scanf("%d",&value);
    printf("Enter the Position at which the Value is to inserted: \n");
    scanf("%d",&position);

    for ( index = n-1; index >= position-1; index--){
        arr[index + 1] = arr[index];  
    }
    arr[position - 1] = value;
    n++;

    for ( index = 0; index < n; index++){
        printf("%d ",arr[index]);
    }
    
}