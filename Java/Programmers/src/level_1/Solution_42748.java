package level_1;

import java.util.*;

public class Solution_42748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int[] cuttedArray = new int[commands[i][1] - commands[i][0] + 1];
            System.arraycopy(array, commands[i][0]-1, cuttedArray, 0, commands[i][1] - commands[i][0] + 1);
            Arrays.sort(cuttedArray);
            answer[i] = cuttedArray[commands[i][2] - 1];
        }
        return answer;
    }
}
