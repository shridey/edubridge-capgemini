package july11;

public class FouthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percentage = 80.0;
		double maths = 60.0;
		
		boolean admitAND = percentage >= 70 && maths > 55;
		boolean admitOR = percentage >= 70 || maths > 55;
		
		boolean not = !true;
		
		System.out.println("Admitted AND: " + admitAND);
		System.out.println("Admitted OR: " + admitOR);
		System.out.println("NOT: " + not);
	}

}
