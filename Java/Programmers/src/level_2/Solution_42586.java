package level_2;

import java.util.*;
/**
 * ��� ����
 * @author delusidiot
 *
 */
public class Solution_42586 {

	public static void main(String[] args) {
		Solution_42586 solution = new Solution_42586();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		System.out.println(Arrays.toString(solution.solution2(progresses, speeds)));
	}
	public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
        int day = 0;
        for (int i = 0; i < progresses.length; i++){
            if (progresses[i] + (day * speeds[i]) < 100){
                while(progresses[i] + (day * speeds[i]) < 100)
                    day++;
                list.add(1);
            }
            else
                list.set(list.size() - 1, list.get(list.size() - 1) + 1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
	
	public int[] solution2 (int[] prograss, int[] speeds) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < prograss.length; i++) {
			list.add((int)Math.ceil((double)(100 - prograss[i]) / speeds[i]));
		}
		List<Integer> result = new ArrayList<Integer>();
		int day = list.remove(0);
		int counter = 1;
		for (Integer num: list) {
			if (day < num) {
				result.add(counter);
				day = num;
				counter = 1;
			}
			else
				counter++;
		}
		result.add(counter);
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
