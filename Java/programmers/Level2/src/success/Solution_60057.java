package success;

/**
 * 문자열 압축
 * @author delusidiot
 *
 */
public class Solution_60057 {

	public static void main(String[] args) {
		Solution_60057 solution = new Solution_60057();
		System.out.println(solution.solution2("aabbaccc")); //7
		System.out.println(solution.solution2("ababcdcdababcdcd")); //9
		System.out.println(solution.solution2("abcabcdede")); // 8
		System.out.println(solution.solution2("abcabcabcabcdededededede")); //14
		System.out.println(solution.solution2("xababcdcdababcdcd")); //17
		System.out.println(solution.solution2("x")); //1
	}
	public int solution2(String s) {
		int result = Integer.MAX_VALUE;
		for (int i = 1; i <= s.length() / 2 + 1; i++) {
			String start = s.substring(0, i);
			int counter = 1;
			int length = 0;
			int j = i;
			for (; j + i <= s.length(); j += i) {
				String curr = s.substring(j, i + j);
				if (start.equals(curr)) {
					counter++;
				}
				else {
					length += (counter > 1 ? Math.log10(counter) + 1 : 0) + i;
					counter = 1;
					start = curr;
				}
			}
			length += (counter > 1 ? Math.log10(counter) + 1 : 0) + i;
			length += (j < s.length())? s.length() - j : 0;
			result = Math.min(result, length);
		}
		return result;
	}
	
	public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= s.length() / 2 + 1; i++){
            StringBuffer sb = new StringBuffer();
            String prev = s.substring(0, i);
            int count = 1;
            int j = i;
            while (j + i <= s.length()){
                if (prev.equals(s.substring(j, j + i)))
                    count++;
                else{
                    if (count > 1)
                        prev = String.valueOf(count) + prev;
                    count = 1;
                    sb.append(prev);
                    prev = s.substring(j, j + i);
                }
                j += i;
            }
            if (count > 1)
                prev = String.valueOf(count) + prev;
            sb.append(prev);
            if (j < s.length())
            	sb.append(s.substring(j, s.length()));
            if (min > sb.length())
                min = sb.length();
        }
        return min;
    }
}
