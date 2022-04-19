package success;

/**
 * ÀÚ¸´¼ö ´õÇÏ±â
 * @author delusidiot
 *
 */
public class Solution_12931 {

	public static void main(String[] args) {
		Solution_12931 solution = new Solution_12931();
		System.out.println(solution.solution(123));
	}
	public int solution(int n) {
        return String.valueOf(n).chars().map(num -> num - '0').sum();
    }
}
