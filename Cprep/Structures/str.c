#include <stdio.h>
#include<string.h>
void main(){

	char str[20];
	printf("Enter a string:\n");
	scanf("%s",str);
	
	printf("Before swapping:\n");
	printf("%s\n",str);
	
	int l = strlen(str);
	
	for(int i = 0; i < l/2; i++){
		int temp = str[i];
		str[i] = str[l - i - 1];
		str[l - i - 1] = temp;
	}
	
	printf("After swapping:\n");
	printf("%s\n",str);

	printf("After swapping:\n");
	printf("%s\n",strrev(str));
	
  }