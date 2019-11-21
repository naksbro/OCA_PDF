package ocaPDFQuestions;

public class Q099 { // D. 5 (do loop executed once and prints value of num then exits because while condition is false
	public static void main(String[] args) {
		int num = 5;
		do {
			System.out.print(num-- +" ");
		} while (num == 0);
	}
}
