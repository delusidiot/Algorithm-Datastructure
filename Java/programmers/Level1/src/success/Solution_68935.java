package success;

/**
 * 3진법 뒤집기
 * @author delusidiot
 *
 */

public class Solution_68935 {

	public static void main(String[] args) {
		Solution_68935 solution = new Solution_68935();
		System.out.println(solution.solution(45));
		System.out.println(solution.solution(125));
	}
	
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
        return Integer.parseInt(sb.toString(), 3);
    }

}
