#include<stdio.h>
#include<stdlib.h>

int validSum(int x){
	if (x > 0){
		return (x);	
	}
	else {
		validSum(x + 26);
	}
}

int encryptLowerChar (char c, int key) {
	int asciiOfa = 'a';
	return ((validSum(c - asciiOfa + key)%26) + asciiOfa);
}

int encryptUpperChar (char c, int key) {
	int asciiOfA = 'A';
	return ((validSum(c - asciiOfA + key)%26) + asciiOfA);
}

void encryption (char* ciphertext, int key,char* encryptedMessage) {
	char c;
	char cipher;
	for (int i = 0; ciphertext[i] != '\0'; i++ ) {
		c = ciphertext[i];
		if (c >= 'a' && c <= 'z') {
			cipher = encryptLowerChar (c, key);
		}

		else if (c >= 'A' && c <= 'Z') {
		    cipher = encryptUpperChar (c, key);
		}
		
		else {
			cipher = c;
		}
		encryptedMessage[i] = cipher;
	}

}

int decryptLowerChar (char p, int key) {
	int asciiOfa = 'a';
	return ((validSum(p - asciiOfa - key)%26) + asciiOfa);
}

int decryptUpperChar (char p, int key) {
	int asciiOfA = 'A';
	return ((validSum(p - asciiOfA - key)%26) + asciiOfA);
}

void decryption (char* plaintext, int key,char* decryptedMessage) {
	char p;
	char plain;
	for (int i = 0; plaintext[i] != '\0'; i++ ) {
		p = plaintext[i];
		if (p >= 'a' && p <= 'z') {
			plain = decryptLowerChar (p, key);
		}

		else if (p >= 'A' && p <= 'Z') {
		    plain = decryptUpperChar (p, key);
		}
		
		else {
			plain = p;
		}
		decryptedMessage[i] = plain;
	}

}


int main() {

	
	char message[50];
	char encryptedMessage[50];
	char decryptedMessage[50];
	printf ("Enter the Plain Text: ");
	fgets (message, sizeof(message), stdin); 
	int key;
	printf ("Enter the key value: ");
	scanf ("%d",&key);	
	encryption (message, key, encryptedMessage);
	printf("Encrypted Text: %s",encryptedMessage);
    	decryption (encryptedMessage, key, decryptedMessage);
	printf("After decryption : %s",decryptedMessage);
	return 0;
}

