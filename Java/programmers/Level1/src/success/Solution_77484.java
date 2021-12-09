package success;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution_77484 {

	public static void main(String[] args) {
		Solution_77484 solution = new Solution_77484();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));

	}
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeros = 0;
        int collect = 0;
        Set<Integer> nums = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        for (int lotto: lottos) {
        	if (lotto == 0)
        		zeros++;
        	else if(nums.contains(lotto))
        		collect++;
        }
        System.out.println(zeros + "  " + collect);
        answer[0] = (7 - (collect + zeros)) >= 6 ? 6 : 7 - (collect + zeros);
        answer[1] = (7 - (collect)) >= 6 ? 6 : 7 - (collect);
        return answer;
    }
}
