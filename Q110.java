package ocaPDFQuestions;

public class Q110 { // B (note: on pdf int[] arr is created using parenthesis int[] arr = (1,2,3,4) 
					// in which case answer should be D. comp fails however if {} are used B is correct
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int i = 0;
		do {
			System.out.print(arr[i]+" ");
			i++;
		} while (i < arr.length-1);
		
	}
}
