package august21.assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		checkPrimeGood(num);
		checkPrimeBetter(num);
		checkPrimeBest(num);
	}
	
	public static void checkPrimeGood(int n){
		boolean isPrime = true;
		
		if(n <= 1){
			isPrime = false;
		} else {
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println("Good Algorithm: " + n + " is a Prime Number!");
		} else {
			System.out.println("Good Algorithm: " + n + " is not a Prime Number!");
		}
	}
	
	public static void checkPrimeBetter(int n){
		boolean isPrime = true;
		
		if(n <= 1){
			isPrime = false;
		} else {
			for(int i = 2; i <= n/2; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println("Better Algorithm: " + n + " is a Prime Number!");
		} else {
			System.out.println("Better Algorithm: " + n + " is not a Prime Number!");
		}
	}
	
	public static void checkPrimeBest(int n){
		boolean isPrime = true;
		
		if(n <= 1){
			isPrime = false;
		} else {
			for(int i = 2; i <= Math.sqrt(n); i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println("Best Algorithm: " + n + " is a Prime Number!");
		} else {
			System.out.println("Best Algorithm: " + n + " is not a Prime Number!");
		}
	}
}
