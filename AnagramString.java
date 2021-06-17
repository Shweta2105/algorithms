package AlgorithmProb;
/*
 * @author Shweta
 * 
 * program is to check whether the two strings are anagram or not ,
 *  which means whether they are equal in length and has same characters
 */
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		AnagramString ana = new AnagramString();
		String str1 = "heart";
		String str2 = "earth";
		String str3 = "head";
		ana.anagram(str1, str2); //calling anagram method to check
		ana.anagram(str1, str3);

	}

	private void anagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", ""); //taking temp variables
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true; //setting a boolean value
		if (s1.length() != s2.length()) { // if length does not match then anagram returns false
			status = false;
		} else {							//else checks for char  sorting
			char[] arrS1 = s1.toLowerCase().toCharArray();
			char[] arrS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			status = Arrays.equals(arrS1, arrS2); //checks if sorted char arrays are equal
		}
		if (status) {
			System.out.println(str1 + " is anagram to " + str2);
		} else {
			System.out.println(str1 + " is not anagram to " + str2);
		}
	}

}
