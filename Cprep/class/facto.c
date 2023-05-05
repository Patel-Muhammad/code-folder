#include <stdio.h>
void main(){

    int fact=1,n,i;

    printf("enter the num\n");
    scanf("%d",&n);

    for(i = 1; i <= n; i++){
        fact = fact*i;
    }
    printf("%d\n",fact);

}