package ocaPDFQuestions;

// on exam classes created in separate packages so we need to import the package name example: import clothing.* or import static clo

public class Q108_2 {
	public void matchShirt() {
		String color = Q108.getColor();
		if(color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	public static void main(String[] args) {
		Q108_2 trousers = new Q108_2();
		trousers.matchShirt();	
		
	}
}
