package package2;

import package1.A;

public class B {

	public void method2B(A a) {

		// ERROR - because y is "default" access in A, and A is another package.
		// System.out.println(" a has x= " + a.y);

	}
	
public void method3B(A a) {
		// ERROR - because y is "protected" access in A, and A is another package.
		//System.out.println(" a has x= " + a.z);

	}

}
