package success;

/**
 * ÇÏ»şµå ¼ö
 * @author delusidiot
 *
 */
public class Solution_12947 {

	public static void main(String[] args) {
		Solution_12947 solution = new Solution_12947();
		System.out.println(solution.solution(10));

	}
	public boolean solution(int x) {
        return x % String.valueOf(x).chars().map(ch -> ch - '0').sum() == 0;
    }
}
