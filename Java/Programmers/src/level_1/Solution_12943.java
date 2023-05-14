package level_1;
/**
 * �ݶ��� ����
 * @author delusidiot
 *
 */
public class Solution_12943 {
	public static void main(String[] args) {
		Solution_12943 solution = new Solution_12943();
		System.out.println(solution.solution(6));
	}
	public int solution(int num) {
        int i = 0;
        long longNum = num;
        for (; i < 500; i++) {
        	if (longNum == 1)
        		return i;
        	longNum = (longNum % 2 == 0) ? longNum / 2 : longNum * 3 + 1 ;
        }
        return longNum == 1 ? i : -1;
    }
}
