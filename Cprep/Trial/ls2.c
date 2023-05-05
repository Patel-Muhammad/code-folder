#include <stdio.h>
#include <string.h>
void main(){
    char name[20][20];
    char target[10];
    int i,n;

    printf("Enter number of names: \n");
    scanf("%d",&n);

    printf("Enter name: ");
    for(i = 0; i < n; i++){
        scanf("%s",name[i]);
    }

    printf("Enter target: ");
    scanf("%s",&target);

    for(i = 0; i < n; i++){
       if(name[i]==target){
        printf("%d",i+1);
       }
    }
}