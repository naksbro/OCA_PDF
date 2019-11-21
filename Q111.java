package ocaPDFQuestions;

public class Q111 { // E compilation fails at line of int d
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
		System.out.println(d);
	}
}
