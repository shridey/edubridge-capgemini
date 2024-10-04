package july18;

public class SeventhProgram {
	
	int total;
	double percent;
	double percentage(int s1, int s2, int s3) {
		int total = (s1 + s2 + s3);
		return total / 3.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeventhProgram s = new SeventhProgram();
		System.out.println(s.percentage(67, 65, 98));
	}

}
