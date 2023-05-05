#include<stdio.h>

int sumOfDigits(int num){
    if(num < 10)return num;

    return num%10 + sumOfDigits(num/10);
}

void reverseNum(int num){
    if(num < 10){
        printf("%d",num);
        return;
    }
    printf("%d",num%10);
    reverseNum(num/10);
}

void main(){
    int num;
    // printf("Enter a number:");
    // scanf("%d",&num);

    printf("Sum of digits: %d \n",sumOfDigits(12345));
    reverseNum(123);



}