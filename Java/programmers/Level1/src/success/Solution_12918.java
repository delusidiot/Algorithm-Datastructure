package success;
/**
 * 문자열 다루기 기본
 * @author delusidiot
 *
 */
public class Solution_12918 {

	public static void main(String[] args) {
		Solution_12918 solution = new Solution_12918();
		System.out.println(solution.solution("a234"));
		System.out.println(solution.solution("1234"));

	}
	public boolean solution(String s) {
        return (s.length() == 4 && s.length() == 6) && s.matches("^[0-9]*$");
    }
}
