class X1 {
	public X1(int i) {
		System.out.println(1);
	}
}
class Y1 extends X1 {
	public Y1() {
		super(0);
		System.out.println(2);
	}
}

/*
 * we can't actually create an instance without calling a constructor of its super
 * class. And the jvm doesn't know how to call X1(int) from the Y1() constructor.
 */