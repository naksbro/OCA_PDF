package ocaPDFQuestions;

public class Q137 { // D comp fails due to no ';' after static int count = 0
	static int count = 0
	int i = 0;
	
	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		Q137 c1 = new Q137();
		Q137 c2 = new Q137();
		c1.changeCount();
		c2.changeCount();
		System.out.println(c1.count + " : " + c2.count);
		System.out.println(c1.i + " : " + c2.i);
	}
}
