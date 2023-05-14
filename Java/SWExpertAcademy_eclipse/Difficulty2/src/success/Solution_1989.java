package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			String line = br.readLine().trim();
			boolean check = true;
			for(int i = 0; i < line.length() / 2; i++) {
				if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
					check = false;
					break;
				}
			}
			System.out.println("#" + test_case + " " + (check ? "1":"0"));
		}
		br.close();
	}

}
