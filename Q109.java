package ocaPDFQuestions;

public class Q109 extends CD { // C (comment out each option one by one to test)
	int c;
	Q109(int r, int c){
		// A
//		super.r = r;
//		this.c = c;
//		
//		// B
//		super(r);
//		this(c);
		
		// C
		super(r);
		this.c = c;
		
		// D
//		this.c = r;
//		super(c);
	}

}

class CD {
	int r;
	CD(int r){
		this.r = r;
	}
}
