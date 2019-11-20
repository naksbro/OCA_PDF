package ocaPDFQuestions;

public class Q044 { // D
	public static void main(String[] args) {
		String stuff = "TV";
		String res = null;
		
		if(stuff.equals ("TV")) {
			res = "Walter";	
		} else if (stuff.contentEquals("Movie")) {
			res = "White";
		} else {
			res = "No Result";
		}
		System.out.println(res);
		
		System.out.println("====");
		res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" : "No Result"; 
		System.out.println(res);
	}
}
