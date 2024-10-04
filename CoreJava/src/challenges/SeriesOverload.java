package challenges;

class Source {
	
	private double factorial(int n) {
		int fact = 1;
		
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	void series(int a, int n) {
		double res = a;
		
		System.out.print(a + " ");
		
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(" - " + a + "/" + i + "!");
				res -= ((double) a / factorial(i));
			} else {
				System.out.print(" + " + a + "/" + i + "!");
				res += ((double) a / factorial(i));
			}
		}
		
		System.out.println(" = " + res);
	}
	
	void series(int n) {
		double res = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "/" + (i+1) + " + ");
				res -= ((double) i / (i+1));
			} else {
				System.out.print(i + "/" + (i+1) + " - ");
				res += ((double)i / (i+1));
			}
		}
		
		System.out.println(res);
	}
	
}

public class SeriesOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source src = new Source();
		src.series(2, 4);
		src.series(4);
	}

}
