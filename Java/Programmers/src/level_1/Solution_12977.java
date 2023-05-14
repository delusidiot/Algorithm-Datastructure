package level_1;
/**
 * �Ҽ� �����
 * @author delusidiot
 *
 */

public class Solution_12977 {
	private int cnt = 0;
	public static void main(String[] args) {
		Solution_12977 solution = new Solution_12977();
		int[] nums = {1,2,7,6,4};
		
		System.out.println(solution.solution(nums));
	}
	
	public int solution(int[] nums) {
        checkSumPrime(nums, 0, 0, 0);
        return cnt;
    }
	
	public void checkSumPrime(int[] numbers, int sum, int curr, int count) {
		if (count == 3) {
			cnt += (isPrime(sum))? 1 : 0;
			return ;
		}
		for (int i = curr; i < numbers.length; i++) {
			sum += numbers[i];
			checkSumPrime(numbers, sum, i + 1, count + 1);
			sum -= numbers[i];
		}
			
	}
	
	public boolean isPrime(int number) {
		int start = (int)Math.sqrt(number);
		while (start >= 2) {
			if (number % start == 0)
				return false;
			start--;
		}
		return true;
	}
}
