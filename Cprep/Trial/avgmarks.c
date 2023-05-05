#include <stdio.h>
void main(){
    int arr[100], n, i, sum;
    float avg;

    printf("Enter number of elements: \n");
    scanf("%d",&n);

    printf("Enter Elelments: \n");
    for(i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }

    sum = 0;

    for(i = 0; i < n ; i++){
        sum = sum + arr[i];
    }

    avg = (float)sum / n;

    printf("Avg is %f",avg);
}