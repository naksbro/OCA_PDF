package ocaPDFQuestions;

public class Q106 {
	public static void main(String[] args) {
		Q106_2[] students = new Q106_2[3];
		students[1] = new Q106_2("Richard");
		students[2] = new Q106_2("Donald");
		for (Q106_2 s : students) {
			System.out.println(""+s.name);
		}
	}
}

class Q106_2 {
	String name;
	public Q106_2(String name) {
		this.name = name;
	}
}
