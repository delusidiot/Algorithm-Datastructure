package level_2;

/**
 * ���̽�ƽ
 * ABCDEFGHIJ K L M  N O P Q R S T U V W X Y Z
 * 12345678910111213 13121110 9 8 7 6 5 4 3 2 1
 */
public class Solution_42860 {

	public static void main(String[] args) {

		Solution_42860 solution = new Solution_42860();
		System.out.println(solution.solution("JEROEN"));
		System.out.println(solution.solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		System.out.println(solution.solution("AAAA"));
		System.out.println(solution.solution("JAN"));

	}
	
	public int solution(String name) {
		int counter = name.chars().map(c -> Math.abs(c - 'A') > 13 ? 26 - Math.abs(c - 'A'):Math.abs(c - 'A')).sum();
		int move = name.length() - 1;
		for (int i = 0; i < name.length(); i++) {
			int idx = i + 1;
			while (idx < name.length() && name.charAt(idx) == 'A')
				idx++;
			move = Math.min(move, i * 2 + name.length() - idx);
			move = Math.min(move, (name.length() - idx) * 2 + i);
		}
		System.out.println(move);
        return counter + move;
    }
}
