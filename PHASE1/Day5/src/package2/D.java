package package2;

import package1.A;

public class D extends A {

	public void method2D(A a) {

		// ERROR - because y is "default" access in A, and A is another package.
		//System.out.println(" a has x= " + a.y);

	}

	public void method3D(A a) {

		// ERROR - NOT REALLY 
		// System.out.println(" a has x= " + a.z);

	}

}
