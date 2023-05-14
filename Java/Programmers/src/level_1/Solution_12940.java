package level_1;

import java.util.Arrays;

/**
 * �ִ������� �ּҰ����
 * @author delusidiot
 *
 */
public class Solution_12940 {

	public static void main(String[] args) {
		Solution_12940 solution = new Solution_12940();
		System.out.println(Arrays.toString(solution.solution(12, 3)));
	}
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
	
	private int gcd(int n, int m) {
		return (m == 0) ? n : gcd(m, n % m);
	}

}
