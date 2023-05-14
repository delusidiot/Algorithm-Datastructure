package level_2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * �� �ʰ�
 * @author delusidiot
 *
 */
public class Solution_42626 {

	public static void main(String[] args) {
		Solution_42626 solution = new Solution_42626();
		int[] scovile = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution.solution(scovile, K));

	}
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
		while (queue.size() > 1 && queue.peek() < K) {
			queue.add(queue.poll() + (queue.poll() * 2));
			answer++;
		}
        return queue.peek() < K ? -1 : answer;
    }
}
