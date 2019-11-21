package ocaPDFQuestions;

public class Q107 extends A { // D ClassCastException at line n1
	public void test () {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new Q107();
		b1 = (A) b2;
		A b3 = (B) b2; //n1
		A b4 = (B) b2; //n2
		b1.test();
		b3.test();
	}
}

class A {
	public void test() {
		System.out.println("A");
	}
}

class B extends A {
	public void test() {
		System.out.println("B");
	}
}
