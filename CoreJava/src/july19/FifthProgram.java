package july19;

public class FifthProgram implements Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FifthProgram fp = new FifthProgram();
		int sum = fp.add(12, 34);
		System.out.println(sum);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
