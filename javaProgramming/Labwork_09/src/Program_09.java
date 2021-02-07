class A2 {
	public int i;
	public int j;
	A2() {
		i = 1;
		j = 2;
	}
}
class B2 extends A2 {
	int a;
	B2() {
		super();
	}
}
class Program_09 {
	public static void main(String args[]) {
		B2 obj = new B2();
		System.out.println(obj.i + " " + obj.j);
	}
}
