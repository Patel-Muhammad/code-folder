#include <stdio.h>

void main(){
    int row, col;
    int arr[3][3] = {
        {23, 43, 54},
        {33, 55, 2},
        {14, 99, 12}
    };

    for(row = 0; row <= 2; row++){
        for(col = 0; col <= 2; col++){
            printf("%d ",arr[row][col]);
        }printf("\n");
    }
}