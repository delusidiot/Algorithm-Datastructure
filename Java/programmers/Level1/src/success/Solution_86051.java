package success;

import java.util.HashSet;

public class Solution_86051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] numbers) {
        return 55 - new HashSet<Integer>(numbers).stream().mapToInt(Integer::intValue).sum();
    }
}
