package july11;

public class SixthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 800;
		
		int num3 = 400;
		int num4 = 500;
		
		// Conditional or Ternary Operator
		int first = (num1 > num2) ? num1 : num2;
		int second = (num3 > num4) ? num3 : num4;
		
		int greatest = (first > second) ? first : second;
		
		System.out.println("Greatest value: " + greatest);
	}

}
