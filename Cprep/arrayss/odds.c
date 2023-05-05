#include<stdio.h>

void main()
{
    int arr[100], index, n,count;


    printf("Enter number of Elements: \n");
    scanf("%d",&n);

    printf("Enter Elements: \n");
    for(index = 0 ; index <= n - 1  ;index++)
    {
        scanf("%d",&arr[index]);
    }
    count=0;
   

    for(index = 0; index <= n-1; index++){
        if(arr[index] % 2 != 0)
        {
        count++;
        }
    }
    printf("\n%d",count);
        
    }
        

    
   
