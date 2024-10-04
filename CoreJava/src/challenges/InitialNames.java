package challenges;

public class InitialNames {
	
	public String getInitials(String name) {
		String firstName = name.substring(0, name.indexOf(" "));
		String middleName = name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" "));
		String lastName = name.substring(name.lastIndexOf(" ") + 1);
		
		return firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName;
	}

	public static void main(String[] args) {
		InitialNames iN = new InitialNames();
		System.out.println(iN.getInitials("Tannu FatherName Shukla"));
	}

}
