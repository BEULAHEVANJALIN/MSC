class X {
	static void staticMethod() {
		System.out.println("Class X");
	}
}
class Y extends X {
	static void staticMethod() {
		System.out.println("Class Y");
	}
}
public class Program_13 {
	public static void main(String[] args) {
		Y.staticMethod();
	}
}
