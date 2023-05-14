package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1208 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[] boxes = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] hight = new int[101];
			int min = 101;
			int max = 0;
			for(int box: boxes) {
				hight[box]++;
				if (min > box)
					min = box;
				if (max < box)
					max = box;
			}
			for (int i = 0; i < N; i++) {
				if (max >= min) {
					hight[max]--;
					hight[max - 1]++;
					hight[min]--;
					hight[min + 1]++;
					if (hight[max] <= 0)
						max--;
					if (hight[min] <= 0)
						min++;
				}
				else{
					hight[max]--;
					hight[max + 1]++;
					hight[min]--;
					hight[min - 1]++;
					if (hight[max] <= 0)
						max++;
					if (hight[min] <= 0)
						min--;
				}
			}
			System.out.printf("#%d %d\n", test_case, Math.abs(min - max));
		}

	}

}
