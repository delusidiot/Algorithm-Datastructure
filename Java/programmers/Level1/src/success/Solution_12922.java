package success;
/**
 * 수박수박수박수박수박수?
 * @author delusidiot
 *
 */
public class Solution_12922 {

	public static void main(String[] args) {
		Solution_12922 solution = new Solution_12922();
		System.out.println(solution.solution(1));
		System.out.println(solution.solution(2));

	}
	
	public String solution(int n) {
        String answer = "수박";
        return answer.repeat(n / 2) + ((n % 2 == 1) ? "수" : "");
    }

}
