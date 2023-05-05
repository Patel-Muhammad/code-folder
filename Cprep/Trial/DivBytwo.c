#include<stdio.h>

int main(){

    printf("Write a number you wanna check: ");
    int number;
    scanf("%d", &number);

    printf("%d", number%2 == 0 );

    return 0;
}