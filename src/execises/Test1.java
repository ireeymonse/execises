package execises;

/**
 * Dada una cadena de caracteres, “hola soy juanito”, diseña un algoritmo que
 * invierta las letras de cada palabra: “aloh yos otinauj”
 **/
public class Test1 {

	private static final boolean isLetter(char c) {
		return ('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z' || c == 'Ñ' || c == 'ñ');
	}

	private static final String reverse(String base) {
		String res = "";
		for (int i = base.length() - 1; i >= 0; i--)
			res += String.valueOf(base.charAt(i));
		return res;
	}

	public static final String reverseWords(String base) {
		String res = "", acc = "";
		for (int i = 0; i < base.length(); i++) {
			char c = base.charAt(i);
			if (isLetter(c))
				acc += String.valueOf(c);
			else {
				res += (acc.length() > 0 ? reverse(acc) : "") + String.valueOf(c);
				acc = "";
			}
		}
		res += reverse(acc);
		return res;
	}
}
