package challenges;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Shridhar";
		String strRev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
			strRev += str.charAt(i);
		}
		
		System.out.println("Reversed: " + strRev);
	}

}
