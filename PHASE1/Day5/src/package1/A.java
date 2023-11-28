package package1;

public class A {

	private int x;
	int y;

	protected int z = 10;

	public int p = 100;

	// Default Constructor
	public A() {
		this.x = 100;
		this.y = 100;
	}

	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getValueOfx() {

		return this.x;

	}

	public void method1A() {

		System.out.println("value of x = " + x);

	}

	public int method2A(int a) {

		return a * a;

	}

	// An overloaded method of above method
	public int method2A(int a, int b) {

		return a * b;

	}

}
