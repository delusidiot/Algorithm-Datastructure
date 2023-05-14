package level_2;

import java.util.Stack;
/**
 * ū �� �����
 * @author delusidiot
 *
 */
public class Solution_42883 {

	public static void main(String[] args) {
		Solution_42883 solution = new Solution_42883();
		System.out.println(solution.solution("1924", 2));
		System.out.println(solution.solution("1231234", 3));
		System.out.println(solution.solution("4177252841", 4));

	}
	
	public String solution(String number, int k) {
		Stack<Character> stack = new Stack<Character>();
		int deleteCounter = -1;
		stack.add('0');
		for (int i = 0; i < number.length(); i++) {
			while (!stack.isEmpty() && number.charAt(i) > stack.peek() && deleteCounter != k) {
				deleteCounter++;
				stack.pop();
			}
			stack.push(number.charAt(i));
		}
		while (deleteCounter != k) {
			deleteCounter++;
			stack.pop();
		}
        return stack.stream().collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
    }
}
