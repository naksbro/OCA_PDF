package ocaPDFQuestions;

public class Q140 { // A
	public static void main(String[] args) {
		int wd = 0;
		String days[] = {"sun","mon","wed","sat"};
		for (String s : days) {
			switch (s) {
			case "sat":
			case "sun":
				wd -= 1;
				System.out.println(wd);
				break;
			case "mon":
				wd++;
				System.out.println(wd);
			case "wed":
				wd += 2;
				System.out.println(wd);
			}
		}
		System.out.println(wd);
	}
}
