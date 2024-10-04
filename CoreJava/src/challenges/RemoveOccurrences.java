package challenges;

public class RemoveOccurrences {
	
	public String removeOccurrences(String str, char c) {
		String newStr = "";
		
		int firstIndex = str.indexOf(c);
		int lastIndex = str.lastIndexOf(c);
		
		if (firstIndex == -1 && firstIndex == lastIndex) {
			return newStr;
		}
		
		return str.substring(0, firstIndex) + str.substring(firstIndex + 1, lastIndex) + str.substring(lastIndex + 1);
	}

	public static void main(String[] args) {
		RemoveOccurrences ro = new RemoveOccurrences();
		System.out.println(ro.removeOccurrences("Tannu", 'n'));
	}

}
