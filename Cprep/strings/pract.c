#include <stdio.h>
#include <string.h>


void main(){
    char firstName[20];
    printf("Enter Your First Name: \n");
    scanf("%s",firstName);

    int len = strlen(firstName);

    printf("%d",len);
   

}
