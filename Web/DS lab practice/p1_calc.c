#include<stdio.h>

int add(int a,int b){
    return a + b;
}

int sub(int a,int b){
    return a - b;
}

int mul(int a,int b){
    return a * b;
}

int div(int a, int b){
    return a / b;
}

void main(){
    int a,b,ch;
    printf("\nEnter two integers: ");
    scanf("%d%d",&a,&b);

    printf("\nEnter choice: \n 1.Add    2.Sub    3.Mul    4.Div \n");
    scanf("%d",&ch);
    int c;

    switch(ch){
        case 1:
        c = add(a,b);
        break;

        case 2:
        c = sub(a,b);
        break;

        case 3:
        c = mul(a,b);
        break;

        case 4:
        c = div(a,b);
        break;

        default:
        printf("Wrong input!!");
    }

    printf("Ans is : %d",c);

}