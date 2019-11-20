package ocaPDFQuestions;

public class Q049 { // C
	String myStr = "7007";
	
	public void doStuff(String str) {
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr: "+myStr+", myNum: "+myNum);
	}
	
	public static void main(String[] args) {
		Q049 obj = new Q049();
		obj.doStuff("9009");
	}
}
