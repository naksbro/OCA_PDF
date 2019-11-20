package ocaPDFQuestions;

public class Q124 { // B
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		System.out.print("A: ");
		for(int e = 0; e <= 4; e++) { // A
			System.out.print(a[e]);
		}
		
		System.out.println();
		System.out.print("B: ");
		for(int e = 0; e < 5; e+=2) { // B
			System.out.print(a[e]);
		}
		
		System.out.println();
		System.out.print("C: ");
		for(int e = 1; e <= 5; e+=1) { // C
			System.out.print(a[e]);
		}
		
		System.out.println();
		System.out.print("D: ");
		for(int e = 1; e < 5; e+=2) { // D
			System.out.print(a[e]);
		}
	}
}
