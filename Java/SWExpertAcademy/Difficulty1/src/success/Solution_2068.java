package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2068 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer max = 0;
			String[] line = br.readLine().split(" ");
			for (String l : line) {
				if (max < Integer.parseInt(l))
					max = Integer.parseInt(l);
			}
			System.out.println("#" + test_case + " " + max);
			
		}

	}

}
