// Author : Beulah  Evanjalin
// Central University of Tamil Nadu
// Advanced Programming – Java Lab-5
// Date : 24/08/2020
// Demonstrating the purpose of “this” keyword in Java

	/*class WithoutThis {
		 int regNo;
		 String name;
		 WithoutThis(int regNo, String name) {
			  regNo = regNo; 	NOT POSSIBLE
			  name = name; 		NOT POSSIBLE
		 }
	}
	*/
import java.util.Scanner;
import java.util.Arrays;

class ThisDemo {
		int regNo;
		String name;
		ThisDemo (int regNo,String name){
			this.regNo = regNo; 
			this.name = name;
			System.out.println (regNo + " " + name);
		}
	public static void main (String args[]){
		ThisDemo s1 = new ThisDemo(001,"Beulah");
		ThisDemo s2 = new ThisDemo(002,"Evanjalin");
		ThisDemo s3 = new ThisDemo(003,"Mounika");
		ThisDemo s4 = new ThisDemo(004,"Linet");
		ThisDemo s5 = new ThisDemo(005,"Alena");
	}
}