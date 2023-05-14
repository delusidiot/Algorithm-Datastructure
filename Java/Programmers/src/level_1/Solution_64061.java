package level_1;

import java.util.*;

/**
 * ũ���� �����̱� ����
 * @author delusidiot
 *
 */

public class Solution_64061 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board[moves[i]-1].length; j++) {
				if(board[j][moves[i]-1] != 0) {
                    if (basket.size() >= 1 && basket.get(basket.size() - 1) == board[j][moves[i]-1]){
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    }
                    else
                        basket.add(board[j][moves[i]-1]);    
                    board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
        return answer;
    }
}
