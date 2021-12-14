package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1289 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] bits = br.readLine().trim().chars().toArray();
			int i = 0;
			int count = 0;
			while(i < bits.length) {
				if (bits[i] == '1') {
					count++;
					for (int j = i; j < bits.length; j++) {
						if (bits[j] == '1')
							bits[j] = '0';
						else 
							bits[j] = '1';
					}
				}
				i++;
			}
			System.out.printf("#%d %d\n",test_case, count);
		}
	}
}
