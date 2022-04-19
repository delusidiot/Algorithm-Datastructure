package success;
/**
 * 서울에서 김서방 찾기
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
        		return "김서방은 " + i + "에 있다";
        }
        return "김서방은 없다";
    }
}
