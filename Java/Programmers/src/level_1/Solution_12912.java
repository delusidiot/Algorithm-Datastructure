package level_1;
/**
 * �� ���� ������ ��
 * @author delusidiot
 *
 */
public class Solution_12912 {

	public static void main(String[] args) {
		Solution_12912 solution = new Solution_12912();
		System.out.println(solution.solution(3, 5));

	}
	public long solution(int a, int b) {
        return (long)(Math.abs(a - b) + 1) * (a + b) / 2;
    }
}
