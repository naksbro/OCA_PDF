package ocaPDFQuestions;

class Q103 {
	public Q103() {
		System.out.print("A ");
	}
}

class Q103_B extends Q103 {
	public Q103_B() { // n1
		System.out.print("B ");
	}
}

class Q103_C extends Q103_B {
	public Q103_C() { // n2
		System.out.print("C ");
	}
	
	public static void main(String[] args) {
		Q103_C c = new Q103_C();
		System.out.println(c);
	}
}
