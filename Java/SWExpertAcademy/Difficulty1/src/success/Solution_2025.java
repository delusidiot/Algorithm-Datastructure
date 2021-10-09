package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		Integer total = 0;
		for (int i = 1; i <= T; i++) {
			total += i;
		}
		System.out.println(total);
		br.close();
	}
}
