package level_2;

import java.util.Stack;

/**
 * ¦���� �����ϱ�
 * @author delusidiot
 *
 */
public class Solution_12973 {

	public static void main(String[] args) {
		Solution_12973 solution = new Solution_12973();
		System.out.println(solution.solution("baabaa"));
		System.out.println(solution.solution("cdcd"));
	}
	public int solution(String s)
    {
		Stack<Integer> stack = new Stack<Integer>();
		s.chars().forEach(ch -> {
			if (stack.size() > 0 && stack.peek() == ch)
				stack.pop();
			else
				stack.push(ch);
		});
		System.out.println(stack);
		return stack.size() > 0 ? 0 : 1;
    }
}