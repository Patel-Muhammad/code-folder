#include <stdio.h>

void sum(int n);
void main(){
    int i = 5;
    sum(i);
}

void sum(int n){

    if( n == 0){
        return;
    }
    
    else{
    printf("Hii ");
    sum(n-1);
    }
}


