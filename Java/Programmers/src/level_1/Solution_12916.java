package level_1;
/**
 * ���ڿ� �� p�� y�� ����
 * @author delusidiot
 *
 */
public class Solution_12916 {
	public static void main(String[] args) {
		
	}
	boolean solution(String s) {
		return s.toLowerCase().chars().filter(ch -> ch == 'y').count() == s.toLowerCase().chars().filter(ch -> ch == 'p').count();
    }
}
