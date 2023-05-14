package level_2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * ��ü���� ���
 * @author delusidiot
 *
 */
public class Solution_1835 {
	char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
	int result = 0;
	public static void main(String[] args) {
		Solution_1835 solution = new Solution_1835();
		String[] data = {"N~F=0", "R~T>2"};
		System.out.println(solution.solution(2, data));
		String[] data2 = {"M~C<2", "C~M>1"};
		System.out.println(solution.solution(2, data2));
	}
	public int solution(int n, String[] data) {
		result = 0;
        DFS(new Stack<Character>(), new HashSet<Character>(), n, data);
        return result;
    }
	
	private void DFS(Stack<Character> stack, Set<Character> check, int n, String[] data) {
		if (stack.size() == 8) {
			if (checkData(stack, n, data)) {
				result++;
			}
			return ;
		}
		for (int i = 0; i < friends.length; i++) {
			if (!check.contains(friends[i])) {
				check.add(friends[i]);
				stack.add(friends[i]);
				DFS(stack, check, n, data);
				stack.pop();
				check.remove(friends[i]);
			}
		}
	}
	
	private boolean checkData(Stack<Character> stack, int n, String[] data) {
		for (int i = 0; i < n; i++) {
			int interval = data[i].charAt(4) - '0';
			int count = -1;
			boolean val = false;
			for (char ch: stack) {
				if (data[i].charAt(0) == ch || data[i].charAt(2) == ch)
					val = !val;
				if (val)
					count++;
			}
			switch(data[i].charAt(3)) {
				case '=':
					if (count != interval)
						return false;
					break;
				case '>':
					if (count <= interval)
						return false;
					break;
				case '<':
					if (count >= interval)
						return false;
					break;
			}
		}
		return true;
	}
}
