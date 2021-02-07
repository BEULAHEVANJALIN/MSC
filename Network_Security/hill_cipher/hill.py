from itertools import chain 
import string
import numpy

coordinate_matrix = dict()
coordinate_vector = dict()
char_matrix = dict()
char_vector = dict()

coordinate_inv_matrix = dict()
coordinate_inv_vector = dict()
char_inv_matrix = dict()
char_inv_vector = dict()

def multiplicativeInverse(inputValue1, inputValue2):
	for i in range(inputValue2):
		if((inputValue1 * i)%inputValue2 == 1):
			return i

def gcdFunction(number1, number2):
	if(number2 == 0):
		return number1
	return gcdFunction(number2, number1%number2)

def dictToMatrix(inputDict):
	d = numpy.asmatrix(list(inputDict.values()))
	return d.reshape(keyOrder, keyOrder)

def determinant(inputDict):
	d = dictToMatrix(inputDict)
	return int(numpy.linalg.det(d)%26)

def _input(inputString, n):
	if(all('a' <= i <= 'z' for i in inputString) ):
		if(len(inputString) == n):
			return inputString
		else:	
			if(len(inputString) < n):
				print("key length is lesser than given key order!")
			if(len(inputString) > n):
				print("key length is greater than given key order!")	
	else:
		print("Characters other than 'a'-'z' are found!")

def matrixIncrement(inputCoordinate):
    if(inputCoordinate[1] + 1 > keyOrder-1):
        return (inputCoordinate[0]+1, 0)
    else:
        return (inputCoordinate[0], inputCoordinate[1]+1)        

def hillKeyMatrix(key):
	curr_coordinate = (0,0)
	for k in key:
		char_matrix[ord(k)-97] = curr_coordinate
		coordinate_matrix[curr_coordinate] = ord(k)-97
		curr_coordinate = matrixIncrement(curr_coordinate)
		
def hillKeyInverseMatrix(key):
	curr_coordinate = (0,0)
	for k in key:
		char_inv_matrix[k] = curr_coordinate
		coordinate_inv_matrix[curr_coordinate] = k
		curr_coordinate = matrixIncrement(curr_coordinate)		
			
def matrixInverse(inputDict):
	matrixAdjoint = (numpy.linalg.inv(dictToMatrix(inputDict))* numpy.linalg.det(dictToMatrix(inputDict)))
	matrixInverse = (matrixAdjoint * multiplicativeInverse(inverseOfDetValue , 26))%26
	return numpy.round(matrixInverse).astype(int)

def flattenNumpyMatrix(inputMatrix):
	list_of_arrays = []
	for x in numpy.nditer(coordinate_matrix_inverse):
		list_of_arrays.append(x)
	return numpy.array(list_of_arrays).flatten().tolist()

def _cipherText(inputList):
	cipherText = ''
	for i in inputList:
		cipherText += chr((i % 26) + 97)
	return cipherText	

def vectorIncrement(v):
		return (v[0]+1, 0)

def hillPlainTextVector(inputString, input_coordinate_Vector, input_char_vector):
	curr_coordinate = (0,0)
	for s in inputString:
		input_char_vector[ord(s)-97] = curr_coordinate
		input_coordinate_Vector[curr_coordinate] = ord(s)-97
		curr_coordinate = vectorIncrement(curr_coordinate)
	
def _encryption(inputString,  input_coordinate_Matrix, input_coordinate_Vector, input_char_matrix, input_char_vector):
	hillPlainTextVector(inputString, input_coordinate_Vector, input_char_vector)				# Adds elements to the input_matrices and vector_matrices dictionary
	cipher_vector = dict()
	rowWiseCalc = dict()
	for i in range(keyOrder):
		cipher_vector[(i,0)] =  0
		for j in range(keyOrder):
			rowWiseCalc[(j,0)] = input_coordinate_Matrix[(i,j)] * input_coordinate_Vector[(j,0)]
		for k in range(keyOrder):
			cipher_vector[(i,0)] += rowWiseCalc[(k,0)]
	return list(cipher_vector.values())

def splitToLength(inputString, inputValue):
    def _slice(inputString, inputValue):
        while inputString:
            yield inputString[:inputValue]
            inputString = inputString[inputValue:]
    return list(_slice(inputString, inputValue))

def formatWithRespectToKeyOrder(inputString, keyOrder):
	if (len(inputString) % keyOrder != 0):
		padValue = keyOrder - (len(inputString) % keyOrder)
		for i in range(padValue):
			inputString = inputString + 'x'
	return inputString		
		
def encryption(inputString,  input_coordinate_Matrix, input_coordinate_Vector, input_char_matrix, input_char_vector):
	cipherText = []
	inputString = formatWithRespectToKeyOrder(inputString, keyOrder)
	hillPlainTextChuncks = splitToLength(inputString, keyOrder)
	for chunck in hillPlainTextChuncks:
		cipherChunck = _encryption(chunck, input_coordinate_Matrix, input_coordinate_Vector, input_char_matrix, input_char_vector)
		cipherText.append(cipherChunck)
	return _cipherText(list(chain(*cipherText)))

keyOrder = int(input("Cipher key order is "))
keyString = input("Cipher key string is: ")
encryptionKey = _input(keyString, keyOrder**2)			# key should be of size keyOrder^2 and contains only characters 'a' to 'z'
hillKeyMatrix(encryptionKey)
plainText = input("Plain text is ")
cipherText = encryption(plainText, coordinate_matrix, coordinate_vector, char_matrix, char_vector)
print("Cipher Text is ", cipherText)
print(coordinate_matrix)
if(gcdFunction(determinant(coordinate_matrix), 26) == 1):
	inverseOfDetValue = multiplicativeInverse(determinant(coordinate_matrix), 26)
print("inverse of det value", inverseOfDetValue)	
coordinate_matrix_inverse = matrixInverse(coordinate_matrix)
hillKeyInverseMatrix(flattenNumpyMatrix(coordinate_matrix_inverse))
print(coordinate_inv_matrix)
decipherText = encryption(cipherText, coordinate_inv_matrix, coordinate_inv_vector, char_inv_matrix, char_inv_vector)
print("Cipher Text is ", decipherText)



	






	



