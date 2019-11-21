package ocaPDFQuestions;

public class Q119 { // B insert x-- (line 8)
	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
			System.out.print(x);
			x--;
		}
	}
	
	public static boolean isAvailable(int x) {
		return x > 0 ? true : false; 
	}
}
