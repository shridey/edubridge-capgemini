package challenges;

public class TextCases {
	
	public static String invertCases(String str) {
		if (str == null || str.isEmpty()) {
	        return str;
	    }
	    
	    StringBuilder result = new StringBuilder();
	    
	    for (char c : str.toCharArray()) {
	        if (Character.isUpperCase(c)) {
	            result.append(Character.toLowerCase(c));
	        } else if (Character.isLowerCase(c)) {
	            result.append(Character.toUpperCase(c));
	        } else {
	            result.append(c);
	        }
	    }
	    
	    return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(invertCases("Shridhar"));
	}

}
