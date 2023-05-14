package level_1;

import java.util.Arrays;

public class Solution_86051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] numbers) {
        return 55 - Arrays.stream(numbers).distinct().sum();
    }
}
