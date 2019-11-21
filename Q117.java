package ocaPDFQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q117 { // A. int a = ps.indexOf(p2);
	public static void main(String[] args) {
		List ps = new ArrayList();
		Q117P p2 = new Q117P("Mike");
		ps.add(p2);
		
		//A
		int a = ps.indexOf(p2);
		
		//B
//		int b = ps.indexOf(Q117P("Mike"));
		
		//C
//		int c = ps.indexOf(new Patient "Mike"));
		
		//D
		Q117P p = new Q117P("Mike");
		int d = ps.indexOf(p);
		
		if(a >= 0) {
			System.out.print("Mike Found");
		}
	}
}

class Q117P{
	String name;
	public Q117P(String name) {
		this.name = name;
	}
}
