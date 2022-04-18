package success;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * ÆùÄÏ¸ó
 * @author delusidiot
 *
 */

public class Solution_1845 {

	public static void main(String[] args) {
		Solution_1845 solution = new Solution_1845();
		int[] nums = {3,1,2,3};
		System.out.println(solution.solution(nums));
	}
	public int solution(int[] nums) {
        return Math.min(nums.length / 2, Arrays.stream(nums).boxed().collect(Collectors.toSet()).size());
    }
}
