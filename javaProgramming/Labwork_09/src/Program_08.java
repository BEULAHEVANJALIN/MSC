class A1 {
	int i;
}
class B1 extends A1 {
	int j;
	void display() {
		super.i = j + 1;
		System.out.println(j + " " + i);
	}
}
class Program_08 {
	public static void main(String args[]) {
		B1 obj = new B1();	//creating an object of class B1
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}
