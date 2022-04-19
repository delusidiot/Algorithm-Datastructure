package success;

import java.util.Arrays;
import java.util.Stack;

/**
 * 같은 숫자는 싫어
 * @author delusidiot
 *
 */
public class Solution_12906 {
	public static void main(String[] args) {
		Solution_12906 solution = new Solution_12906();
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution.solution(arr)));
	}
	public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int num: arr) {
        	if (stack.isEmpty() || stack.peek() != num)
        		stack.add(num);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
