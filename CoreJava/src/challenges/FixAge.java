package challenges;

public class FixAge {
	
	static String fixage(int[] arr) {
		
//		if (arr.length >= 1 && arr.length <= Math.pow(10, 5)) {
			String fixStr = "";
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 18 && arr[i] <= 60) {
					if (fixStr.length() > 0) {
						fixStr += "," + arr[i];
					} else {
						fixStr += arr[i];
					}
				}
			}
			
			if (fixStr.length() == 0) {
				fixStr = "NA";
			}
			
			return fixStr;
//		}
		
//		return "";
	}
	
	public static void main(String[] args) {
//		int[] arr = {6, 5, 15, 25, 78, 59, 45};
		int[] arr1 = {};
		System.out.println(fixage(arr1));
	}
	
}
