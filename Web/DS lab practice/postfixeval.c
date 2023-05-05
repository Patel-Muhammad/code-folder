#include<stdio.h>
char arr[10];
int stack[10];

int eval(char arr[]){
    int i = 0;
    int a,b,c;
    while(i !='\0'){
        if(isdigit(arr[i])){
            push(arr[i] - '0');
        }
        else{
            int b = pop();
            int a = pop();
            int c;  
            switch (arr[i]){
                case '+':
                c= a+b;

                case '-':
                c= a-b;

                case '*':
                c= a*b;


            }
        }
        i++;
    }
    return pop();
}


void main()
{

}