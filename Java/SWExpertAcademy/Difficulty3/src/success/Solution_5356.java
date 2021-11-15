package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5356 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			StringBuffer sb = new StringBuffer();
			String[] lines = new String[5];
			int maxLen = 0;
			for (int i = 0; i < 5; i++) {
				lines[i] = br.readLine();
				if (maxLen < lines[i].length())
					maxLen = lines[i].length();
			}
			for (int i = 0; i < maxLen; i++) {
				for (int j = 0; j < 5; j++) {
					if (lines[j].length() > i) {
						sb.append(lines[j].charAt(i));
					}
				}
			}
			System.out.printf("#%d %s", test_case, sb.toString());
		}

	}

}
