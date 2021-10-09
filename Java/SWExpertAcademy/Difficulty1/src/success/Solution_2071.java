package success;

import java.io.*;

public class Solution_2071 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int total = 0;
			String[] line = br.readLine().split(" ");
			for (String l : line) {
				total += Integer.parseInt(l);
			}
			System.out.println("#" + i + " " + ((total % 10 >= 5) ? (total / 10) + 1 : (total / 10)));
		}
	}
}
