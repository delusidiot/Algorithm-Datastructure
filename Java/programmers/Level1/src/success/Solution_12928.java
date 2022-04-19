package success;

import java.util.ArrayList;
import java.util.List;

/**
 * 약수의 합
 * @author delusidiot
 *
 */
public class Solution_12928 {
	public static void main(String[] args) {
		Solution_12928 solution = new Solution_12928();
		
		System.out.println(solution.solution(12));
		System.out.println(solution.solution(5));
	}
	public int solution(int n) {
		List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
        	if (n % i == 0) {
        		list.add(i);
        		if (i != n / i)
        			list.add(n / i);
        	}
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
