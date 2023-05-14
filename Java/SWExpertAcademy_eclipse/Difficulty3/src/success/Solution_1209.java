package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1209 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[100][100];
			int[] hight = new int[100];
			int max = 0;
			int leftDiagonal = 0;
			int rightDiagonal = 0;
			for (int i = 0; i < 100; i++) {
				arr[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				int sum = Arrays.stream(arr[i]).sum();
				if (sum > max)
					max = sum;
				for (int j = 0; j < 100; j++) {
					hight[j] += arr[i][j];
					
				}
				rightDiagonal += arr[i][i];
				leftDiagonal += arr[i][99 - i];
			}
			int hightMax = Arrays.stream(hight).max().getAsInt();
			if (max < hightMax)
				max = hightMax;
			if (max < rightDiagonal)
				max = rightDiagonal;
			if (max < leftDiagonal)
				max = leftDiagonal;
			
			System.out.printf("#%d %d\n", test_case, max);
		}
	}
}
