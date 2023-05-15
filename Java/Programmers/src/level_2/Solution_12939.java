package level_2;

import java.util.Arrays;

public class Solution_12939 {
    public static void main(String[] args) {
        Solution_12939 solution = new Solution_12939();
        System.out.println(solution.solution("1 2 3 4"));
        System.out.println(solution.solution("-1 -2 -3 -4"));
        System.out.println(solution.solution("-1 -1"));
    }
    public String solution(String s) {
        int[] array = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        return array[0] + " " +array[array.length - 1];
    }
}
