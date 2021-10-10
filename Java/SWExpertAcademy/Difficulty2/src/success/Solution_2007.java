package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2007 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			String line = br.readLine().trim();
			int max = 0;
			for (int i = 1; i <= line.length(); i++) {
				String sub = line.substring(0, i);
				boolean check = true;
				for(int j = 0; j + i < line.length();j += i) {
					String diff = line.substring(j, j + i);
					if (!diff.equals(sub)) {
						check = false;
						break;
					}
				}
				if (check) {
					max = i;
					break;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
		br.close();
	}

}
