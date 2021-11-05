package success;

import java.util.Arrays;

public class Solution_42584 {

	public static void main(String[] args) {
		Solution_42584 solution = new Solution_42584();
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution.solution(prices)));

	}
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < answer.length; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j])
					break;
			}
		}
        return answer;
    }
}
