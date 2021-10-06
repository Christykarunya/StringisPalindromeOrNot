package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*//Input-"madam" is Palindrome or not
		String str = "madam";
		String strRev = "madam";
		if(str.equals(strRev)){
			System.out.println("The given String '" + str + "' is a Palindrome");
		}
		else {
			System.out.println("The given String '" + str + "' is not a Palindrome");
		}*/

		String str1 = "madam";
		String str2 = "";
		int length = str1.length();
		System.out.println("Length of the array : " +length);
		for (int i = length - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
			if (str1.equals(str2)) {
				System.out.println("The given String '" + str1 + "' is a palindrome");
			}

			else {
				System.out.println("The given string '" + str1 + "' is not a palindrome");
			}

		
	}
}

