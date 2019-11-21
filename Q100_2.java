package ocaPDFQuestions;

public class Q100_2 {
	private double kWh;
	private double rate = 0.07;
	private double bill;
	
	// n1
	// A
	public void addKWhA(double kWh) {
		if (kWh > 0) {
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}
	
	// B
	public void addKWhB(double kWh) {
		if (kWh > 0) {
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}
	
	// C
	public void addKWhC(double kWh) {
		if (kWh > 0) {
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}
	
	// D
	public void addKWhD(double kWh) {
		if (kWh > 0) {
			this.kWh += kWh;
			setBill(this.kWh);
		}
	}
	public void setBill(double kWh) {
		bill = kWh*rate;
	}
}
