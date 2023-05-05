#include<stdio.h>
void main()
{
    int arr[100],i,n,min;
    printf("enter the no of elements");
    scanf("%d",&n);

    printf("enter values");
    for(i=0;i<=n-1;i++)
    {
        scanf("%d",&arr[i]);
    }
    min=arr[0];
    for(i=0;i<=n-1;i++)
    {
        if(arr[i]<min)
        {
        min=arr[i];
        }
    }
    printf("%d",min);
}