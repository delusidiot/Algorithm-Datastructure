package success;
/**
 * ���￡�� �輭�� ã��
 * @author delusidiot
 *
 */
public class Solution_12919 {

	public static void main(String[] args) {
		Solution_12919 solution = new Solution_12919();
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution.solution(seoul));
	}
	public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
        	if (seoul[i].equals("Kim"))
        		return "�輭���� " + i + "�� �ִ�";
        }
        return "�輭���� ����";
    }
}
