#include<stdio.h>
#include <stdlib.h>
#include<string.h>
#include "encryptions.h"
#define maxLimit 100

char* normalise(char* _text) {
    char* normaliseText = (char*) malloc((sizeof(_text)/sizeof(char)));
    int i=0, j = 0;
    while (_text[i] != '\0') {
        if (_text[i] != ' ' ) {
	    normaliseText [j] = _text [i];
	    j++;
	}
	i++;
    }
    normaliseText [j] = '\0';
    return normaliseText;
}

char* _encryption(char* message, char* keyStream,int f) {
    int lenK = strlen(keyStream)-1;
    char *normalisedText;
    char c;
    int key;
    normalisedText = normalise(message);
    int lenN = strlen(normalisedText);
    char* cipherText = (char *) malloc(lenN);
    for (int i = 0; normalisedText[i] != '\0'; i++ ) {
        c = normalisedText[i];
	    if (c >= 'a' && c <= 'z') {
	        key = keyStream[i % lenK] - 'a';
        	cipherText[i] = ceasarEncrypt(c, f*key, 'a'); 
		}
	    if (c >= 'A' && c <= 'Z') {
	        key = keyStream[i % lenK] - 'A';
        	cipherText[i] = ceasarEncrypt(c, f*key, 'A'); 
		}
    }
    return cipherText;
} 

char* encryption(char* message,char* keyStream) {
    return _encryption(message,keyStream,1);
}


char* decryption (char* encryptedMessage, char* keyStream) {
	return _encryption (encryptedMessage, keyStream, -1);
}

int main() {

char key [maxLimit], message [maxLimit];
char* cipherText;
char* plainText;
printf("Enter the key word: ");
fgets(key, maxLimit, stdin); 

printf("Enter the message to encrypt: ");
fgets(message, maxLimit, stdin); 

cipherText = encryption(message, key);
printf("Encrypted message is %s\n", cipherText);

plainText = decryption(cipherText,key);
printf("Decrypted message is %s\n", plainText);




return 0; 
}