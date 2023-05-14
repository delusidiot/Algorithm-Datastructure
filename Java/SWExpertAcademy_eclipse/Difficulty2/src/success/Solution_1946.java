package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			System.out.printf("#%d\n", test_case);
			StringBuilder sb = new StringBuilder();
			Integer N = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < N; i++) {
				String[] line = br.readLine().trim().split(" ");
				Integer num = Integer.parseInt(line[1]);
				while (sb.length() + num > 10) {
					if (sb.length() == 10) {
						System.out.println(sb.toString());
						sb.setLength(0);
					}
					num--;
					sb.append(line[0]);
				}
				while (num > 0) {
					num--;
					sb.append(line[0]);
				}
			}
			System.out.println(sb.toString());
		}
	}

}
