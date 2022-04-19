package success;

/**
 * 정수 제곱근 판별
 * @author delusidiot
 *
 */
public class Solution_12934 {

	public static void main(String[] args) {
		Solution_12934 solution = new Solution_12934();
		System.out.println(solution.solution(121));

	}
	
	public long solution(long n) {
        return (long) ((Math.pow((long)Math.sqrt(n), 2) == n) ? Math.pow((long)Math.sqrt(n) + 1, 2) : -1); 
    }

}
