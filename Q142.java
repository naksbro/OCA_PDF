package ocaPDFQuestions;

class Q{
	String name;
	int age;
}

public class Q142 { // C
	public static void main(String[] args) {
		Q q1 = new Q();
		Q q2 = new Q();
		Q q3 = new Q();
		q1 = q3;
		q3 = q2;
		q2 = null; 
		// q1 eligible for garbage collection
	}
}

