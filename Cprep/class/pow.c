#include <stdio.h>
void main(){

    int n,i;
    int p = 1;

    printf("enter the num\n");
    scanf("%d",&n);

    printf("enter the power\n");
    scanf("%d",&i);

    for(int j = 1; j <=i ; j++){
        p = p*n;
    }
    printf("%d\n",p);

}