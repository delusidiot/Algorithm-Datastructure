package level_1;

import java.util.Arrays;
import java.util.stream.LongStream;

/**
 * x��ŭ ������ �ִ� n���� ����
 * @author delusidiot
 *
 */
public class Solution_12954 {

	public static void main(String[] args) {
		Solution_12954 solution = new Solution_12954();
		System.out.println(Arrays.toString(solution.solution(2, 5)));

	}
	public long[] solution(int x, int n) {
        return LongStream.range(1, n + 1).map(num -> num * x).toArray();
    }
}
