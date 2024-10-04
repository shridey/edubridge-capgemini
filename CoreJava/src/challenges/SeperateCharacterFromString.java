package challenges;

public class SeperateCharacterFromString {
	
	public static char[] seperateCharacters(String str) {
		char[] arr = str.toCharArray();
		return arr;
	}

	public static void main(String[] args) {
		char[] arr = seperateCharacters("Shridhar");
		
		for (char c: arr) {
			System.out.print(c + ", ");
		}
	}

}
