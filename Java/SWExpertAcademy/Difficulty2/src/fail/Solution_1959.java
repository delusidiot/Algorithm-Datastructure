package fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1959 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] NM = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] A = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] B = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.printf("#%d %d\n", test_case, ((NM[0] > NM[1]) ? total(A, B) : total(B, A)));
		}

	}
	
	public static int total(int[] A, int[] B) {
		int sum = 0; // A.length > B.length
		int max = 0;
		for(int i = 0; i <= A.length - B.length; i++) {
			sum = 0;
			for(int j = 0; j < B.length; j++) {
				sum += A[i + j] * B[j];
			}
			if (max < sum)
				max = sum;
		}
		return max;
	}

}
