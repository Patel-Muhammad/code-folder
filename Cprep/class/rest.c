#include <stdio.h>
void main(){
    int choice;
    int a;

    do{
        printf("1-Burger \n 2-Pizza \n 3-Fries \n 4-Cold Coffee \n");
        scanf("%d",&choice);

        switch(choice){
            case 1:
            printf("Burger\n");
            break;

            case 2:
            printf("Pizza\n");
            break;

            case 3:
            printf("Fries\n");
            break;

            case 4:
            printf("Cold Coffee\n");
            break;

            default:
            printf("Invalid\n");
    
        }

        printf("Want More => Press 1\n");
        scanf("%d",&a);
    }while(a == 1);


}