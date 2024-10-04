package july17;


public class ThirdProgram {
	public static void main(String[] args) {
		String s = "Shridhar";
		char[] sa = new char[8];
		s.getChars(0, 8, sa, 0);
		
		for (int i = 0; i < 8; i++) {
			System.out.print(sa[i] + " ");
		}
		System.out.println();
		
		String s2 = "Pandey";
		char[] sb = s2.toCharArray();
		
		for (int i = 0; i < 6; i++) {
			System.out.print(sb[i] + " ");
		}
		System.out.println();
		
		String c1 = "Shridhar";
		String c2 = "shridhar";
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareToIgnoreCase(c2));
		
		String e1 = " ";
		
		System.out.println(e1.isEmpty());
		System.out.println(e1.isBlank());
		
		String t1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(t1.charAt(6));
		
		String k = "   Shridhar   ";
		System.out.println(k.trim());
		System.out.println(k.strip());
		System.out.println(k.stripLeading());
		System.out.println(k.stripTrailing());
		
		String v = "Shridhar";
		System.out.println(v.repeat(6));
		
		String w = "Pandey";
		System.out.println(v.equals(w));
	}

}
