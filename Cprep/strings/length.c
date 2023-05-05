// without strlen
#include<stdio.h>
void  main(){
    char str[100];
    int i,count = 0;
    printf("Enter your name: ");
    scanf("%s",str);

    for( i = 0; str[i] != '\0'; i++){
        count++;
    }

    printf("Number of characters in str is: %d", count);
}