package success;

import java.util.Arrays;
/**
 * ¿¹»ê
 * @author delusidiot
 *
 */
public class Solution_12982 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		Solution_12982 solution = new Solution_12982();
		System.out.println(solution.solution(d, budget));
	}
	
	public static void test() {
		int N = 4;
		int M = 15;
		int value = 0;
		int[] coins = { 1,4,5,6 };
		int[] dp = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < N; i++) {
			System.out.println(coins[i]);
			for (int j = coins[i]; j <= M; j++) {
				dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
				System.out.println(j + ":" + dp[j]);
			}
			
		}
		System.out.println(Arrays.toString(dp));
	}
	
	public int solution(int[] d, int budget) {
		Arrays.sort(d);
		int i = 0;
		while (d[i] < budget) {
			budget -= d[i];
			i++;
		}
        return i;
    }
}
