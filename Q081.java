package ocaPDFQuestions;

public class Q081 { // C. A Work done
	public static void main(String[] args) {
		String[] arr = {"A","B","C","D"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if (arr[i].contentEquals("C")) {
				continue;
			}
			System.out.println("Work done");
			break;
		}
	}
}
