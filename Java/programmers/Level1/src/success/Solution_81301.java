package success;

/**
 * 숫자 문자열과 영단어
 * 
 * @author delusidiot
 *
 */

public class Solution_81301 {
	private final String[] numbersAlpha =
		{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public int solution(String s) {
		for (int i = 0; i < numbersAlpha.length; i++) {
			s = s.replaceAll(numbersAlpha[i], String.valueOf(i));
		}
		return Integer.parseInt(s);
	}
}
