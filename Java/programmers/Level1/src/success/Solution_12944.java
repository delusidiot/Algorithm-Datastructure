package success;

import java.util.Arrays;

/**
 * Æò±Õ ±¸ÇÏ±â
 * @author delusidiot
 *
 */
public class Solution_12944 {

	public static void main(String[] args) {
		Solution_12944 solution = new Solution_12944();
		int[] arr = {1,2,3,4};
		System.out.println(solution.solution(arr));

	}
	public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}
