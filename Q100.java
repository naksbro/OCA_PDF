package ocaPDFQuestions;

public class Q100 { // B see https://www.briefmenow.org/oracle/how-should-you-write-methods-in-the-electricaccount-cla/ for explanation
	Q100_2 acct = new Q100_2();
	
	public void useElec(double kWh) {
		acct.addKWhA(kWh);
	}
}
