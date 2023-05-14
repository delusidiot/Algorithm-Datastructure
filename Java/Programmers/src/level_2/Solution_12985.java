package level_2;

/**
 * ���� ����ǥ
 * @author delusidiot
 *
 */
public class Solution_12985 {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		Solution_12985 solution = new Solution_12985();
		System.out.println(solution.solution(n, a, b));
	}
	public int solution(int n, int a, int b)
    {
        int answer = 0;
        while (a != b) {
        	a = (int)Math.ceil(a / 2.0);
        	b = (int)Math.ceil(b / 2.0);
        	answer++;
        }
        return answer;
    }
	
	public int otherSolution(int n, int a, int b)
    {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}
