#include <stdio.h>
void main()
{
    int n,arr[100],index,max;

    printf("enter number of elements\n");
    scanf("%d",&n);

    printf("enter the elements:");
    for(index=0;index<=n-1;index++) 
    {
        scanf("%d",&arr[index]);
    }
    for(index=0;index<=n-1;index++) 
    {
        printf("%d ",arr[index]);
    }
    max=arr[0];
    for(index=0;index<=n-1;index++)
    {
        if(arr[index]>max){
        max=arr[index];
        }
    }
    printf("\n%d",max);
}
