package july11;

public class FifthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 10;
		counter += 5; // Shorthand operator | counter = counter + 5
		System.out.println("Counter: " + counter); // Counter: 15
		System.out.println("Counter : " + (--counter)); // Pre-Decrement: First Decrement, then Assignment | Counter: 14
        System.out.println("Counter : " + (++counter)); // Pre-Increment: First Increment, then Assignment | Counter: 15
        System.out.println("Counter : " + (counter++)); // Post-Increment: First Assignment, then Increment | Counter: 15, but incremented by one
        System.out.println("Counter : " + (counter--)); // Post-Decrement: First Assignment, then Decrement | Counter: 16, but decremented by one
	}

}
