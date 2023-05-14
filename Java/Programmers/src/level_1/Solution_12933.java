package level_1;

import java.util.Collections;
/**
 * ���� ������������ ��ġ�ϱ�
 * @author delusidiot
 *
 */
public class Solution_12933 {
	public static void main(String[] args) {
		Solution_12933 solution = new Solution_12933();
		
		System.out.println(solution.solution(118372));
	}
	public long solution(long n) {
        return Long.valueOf(
        		String.valueOf(n).chars().boxed()
        		.sorted(Collections.reverseOrder())
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString());
    }
}
