package level_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution_42583 {

	public static void main(String[] args) {
		Solution_42583 solution_42583 = new Solution_42583();
		int bridge_length = 2;
		int weight = 10; 
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution_42583.solution(bridge_length, weight, truck_weights));

	}
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>(IntStream.of(truck_weights).boxed().collect(Collectors.toList()));
        Queue<Integer> bridge = new LinkedList<Integer>();
        while (!queue.isEmpty() || !bridge.isEmpty()) {
        	answer++;
        	if (bridge.stream().mapToInt(Integer::intValue).sum() + queue.peek() < weight) {
        		bridge.offer(queue.poll());
        	}
        	bridge.poll();
        }
        return answer;
    }
}
