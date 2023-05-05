#include<stdio.h>

void towerOfHanoi(int n, char a, char b, char c){
    if(n == 1){
        printf("%c => %c\n",a,c);
        return;
    }
    towerOfHanoi(n-1,a,c,b);
    printf("%c => %c \n",a,c);
    towerOfHanoi(n-1,b,a,c);
}

void main(){
    towerOfHanoi(3,'a','b','c');
}