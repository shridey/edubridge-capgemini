package challenges;

import java.util.Scanner;

public class KermitHops {
	
	private static int calculateDistance(int hops){
		int [] distance = {20, 10, 5};
		int totalDistance = 0;
		
		for(int i = 0; i < hops; i++) {
			totalDistance += distance[i % 3];
		}
		return totalDistance;
	}
	
//	static int calculateDistance(int numberOfHops) {
//		int distance = 0; // 20, 30, 35, 55
//		int hopCount = 0; // 1, 2, 0, 1
//		int hopInit = 20; // 10, 5, 20, 10
//		
//		for (int i = 1; i <= numberOfHops; i++) {
//			if (hopCount == 0) {
//				distance += hopInit;
//				hopInit /= 2;
//				hopCount++;
//			} else if (hopCount == 1) {
//				distance += hopInit;
//				hopInit /= 2;
//				hopCount++;
//			} else if (hopCount == 2) {
//				distance += hopInit;
//				hopCount = 0;
//				hopInit = 20;
//			}
//		}
//		
//		return distance;
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hop1 = scanner.nextInt();
		int hop2 = scanner.nextInt();
		int hop3 = scanner.nextInt();
		int hop4 = scanner.nextInt();
		
		scanner.close();
		
		int distance1 = calculateDistance(hop1);
		int distance2 = calculateDistance(hop2);
		int distance3 = calculateDistance(hop3);
		int distance4 = calculateDistance(hop4);
		
		System.out.println(distance1);
		System.out.println(distance2);
		System.out.println(distance3);
		System.out.println(distance4);
	}

}
