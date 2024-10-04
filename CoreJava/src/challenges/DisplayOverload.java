package challenges;

class Display {
	
	void display() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void display(int n) {
		int length = String.valueOf(n).length();
		
		while (length > 0) {
			int curr = n % 10;
			System.out.println(Math.sqrt(curr));
			n /= 10;
			length--;
		}
	}
	
}

public class DisplayOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display src = new Display();
		src.display();
		src.display(4329);
	}

}
