package success;

/**
 * 문자열을 정수로 바꾸기
 * @author delusidiot
 *
 */
public class Solution_12925 {

	public static void main(String[] args) {
		Solution_12925 solution = new Solution_12925();
		System.out.println(solution.solution("1234"));
		System.out.println(solution.solution("-1234"));
	}
	
	public int solution(String s) {
        return Integer.parseInt(s);
    }
}
