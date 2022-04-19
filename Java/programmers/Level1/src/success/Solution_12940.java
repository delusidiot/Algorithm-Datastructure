package success;

import java.util.Arrays;

/**
 * 최대공약수와 최소공배수
 * @author delusidiot
 *
 */
public class Solution_12940 {

	public static void main(String[] args) {
		Solution_12940 solution = new Solution_12940();
		System.out.println(Arrays.toString(solution.solution(3, 12)));
	}
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
	
	private int gcd(int n, int m) {
		if (m == 0) return n;
		return gcd(m, n % m);
	}

}
