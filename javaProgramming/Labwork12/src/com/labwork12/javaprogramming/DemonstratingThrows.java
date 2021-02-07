package com.labwork12.javaprogramming;
class MyFruit1 {
	private String fruitName;
	private int fruitQuantityInKG;
	public MyFruit1(String fruitName, int fruitQuantityInKG ) {
		this.fruitName = fruitName;
		this.fruitQuantityInKG = fruitQuantityInKG;
	}
	public void add(MyFruit1 that) throws Exception {
		if(!this.fruitName.equals(that.fruitName)) {
			throw new Exception("Fruit names " + this.fruitName + " and " + that.fruitName + " are different");
		}
		this.fruitQuantityInKG = this.fruitQuantityInKG + that.fruitQuantityInKG;
	}	
	public String toString() {
		return fruitQuantityInKG + " " + fruitName;
	}
}
public class DemonstratingThrows {
	public static void main(String[] args) throws Exception {
		MyFruit1 fruit1 = new MyFruit1 ("Apple", 10);
		MyFruit1 fruit2 = new MyFruit1 ("Orange", 7);

		fruit1.add(fruit2);
		System.out.println(fruit1);
	}
}