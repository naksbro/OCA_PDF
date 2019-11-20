package ocaPDFQuestions;

public class Q128 { // C 400.0 : 100.0
	public static void main(String[] args) {
		Q128_2 prt = new Q128_2();
		prt.price = 200;
		double newPrice = 100;
		
		Q128 q128 = new Q128();
		q128.updatePrice(prt, newPrice);
		System.out.println(prt.price+" : "+newPrice);
	}
	public void updatePrice(Q128_2 q, double price) {
		price = price * 2;
		q.price = q.price + price;
	}
}


