#include <stdio.h>
void main(){

    int c = 0, n;
    printf("Enter Number of elements u want: \n");
    scanf("%d",&n);
    int arr[n-1];
     
    for(int index = 0; index < n; index++){
        scanf("%d",&arr[index]);
    }
    for(int index = 0; index < n; index++){
        printf("%d ",arr[index]);
    }

    for(int index = 0; index < n; index++){
        c = c + arr[index];
    }

    float avg =(float) c/n;
    printf("Avg is %f \n",avg);


}