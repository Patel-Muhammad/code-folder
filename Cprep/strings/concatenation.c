#include <stdio.h>
#include <string.h>

void main(){
    char str1[10],str2[10];
    printf("Enter first name: \n");
    gets(str1);
    printf("Enter lasrt name: \n");
    gets(str2);

    //char new[] = strcat(str1,str2);

    puts(strcat(str1,str2));
    
}