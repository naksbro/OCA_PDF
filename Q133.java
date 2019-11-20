package ocaPDFQuestions;

public class Q133 { // A & E
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int x = arr.length;

		// B
//		do {
//			x--;
//			System.out.print(arr[x]+" ");
//		}while (x >= 0);
		
		// E
//		while(x > 0) {
//			System.out.print(arr[--x]+" ");
//		}
		
		// A
		while (x > 0) {
			x--;
			System.out.print(arr[x]+" ");
		}
	}
}
