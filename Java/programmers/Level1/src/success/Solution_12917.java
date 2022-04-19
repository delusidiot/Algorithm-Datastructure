package success;

import java.util.Collections;
/**
 * 문자열 내림차순으로 배치하기
 * @author delusidiot
 *
 */
public class Solution_12917 {

	public static void main(String[] args) {
		Solution_12917 solution = new Solution_12917();
		String s = "Zbcdefg";
		System.out.println(solution.solution(s));

	}
	public String solution(String s) {
        return s.chars().boxed().sorted(Collections.reverseOrder()).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
