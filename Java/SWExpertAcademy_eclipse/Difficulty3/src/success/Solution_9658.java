package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9658 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			String N = br.readLine().trim();
			if (N.charAt(2) >= '5') {
				if (N.charAt(1) == '9') {
					if (N.charAt(0) == '9') 
						System.out.printf("#%d 1.0*10^%d\n", test_case, N.length());
					else
						System.out.printf("#%d %c.0*10^%d\n", test_case, N.charAt(0) + 1, N.length() - 1);
				}
				else
					System.out.printf("#%d %c.%c*10^%d\n", test_case, N.charAt(0), N.charAt(1) + 1, N.length() - 1);
			}
			else {
				System.out.printf("#%d %c.%c*10^%d\n", test_case, N.charAt(0), N.charAt(1), N.length() - 1);
			}
		}
	}
}
