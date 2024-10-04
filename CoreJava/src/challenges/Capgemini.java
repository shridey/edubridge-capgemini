package challenges;

public class Capgemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "CAPGEMINI";
		
		for (int i = 0; i < company.length(); i++) {
			if (i == company.length() - 1) {
				System.out.print(company.charAt(i));
			} else {
				System.out.print(company.charAt(i) + " ");
			}
		}
	}

}
