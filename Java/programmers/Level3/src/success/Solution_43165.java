package success;

public class Solution_43165 {

	public static void main(String[] args) {
		Solution_43165 s = new Solution_43165();
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(s.solution(numbers, target));
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
