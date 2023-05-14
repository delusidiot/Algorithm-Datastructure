package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2070 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			String sign = null;
			String[] line = br.readLine().split(" ");
			if (Integer.parseInt(line[0]) > Integer.parseInt(line[1]))
				sign = ">";
			else if (Integer.parseInt(line[0]) < Integer.parseInt(line[1]))
				sign = "<";
			else
				sign = "=";
			System.out.println("#" + test_case + " " + sign);
			
		}
		br.close();
	}

}
