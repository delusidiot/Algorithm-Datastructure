package level_2;

import java.util.*;

public class Solution_42747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] citations) {
        for(int i = citations.length; i >= 0; i--){
            int j = i;
            int count = (int)Arrays.stream(citations).filter(c -> c >= j).count();
            if (count >= i)
                return i;
        }
        return 0;
    }
}
