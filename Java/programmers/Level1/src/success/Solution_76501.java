package success;

/**
 * 음양 더하기
 * @author delusidiot
 *
 */

public class Solution_76501 {
	public static void main(String[] args) {
		Solution_76501 solution = new Solution_76501();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(solution.solution(absolutes, signs));
	}
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			answer += signs[i] ? absolutes[i] : -absolutes[i];
		}
        return answer;
    }
}
