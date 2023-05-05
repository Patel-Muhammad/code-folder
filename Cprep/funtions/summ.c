#include <stdio.h>

int sum(int a, int b);

void main(){

int a,b;
    printf("Enter Two Numbers : \n");
    scanf("%d%d",&a,&b);
    printf("%d",sum(a,b));
}

int sum(int a, int b){
    return a + b;
}