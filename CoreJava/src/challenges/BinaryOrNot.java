package challenges;

public class BinaryOrNot {
	
	public static boolean isBinaryNumber(int number) {
        String numStr = String.valueOf(number);

        for (char c : numStr.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		System.out.println(isBinaryNumber(10101010));
	}

}
