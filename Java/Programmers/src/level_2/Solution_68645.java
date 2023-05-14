package level_2;

import java.util.Arrays;
/**
 * �ﰢ ������
 * @author delusidiot
 *
 */
public class Solution_68645 {
	
	int[] dx = {1, 0, -1};
	int[] dy = {0, 1, -1};

	public static void main(String[] args) {
		Solution_68645 solution = new Solution_68645();
		int n = 4;
		System.out.println(Arrays.toString(solution.solution(n)));
	}
	
	public int[] solution(int n) {
		int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;
		int num = n * (n + 1) / 2;
		int nextIdx = 0;
		for (int i = 1; i <= num; i++) {
			arr[x][y] = i;
			int nx = x + dx[nextIdx % 3];
			int ny = y + dy[nextIdx % 3];
			if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
				nextIdx++;
				nx = x + dx[nextIdx % 3];
				ny = y + dy[nextIdx % 3];
			}
			x = nx;
			y = ny;
		}
		int idx = 0;
		int[] answer = new int[num];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				answer[idx] = arr[i][j];
				idx++;
			}
		}
        return answer;
        
    }
}
