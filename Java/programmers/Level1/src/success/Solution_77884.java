package success;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution_77884 {
	
	private Set<Integer> set = new HashSet<>(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961));

	public static void main(String[] args) {
		Solution_77884 solution = new Solution_77884();
		System.out.println(solution.solution(13, 17));
		

	}
	public int solution(int left, int right) {
        return IntStream.range(left, right + 1).map(num -> {
        	System.out.println(set.contains(num) ? -num : num);
        	return set.contains(num) ? -num : num;
        	}).sum();
    }
}
