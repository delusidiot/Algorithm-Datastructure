package level_1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
/**
 * 2016��
 * @author delusidiot
 *
 */
public class Solution_12901 {

	public static void main(String[] args) {
		Solution_12901 solution = new Solution_12901();
		System.out.println(solution.solution(5, 24));

	}
	public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}
