package success;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_42840 {
	public static void main(String[] args) {
		Solution_42840 solution = new Solution_42840();
		int[] answers = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution.solution(answers)));
		int[] answers2 = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution.solution(answers2)));
		int[] answers3 = {5,4,4,2,1};
		System.out.println(Arrays.toString(solution.solution(answers3)));
	}
	public int[] solution(int[] answers) {
		int[][] studentAnswers = {
					{1,2,3,4,5},
					{2,1,2,3,2,4,2,5},
					{3,3,1,1,2,2,4,4,5,5}
				};
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <studentAnswers.length; i++)
			map.put(i + 1, counter(studentAnswers[i], answers));
		System.out.println(map);
		int maxValue = map.values().stream().mapToInt(i -> i).max().getAsInt();
		return map.entrySet().stream()
				.filter(a -> a.getValue() == maxValue)
				.map(Map.Entry::getKey)
				.mapToInt(i -> i)
				.sorted().toArray();
    }
	
	public int counter(int[] student, int[] answers) {
		int count = 0;
		for (int i = 0 ;i < answers.length; i++) {
			if (student[i % student.length] == answers[i])
				count++;
		}
		return count;
	}
}
