package success;

/**
 * 가운데 글자 가져오기
 * @author delusidiot
 *
 */

public class Solution_12903 {

	public static void main(String[] args) {
		Solution_12903 solution = new Solution_12903();
		System.out.println(solution.solution("abcde"));
		System.out.println(solution.solution("abcd"));

	}
	
	public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
