package com.labwork12.javaprogramming;
class MyFruit2 {
	private String fruitName;
	private int fruitQuantityInKG;
	public MyFruit2(String fruitName, int fruitQuantityInKG ) {
		this.fruitName = fruitName;
		this.fruitQuantityInKG = fruitQuantityInKG;
	}
	public void add(MyFruit2 that) throws FruitNamesDoNotMatchException {
		if(!this.fruitName.equals(that.fruitName)) {
			throw new FruitNamesDoNotMatchException("Fruit names " + this.fruitName + " and " + that.fruitName + " are different");
		}
		this.fruitQuantityInKG = this.fruitQuantityInKG + that.fruitQuantityInKG;
	}
	public String toString() {
		return fruitQuantityInKG + " " + fruitName;
	}
}
class FruitNamesDoNotMatchException extends Exception {
	public FruitNamesDoNotMatchException(String message) {
		super(message);
	}
}
public class OurOwnExceptions {
	public static void main(String[] args) throws FruitNamesDoNotMatchException {
		MyFruit2 fruit1 = new MyFruit2 ("Apple", 10);
		MyFruit2 fruit2 = new MyFruit2 ("Orange", 7);
		fruit1.add(fruit2);
		System.out.println(fruit1);
	}
}
