package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1954 {

	public static void main(String[] args) throws IOException {
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.printf("#%d\n", test_case);
			Integer N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[N][N];
			int x = 0;
			int y = 0;
			int count = 0;
			for (int i = 1; i <= N * N; i++) {
				arr[x][y] = i;
				int nx = dx[count % 4] + x;
				int ny = dy[count % 4] + y;
				if (nx >= N || nx < 0 || ny >= N || ny < 0 || arr[nx][ny] != 0) {
					count++;
					nx = dx[count % 4] + x;
					ny = dy[count % 4] + y;
				}
				x = nx;
				y = ny;
			}
			for (int i = 0; i < N ; i++) {
				for (int j = 0; j < N ; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
