package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution_1983 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] grades = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		Integer T = Integer.parseInt(br.readLine().trim());

		for (int test_case = 1; test_case <= T; test_case++) {
			String[] line = br.readLine().trim().split(" ");
			Integer N = Integer.parseInt(line[0]);
			Integer K = Integer.parseInt(line[1]) - 1;
			Integer[] scores = new Integer[N];
			for (int i = 0; i < N; i++) {
				int[] score = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				scores[i] = score[0] * 35 +  score[1] * 45 + score[2] * 20;
			}
			int k_score = scores[K];
			Arrays.sort(scores, Collections.reverseOrder());
			int k_rank = Arrays.asList(scores).indexOf(k_score);
			System.out.printf("#%d %s\n", test_case, grades[10 * k_rank / N]);
		}
		br.close();
	}
}

