package ocaPDFQuestions;

import java.time.LocalDate;

public class Q144 { // D. DateTimeException
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012,  01, 32);
		date.plusDays(10);
		System.out.println(date);
	}
}
