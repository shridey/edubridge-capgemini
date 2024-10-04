package challenges;

public class WhiteSpaces {
	
	public static String removeWhiteSpaces(String str) {
	    if (str == null || str.isEmpty()) {
	        return str;
	    }
	    
	    return str.replaceAll(" ", "");
	}
	
	public static String replaceWhiteSpaces(String str, char c) {
	    if (str == null || str.isEmpty()) {
	        return str;
	    }
	    
	    return str.replaceAll(" ", String.valueOf(c));
	}

	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("A Cat Sat On A Dog"));
		System.out.println(replaceWhiteSpaces("A Cat Sat On A Dog", '-'));
	}

}
