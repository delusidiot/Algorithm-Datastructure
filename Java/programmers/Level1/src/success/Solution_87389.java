package success;

/**
 * 나머지가 1이 되는 수 찾기
 * @author delusidiot
 *
 */

public class Solution_87389 {

	public static void main(String[] args) {
		Solution_87389 solution = new Solution_87389();
		System.out.println(solution.solution(10));

	}
	
	public int solution(int n) {
        int answer = 2;
        while (n % answer != 1)
        	answer++;
        return answer;
    }
}
