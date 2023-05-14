package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1220 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			String N = br.readLine();
			int[][] table = new int[100][100];
			for (int i = 0; i < 100; i++)
				table[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			int[] status = new int[100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if(status[j] == 0 && table[i][j] == 1)
						status[j] = table[i][j];
					else if(status[j] == 1 && table[i][j] == 2) {
						count++;
						status[j] = 0;
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}

}
