package success;

import java.util.Arrays;
import java.util.stream.LongStream;

/**
 * x만큼 간격이 있는 n개의 숫자
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
