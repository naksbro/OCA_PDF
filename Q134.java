package ocaPDFQuestions;

public class Q134 { // A. 1:2:3:4:5:
	public static void main(String[] args) {
		int nums1[] = new int[3];
		int nums2[] = {1,2,3,4,5};
		nums1 = nums2;
		for ( int x : nums1) {
			System.out.print(x + ":");
		}
	}
}
