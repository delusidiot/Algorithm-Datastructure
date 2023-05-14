package level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ���� �����ձ�
 * @author delusidiot
 *
 */
public class Solution_12981 {

	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		Solution_12981 solution = new Solution_12981();
		System.out.println(Arrays.toString(solution.solution(n, words)));
		n = 5;
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		System.out.println(Arrays.toString(solution.solution(n, words2)));
		n = 2;
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(solution.solution(n, words3)));
		
	}
	
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<String>();
        int i = 1;
        boolean check = true;
        set.add(words[0]);
        while (i < words.length && check) {
        	if (words[i - 1].charAt(words[i-1].length() -1) != words[i].charAt(0) || !set.add(words[i])) {
        		check = false;
        		break;
        	}
        	i++;
        }
        if (i == words.length && check)
        	return new int[] {0,0};
        answer[0] = i % n + 1;
        answer[1] = i / n + 1;
        return answer;
    }
}
