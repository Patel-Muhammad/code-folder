#include<stdio.h>

int power(int base, int expo){
    if(expo == 0){
        return 1;
    }
    return power(base, expo-1) * base;
}

void main(){
    printf("%d",power(2,4));
}