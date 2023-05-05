#include <stdio.h>

void main(){

    int a,b;

    printf("Enter two Numbers: \n");
    scanf("%d%d",&a,&b);

    // Before Swapping
    printf("Before Swapping: \n");
    printf("a = %d \nb = %d\n", a,b);

    // Swapping
    int temp = a;
    a = b;
    b = temp;

    //After Swapping
    printf("After Swapping:\n");
    printf("a = %d \nb = %d\n ", a,b);

}