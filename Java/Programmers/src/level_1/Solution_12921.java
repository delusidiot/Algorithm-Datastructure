package level_1;

import java.util.HashSet;
import java.util.Set;
/**
 * �Ҽ� ã��
 * @author delusidiot
 *
 */

public class Solution_12921 {
	public static void main(String[] args) {
		Solution_12921 solution = new Solution_12921();
		System.out.println(solution.solution(10));
		System.out.println(solution.solution(5));
	}

	public int solution(int n) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 3; i <= n; i+=2) {
			set.add(i);
		}
		set.add(2);
		for (int i = 3; i < Math.sqrt(n); i++) {
			if (set.contains(i)) {
				for (int j = i * 2; j <= n; j += i) {
					set.remove(j);
				}
			}
		}
        return set.size();
    }
}
