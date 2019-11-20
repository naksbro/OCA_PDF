package ocaPDFQuestions;

public class Q136 { //E comp fails at n1 and n2
	public static void main(String[] args) {
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;
		} catch (ArithmeticException ae) {
			ans = 0 // n1
		} catch (Exception e) {
			System.err.println("Invalid Calculation");
		}
		System.out.println("Answer = "+ans); //n2
	}
}
