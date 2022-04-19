package success;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기
 * @author delusidiot
 *
 */

public class Solution_12915 {
	public static void main(String[] args) {
		Solution_12915 solution = new Solution_12915();
		String[] strings = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(solution.solution(strings, 1)));
	}
	
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n))
                return o1.compareTo(o2);
            return o1.charAt(n) - o2.charAt(n);
        });
        return strings;
    }
}
