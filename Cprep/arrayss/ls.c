#include <stdio.h>

void main(){
    int arr[100], target, index, n, ans;

    printf("Enter number of Elements: \n");
    scanf("%d",&n);

    printf("Enter Elements: \n");
    for(index = 0; index <= n-1; index++){
        scanf("%d",&arr[index]);
    }

    printf("Enter target: \n");
    scanf("%d",&target);

    ans = -1;

    for(index = 0; index <= n-1; index++){
        if(arr[index] == target){
            ans = 0;
            ans = index + 1;
        }
    }
    printf("The Element is at %d position.\n",ans);
    

}