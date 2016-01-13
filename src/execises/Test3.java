package execises;

/**
 * A k-palindrome is a string which transforms into a palindrome on removing at
 * most k characters.
 * <p>
 * Given a string S, and an integer K, print "YES" if S is a k-palindrome;
 * otherwise print "NO". <br>
 * Constraints: <br>
 * S has at most 20,000 characters. <br>
 * 0&lt;=k&lt;=30
 * <p>
 * Sample Test Case#1: <br>
 * Input - abxa 1 <br>
 * Output - YES <br>
 * Sample Test Case#2: <br>
 * Input - abdxa 1 <br>
 * Output - No
 * 
 * @author eigarcia
 */
public class Test3 {
	public static final void isKPalindrome(String base, int k) {
		// if (k < 0 || k > 30 || base.length() > 20000)
		// throw new IllegalArgumentException();
		// main: for (int i = 0; i < base.length(); i++) {
		// char a = base.charAt(i);
		// }
	}
	
	//this area is for debugging purposes XD

	private static final String randomChar() {
		return String.valueOf((char) ('a' + Math.random() * ('z' - 'a')));
	}

	public static final String kPalindrome(int k) {
		int l = (int) (Math.random() * 20);
		String p = Math.random() > 0.5 ? "" : randomChar();
		for (int i = 0; i < l; i++) {
			String r = randomChar();
			p = r + p + r;
		}

		while (k-- > 0) {
			int i = (int) (Math.random() * p.length());
			p = p.substring(0, i) + randomChar() + p.substring(i);
		}
		return p;
	}
}
