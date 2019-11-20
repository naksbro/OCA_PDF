package ocaPDFQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q141 { // A
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
