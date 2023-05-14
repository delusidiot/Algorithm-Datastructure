package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			String[] line = br.readLine().trim().split(" ");
			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);
			int[][] fly = new int[N][N];
			for (int i = 0; i < N; i++) {
				line = br.readLine().trim().split(" ");
				for (int j = 0; j < line.length; j++) {
					fly[i][j] = Integer.parseInt(line[j]);
				}
			}
			int max = 0;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int counter = area(fly, i, j, M);
					if (max < counter)
						max = counter;
				}
			}
			System.out.println("#" + test_case + " "+max);
		}
		
	}
	
	public static int area(int[][] fly, int x, int y, int M) {
		int counter = 0;
		for (int i = x; i < x + M; i++) {
			for (int j = y; j < y + M; j++) {
				counter += fly[i][j];
				System.out.print(fly[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("result : "+ counter);
		System.out.println();
		return counter;
	}
}
