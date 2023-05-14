package level_1;
/**
 * ������ �ݾ� ����ϱ�
 * @author delusidiot
 *
 */
public class Solution_82612 {

	public static void main(String[] args) {
		Solution_82612 solution = new Solution_82612();
		System.out.println(solution.solution(3, 20, 4));

	}
	public long solution(int price, int money, int count) {
		return Math.max((long)price * (count * (count + 1) / 2) - money, 0);
    }
}
