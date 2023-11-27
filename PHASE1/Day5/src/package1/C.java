package package1;

public class C {

	public void method1C(A a) {

		// ERROR - because x is private in A.
		// System.out.println(" a has x= " + a.x);

	}

	public void method2C(A a) {
		
		System.out.println(" a has x= " + a.y);

	}
	
public void method3C(A a) {
		
		System.out.println(" a has x= " + a.z);

	}

}
