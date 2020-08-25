import java.util.*; 
import java.util.Arrays;
import java.util.LinkedList; 
import java.util.Random;
import java.lang.Math; 
import java.math.BigInteger;
class KeyGeneration {
	LinkedList list = new LinkedList(); 
	int privateKey;

	int gcdFunction(int number1, int number2) {
		    if(number2 == 0){
		        return number1;
		    }
		    return gcdFunction(number2, number1%number2);
    }
	int publicKey(int p, int q) {
		int gcd = 0;
		int phiOfn = (p - 1) * (q - 1);
		for (int k = 1; k < phiOfn; k++) {
			int a = gcdFunction(k,phiOfn);
			if (a ==1) {
				list.add(k); 
			}
		}
		System.out.println("\nThe possible public keys are:" + list);

		Object[] objectAarray = list.toArray();
	  	int length = objectAarray.length;
	  	Integer [] uOfPhiOfn = new Integer[length];
		for(int i =0; i < length; i++) {
		   uOfPhiOfn[i] = (Integer) objectAarray[i];
		}
		Random randGen = new Random();
		int random = randGen.nextInt(length);
		return uOfPhiOfn[random];
	}

	int privateKey(int _publicKey, int _phiOfn) {
		_publicKey = _publicKey % _phiOfn; 
		for (int x = 1; x < _phiOfn; x++) 
		   if ((_publicKey * x) % _phiOfn == 1) 
		      privateKey = x; 
			return privateKey;
	}
	
	BigInteger Encryption(BigInteger _plainLetter, int publicKey, int p, int q) {
		BigInteger n = BigInteger.valueOf(p * q);
		BigInteger _cipherLetter = _plainLetter.pow(publicKey).mod(n);
		return _cipherLetter;
	}

	BigInteger Decryption(BigInteger _cipherLetter, int privateKey, int p, int q) {
		BigInteger n = BigInteger.valueOf(p * q);
		BigInteger _decipherLetter = _cipherLetter.pow(privateKey).mod(n);
		return _decipherLetter;
	}
}



class Rsa {
      
	public static void main( String[] args ) {
	
		Scanner input= new Scanner(System.in);
		KeyGeneration key = new KeyGeneration();

		System.out.println("Enter a string to encrypt: ");
		String plainText = input.nextLine();
		
		System.out.print("\nEnter the first prime number: ");
		int p = input.nextInt();
		System.out.print("Enter the second prime number: ");
		int q = input.nextInt();

		int publicKey = key.publicKey(p,q);
		System.out.println("\npublic key is "+publicKey);
		int privateKey = key.privateKey(publicKey,((p-1)*(q-1)));
		System.out.println("private key is "+privateKey);

		String _decipherText = "";
		List<BigInteger> cipherList = new ArrayList<BigInteger>();
		List<BigInteger> decipherList = new ArrayList<BigInteger>();
		for (int i=0; i < plainText.length(  ); i++) {
			char plainLetter = plainText.charAt(i);
			int _plainLetter = plainLetter;
			BigInteger _cipherLetter = BigInteger.ZERO;
			BigInteger _decipherLetter = BigInteger.ZERO;
			if (_plainLetter != 32) {
				_cipherLetter = key.Encryption(BigInteger.valueOf(_plainLetter), publicKey, p, q);
				cipherList.add(_cipherLetter);
				_decipherLetter = key.Encryption(_cipherLetter, privateKey, p, q);
				decipherList.add(_decipherLetter);
				int a = _decipherLetter.intValue();
				_decipherText = _decipherText + (char)a;
			}
			
		}
		System.out.println("\ncipher list" + cipherList);
		System.out.println("\ndecipher list" + decipherList);
		System.out.println("\nDecipher text is " + _decipherText);

		


	
		
	}
}