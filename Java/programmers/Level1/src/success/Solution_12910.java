package success;

import java.util.Arrays;
/**
 * 나누어 떨어지는 숫자 배열
 * @author delusidiot
 *
 */

public class Solution_12910 {

	public static void main(String[] args) {
		Solution_12910 solution = new Solution_12910();
		int[] arr = {5, 9, 7, 10};
		int divisor = 4; 
		System.out.println(Arrays.toString(solution.solution(arr, divisor)));

	}
	
	public int[] solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(num -> num % divisor == 0).sorted().toArray();
        return answer.length != 0 ? answer : new int[] {-1};
    }
}
