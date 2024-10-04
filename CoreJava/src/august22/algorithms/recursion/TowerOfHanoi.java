package august22.algorithms.recursion;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int nDisks = 3;
		towerOfHanoi(nDisks, 'A', 'B', 'C');
	}
	
	public static void towerOfHanoi(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			towerOfHanoi(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			towerOfHanoi(topN - 1, inter, from, to);
		}
	}
}
