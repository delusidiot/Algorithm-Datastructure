package success;

import java.util.Arrays;

/**
 * ���� ���� �� �����ϱ�
 * 
 * @author delusidiot
 * for������ ������...
 */
public class Solution_12935 {

	public static void main(String[] args) {
		Solution_12935 solution = new Solution_12935();
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution.solution(arr)));

	}
	public int[] solution(int[] arr) {
		if (arr.length == 1) return new int[] {-1};
		return Arrays.stream(arr).filter(num -> num != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}
