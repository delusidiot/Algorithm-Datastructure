package level_1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * �� �� �̾Ƽ� ���ϱ�
 * @author delusidiot
 *
 */

public class Solution_68644 {

	public static void main(String[] args) {
		Solution_68644 soution = new Solution_68644();
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(soution.solution(numbers)));

	}

	public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < numbers.length -1; i++) {
        	for (int j = i + 1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
