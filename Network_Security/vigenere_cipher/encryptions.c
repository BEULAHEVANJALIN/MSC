#include<stdio.h>
#include<stdlib.h>

int validSum(int x){
	if (x > 0){
		return (x);	
	}
	else {
		return validSum(x + 26);
	}
}

int ceasarEncrypt (char c, int key,int offset) {
	return ((validSum(c - offset + key)%26) + offset);
}


