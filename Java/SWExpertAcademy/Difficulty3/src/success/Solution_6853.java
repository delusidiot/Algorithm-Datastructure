package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_6853 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] square = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			// square[0] square[1] square[2] square[3]
			int inner = 0;
			int outter = 0;
			int tangentPoint = 0;
			Integer N = Integer.parseInt(br.readLine().trim());
			for(int i = 0; i < N; i++) {
				int[] point = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				// x y
				if((point[0] > square[0] && point[0] < square[2]) && (point[1] > square[1] && point[1] < square[3]))
					inner++;
	            else if((point[0] == square[0] && point[1] >= square[1] && point[1] <= square[3]) 
	            		|| (point[0] == square[2] && point[1] >= square[1] && point[1] <= square[3]) 
	            		|| (point[1] == square[1] && point[0] >= square[0] && point[0] <= square[2]) 
	            		|| (point[1] == square[3] && point[0] >= square[0] && point[0] <= square[2]))
	            	tangentPoint++;
	            else
	            	outter++;
			}
			System.out.printf("#%d %d %d %d\n", test_case, inner, tangentPoint, outter);
		}
	}
}
