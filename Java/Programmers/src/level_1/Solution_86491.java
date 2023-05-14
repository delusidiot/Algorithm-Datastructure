package level_1;

/**
 * �ּ� ���簢��
 * @author delusidiot
 *
 */

public class Solution_86491 {
	public static void main(String[] args) {
		Solution_86491 solution = new Solution_86491();
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution.solution(sizes));
	}
	public int solution(int[][] sizes) {
		int widthMax = 0;
        int heightMax = 0;
        for (int i = 0; i < sizes.length; i++) {
        	widthMax = Math.max(widthMax, Math.max(sizes[i][0], sizes[i][1]));
        	heightMax = Math.max(heightMax, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return heightMax * widthMax;
    }
}
