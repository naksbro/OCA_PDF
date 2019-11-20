package ocaPDFQuestions;

public class Q131 { // C main method being overloaded takes last iteration 
	public static void main(int[] args) {
		System.out.println("int main "+args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Obj main "+args[0]);
	}
	public static void main(String[] args) {
		System.out.println("Str main "+args[0]);
	}
}