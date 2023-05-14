package level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution_42862 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {1,2,3};
		int[] reserve = {1,2};
		Solution_42862 solution = new Solution_42862();
		System.out.println(solution.solution(n, lost, reserve));

	}
	public int solution(int n, int[] lost, int[] reserve) {
		Set<Integer> lostSet = new HashSet<Integer>(Arrays.stream(lost).boxed().collect(Collectors.toList()));
		Set<Integer> reserveSet = new HashSet<Integer>(Arrays.stream(reserve).boxed().collect(Collectors.toList()));
		Set<Integer> intersection = new HashSet<Integer>(reserveSet);
		intersection.retainAll(lostSet);
		reserveSet.removeAll(intersection);
		lostSet.removeAll(intersection);
		for (Iterator<Integer> iterator = reserveSet.iterator(); iterator.hasNext();) {
			Integer r = (Integer) iterator.next();
			if (lostSet.contains(r))
				lostSet.remove(r);
			else if (lostSet.contains(r - 1))
				lostSet.remove(r - 1);
			else if(lostSet.contains(r + 1))
				lostSet.remove(r + 1);
		}
        return n - lostSet.size();
    }
}
