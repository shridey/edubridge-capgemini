package july23.abstraction;

abstract class Bird {
	abstract void makesound();    
}

class Duck extends Bird {
	void makesound() {
		System.out.println("Quack Quack");
	}
}

class Owl extends Bird {
	void makesound() {
		System.out.println("Hoot Hoot");
	}    
}

public class SoundDemo {
	
	public static void main(String[] args) {
		Duck d = new Duck();
	    Owl o = new Owl();
	    
	    d.makesound();
	    o.makesound();
	}
}
