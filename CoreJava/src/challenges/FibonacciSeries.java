package challenges;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	static int num1 = 0, num2 = 1, num3 = 0;

	static List<Integer> fibonacciSeries(int count, List<Integer> series) {
		if (count > 0) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			series.add(num3);
			fibonacciSeries(count - 1, series);
		}
		return series;
	}

	public static void main(String[] args) {
		List<Integer> series = new ArrayList<>();
		series.add(0);
		series.add(1);
		
		List<Integer> list = fibonacciSeries(8, series);
		
		System.out.println(list);
	}
}