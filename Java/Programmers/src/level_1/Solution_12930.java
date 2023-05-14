package level_1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * �̻��� ���� �����
 * @author delusidiot
 *
 */
public class Solution_12930 {
	public static void main(String[] args) {
		Solution_12930 solution = new Solution_12930();
		System.out.println(solution.solution("try hello world"));
		System.out.println(solution.solution("try a hello world"));
		System.out.println(solution.solution("try a hello world...   aasdf"));
		System.out.println(solution.solution("try a hello world...   "));
	}
	
	public String solution(String s) {
		return Arrays.stream(s.split(" ", -1)).map(
				str -> IntStream.range(0, str.length())
					.map(index-> (index % 2== 0)? Character.toUpperCase(str.charAt(index)): Character.toLowerCase(str.charAt(index)))
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())
				.collect(Collectors.joining(" "));
    }
}
