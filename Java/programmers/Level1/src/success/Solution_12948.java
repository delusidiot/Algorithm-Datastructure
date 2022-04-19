package success;

/**
 * 핸드폰 번호 가리기
 * @author delusidiot
 *
 */
public class Solution_12948 {

	public static void main(String[] args) {
		Solution_12948 solution = new Solution_12948();
		System.out.println(solution.solution("01033334444"));

	}
	public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4, phone_number.length());
    }
}
