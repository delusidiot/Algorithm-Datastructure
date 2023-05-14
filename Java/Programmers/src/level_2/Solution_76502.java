package level_2;

import java.util.Stack;
/**
 * ��ȣ ȸ���ϱ�
 * @author delusidiot
 *
 */
public class Solution_76502 {

	public static void main(String[] args) {
		Solution_76502 solution = new Solution_76502();
		String s = "[](){}";
		System.out.println(solution.solution(s));
		s = "}]()[{";
		System.out.println(solution.solution(s));
		s = "[)(]";
		System.out.println(solution.solution(s));
		s = "}}}";
		System.out.println(solution.solution(s));

	}
	public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
        	stack.clear();
        	int start = i + 1;
        	int end = i;
        	stack.add(s.charAt(i));
        	if (start >= s.length())
    			start = 0;
        	while (start != end) {
        		switch (s.charAt(start)) {
					case ')':
						if (stack.size() > 0 && stack.peek() == '(') {
							stack.pop();
						}
						break;
					case '}':
						if (stack.size() > 0 && stack.peek() == '{') {
							stack.pop();
						}
						break;
					case ']':
						if (stack.size() > 0 && stack.peek() == '[') {
							stack.pop();
						}
						break;
					default:
						stack.add(s.charAt(start));
						break;
				}
        		start++;
        		if (start >= s.length())
        			start = 0;
        	}
        	if (stack.isEmpty())
        		answer++;
        }
        return answer;
    }
}
