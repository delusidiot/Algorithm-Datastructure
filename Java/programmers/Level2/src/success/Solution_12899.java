package success;
/**
 * 124나라의 숫자
 * @author delusidiot
 *
 */
public class Solution_12899 {
	
	public static void main(String[] args) {
		Solution_12899 solution = new Solution_12899();
		System.out.println(solution.solution(1));
		System.out.println(solution.solution(2));
		System.out.println(solution.solution(3));
		System.out.println(solution.solution(4));
		System.out.println(solution.solution(5));
		System.out.println(solution.solution(6));
		System.out.println(solution.solution(7));
		System.out.println(solution.solution(8));
		System.out.println(solution.solution(9));
		System.out.println(solution.solution(10));
	}
	
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n % 3);
			n = (n - 1) /3;
		}
		return sb.reverse().toString().replaceAll("0", "4");
    }
}
