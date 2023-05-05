#include <stdio.h>

int lls(int check[], int target, int n);

void main(){

    int arr[] = {32, 54, 67, 34, 88, 99, 23};
    int n = sizeof(arr)/sizeof(arr[0]);
    int sn = 99;
    int ans = lls(arr, sn, n);
    printf("%d",ans);

}

int lls (int check[], int target, int n){
    
    for (int i = 0; i < n; i++){
        if (check[i] == target){
            return i;
        }
    }return -1;

}