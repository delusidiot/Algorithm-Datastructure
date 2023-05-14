package level_2;

import java.math.BigInteger;

/**
 * ������ �簢��
 * @author delusidiot
 *
 */
public class Solution_62048 {

	public static void main(String[] args) {
		Solution_62048 solution = new Solution_62048();
		System.out.println(solution.solution(8, 12));
		System.out.println(solution.gcd(8, 12));
		long bigIntegerInGCD = BigInteger.valueOf(8).gcd(BigInteger.valueOf(12)).longValue();
	}
	public long solution(int w, int h) {
        return (long)w * h - (w + h - gcd(w, h));
    }
	public long gcd(int a, int b) {
		return (a % b == 0) ? b : gcd(b, a % b); 
	}
}
