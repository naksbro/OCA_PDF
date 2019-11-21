package ocaPDFQuestions;

import java.util.ArrayList;

public class Q126 { // D does not compile
	public static void main(String[] args) {
		ArrayList<Animal> a = new ArrayList<>();
		a.add(new Tiger());
		
		ArrayList<Hunter> b = new ArrayList<>();
		b.add(new Cat());
		
		ArrayList<Hunter> c = new ArrayList<>();
		c.add(new Tiger());
		
		ArrayList<Tiger> d = new ArrayList<>();
		d.add(new Cat());
		
		ArrayList<Animal> e = new ArrayList<>();
		e.add(new Cat());
 	}
}

class Animal {
	Animal(){
		
	}
}

class Hunter {
	Hunter(){
		
	}
}

class Tiger {
	Tiger(){
		
	}
}

class Cat {
	Cat(){
		
	}
}


