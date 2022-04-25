package success;

import java.util.ArrayList;
import java.util.List;

/**
 * 수식 최대화
 * @author delusidiot
 *
 */
public class Solution_67257 {

	public static void main(String[] args) {
		Solution_67257 solution = new Solution_67257();
		String expression = "100-200*300-500+20";
		System.out.println(solution.solution(expression));

	}
	// + - *
	public long solution(String expression) {
        char[][] oper = {{'-', '+', '*'},
        				 {'-', '*', '+'},
        				 {'+', '-', '*'},
        				 {'+', '*', '-'},
        				 {'*', '-', '+'},
        				 {'*', '+', '-'}};
        List<Character> opers = new ArrayList<>();
        List<Long> nums = new ArrayList<>();
        int i = 0;
        while (expression.length() > i) {
        	int next = i;
        	while (next < expression.length() && Character.isDigit(expression.charAt(next)))
        		next++;
        	nums.add(Long.parseLong(expression.substring(i, next)));
        	if (next < expression.length()) {
        		opers.add(expression.charAt(next));
        	}
        	i = next + 1;
        }
        if (nums.size() <= 1)
        	return nums.stream().mapToLong(Long::longValue).sum();
        long max = 0;
        for (i = 0; i < oper.length; i++) {
        	List<Character> copyOpers = new ArrayList<>(opers);
        	List<Long> copyNums = new ArrayList<>(nums);
        	for (int j = 0; j < oper[i].length; j++) {
        		for (int p = 0; p < copyOpers.size(); p++) {
        			if (copyOpers.get(p) == oper[i][j]) {
        				copyOpers.remove(p);
        				Long first = copyNums.remove(p);
        				Long second = copyNums.remove(p);
        				if (oper[i][j] == '-')
        					copyNums.add(p, first - second);
        				else if (oper[i][j] == '+')
        					copyNums.add(p, first + second);
        				else
        					copyNums.add(p, first * second);
        				p--;
        			}
        		}
        	}
        	max = Math.max(max, Math.abs(copyNums.get(0)));
        }
        return max;
    }
	
}
