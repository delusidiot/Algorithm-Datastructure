package level_1;

/**
 * 짝수와 홀수
 * @author delusidiot
 *
 */
public class Solution_12937 {

	public static void main(String[] args) {
		Solution_12937 solution = new Solution_12937();
		System.out.println(solution.solution(3));
	}
	public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

}
