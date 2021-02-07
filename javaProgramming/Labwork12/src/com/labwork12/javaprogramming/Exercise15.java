package com.labwork12.javaprogramming;

class SuperClass{
	public int doIt(String str, Integer... data)throws Exception {
		String signature = "(String, Integer[])";
		System.out.println(str + " " + signature);
		return 1;
		}
}
public class Exercise15 extends SuperClass{
	public int doIt(String str, Integer... data) {
		String signature = "(String, Integer[])";
		System.out.println("Overridden: " + str + " " +signature);
		return 0;
	}
	public static void main(String... args) throws Exception {
		SuperClass sb = new Exercise15();
		sb.doIt("hello", 3);
	}
}