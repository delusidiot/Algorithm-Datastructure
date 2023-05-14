package level_2;
/**
 * Ÿ�� �ѹ�
 * @author delusidiot
 *
 */
public class Solution_43165 {
	public static void main(String[] args) {
		
	}
	public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
	
	public int dfs(int[] numbers, int target, int start, int sum) {
		if (start == numbers.length)
		{
			if (target == sum)
				return 1;
			return 0;
		}
		int p = dfs(numbers, target, start + 1, sum + numbers[start]);
		int m = dfs(numbers, target, start + 1, sum - numbers[start]);
		return p + m;
	}
}
