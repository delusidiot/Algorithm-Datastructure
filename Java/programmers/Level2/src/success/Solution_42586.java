package success;

import java.util.*;

public class Solution_42586 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
}
