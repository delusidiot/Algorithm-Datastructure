package success;

import java.util.Arrays;

/**
 * 서울에서 김서방 찾기
 * @author delusidiot
 *
 */
public class Solution_12919 {

	public static void main(String[] args) {
		Solution_12919 solution = new Solution_12919();
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution.solution(seoul));
	}
	public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
