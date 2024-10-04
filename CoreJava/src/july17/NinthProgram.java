package july17;

public class NinthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shridhar";
		
		System.out.println("String name: " + name);
		
		char[] n = name.toCharArray();
		
		int len = n.length;
		
		System.out.print("char array n: ");
		for (int i = 0; i < len; i++) {
			System.out.print(n[i]);
		}
		System.out.println();
		
		char[] reverse = new char[len];
		
		for (int i = len - 1; i >= 0; i--) {
            reverse[i] = n[len - 1 - i];
        }
		
		System.out.print("char array reverse: ");
		for (int i = 0; i < len; i++) {
			System.out.print(reverse[i]);
		}
	}
}
