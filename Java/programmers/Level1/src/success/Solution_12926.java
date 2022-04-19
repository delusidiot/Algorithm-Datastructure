package success;
/**
 * 시저 암호
 * @author delusidiot
 *
 */
public class Solution_12926 {

	public static void main(String[] args) {
		Solution_12926 solution = new Solution_12926();
		System.out.println(solution.solution("AB", 1));
		System.out.println(solution.solution("zabc", 1));
		System.out.println(solution.solution("ZABC12341234", 25));

	}
	public String solution(String s, int n) {
        return s.chars().map(ch -> {
        	if (ch >= 'a' && ch <= 'z') {
        		ch += n;
        		return ch > 'z' ? ch - 26 : ch;
        	} else if (ch >= 'A' && ch <= 'Z') {
        		ch += n;
        		return ch > 'Z' ? ch - 26 : ch;
        	}
        	return ch;
        }).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
