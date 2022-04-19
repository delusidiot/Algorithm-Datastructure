package success;

import java.util.Arrays;
/**
 * 자연수 뒤집어 배열로 만들기
 * @author delusidiot
 *
 */
public class Solution_12932 {

	public static void main(String[] args) {
		Solution_12932 solution = new Solution_12932();
		System.out.println(Arrays.toString(solution.solution(12345)));
	}
	public int[] solution(long n) {
		StringBuilder sb = new StringBuilder();
		String.valueOf(n).chars().forEach(ch -> {
			sb.insert(0, ch - '0');
		});
        return sb.toString().chars().map(ch -> ch - '0').toArray();
    }
}
