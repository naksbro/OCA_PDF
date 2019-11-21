package ocaPDFQuestions;

abstract class Q105 { // A, D, E
	int price;
	
	// A
	public static void insertToy(){
		// code goes here
	}
	// B
	public abstract Q105 getToy() {
		return new Q105();
	}
	// C
	public void printToy();
	
	// D
	public int calculatePrice() {
		return price;
	}
	
	// E
	public abstract int computeDiscount();
	
}
