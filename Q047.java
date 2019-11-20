package ocaPDFQuestions;

public class Q047 { // D
	
}

interface Readable{
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable {
	public void readBook() {
		
	}
}

class EBook extends Book{
	public void ReadBook() {
		
	}

	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}
}