class A {
	int i;
	void display() {
		System.out.println(i);
	}
}

class B extends A {
	int j;
	void display() {
		System.out.println(j);
	}
}

class Program_07 {
	public static void main(String args[]) {
		B obj = new B();	//creating an object of class B 
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}
