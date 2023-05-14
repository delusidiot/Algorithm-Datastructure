package level_1;

import java.util.Arrays;

/**
 * ���￡�� �輭�� ã��
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
        return "�輭���� " + Arrays.asList(seoul).indexOf("Kim") + "�� �ִ�";
    }
}
