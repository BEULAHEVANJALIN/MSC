package com.labwork12.javaprogramming;
class MyFruit {
	private String fruitName;
	private int fruitQuantityInKG;
	
	public MyFruit(String fruitName, int fruitQuantityInKG ) {
		this.fruitName = fruitName;
		this.fruitQuantityInKG = fruitQuantityInKG;
	}	
	public void add(MyFruit that) {
		if(!this.fruitName.equals(that.fruitName)) {
			throw new RuntimeException("Fruit names are different");
		}
		this.fruitQuantityInKG = this.fruitQuantityInKG + that.fruitQuantityInKG;
	}	
	public String toString() {
		return fruitQuantityInKG + " " + fruitName;
	}
}
public class DemonstratingThrow {

	public static void main(String[] args) {
		MyFruit fruit1 = new MyFruit ("Apple", 10);
		MyFruit fruit2 = new MyFruit ("Orange", 7);

		fruit1.add(fruit2);
		System.out.println(fruit1);
	}
}