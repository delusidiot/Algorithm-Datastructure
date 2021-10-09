package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2056 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			String line = br.readLine();
			String year = line.substring(0, 4);
			String month = line.substring(4, 6);
			String day = line .substring(6, 8);
			boolean check = true;
			switch (month) {
			case "01":case "03":case "05":case "07":case "08":case "10":case "12":
				if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31)
					check = false;
				break;
			case "02":
				if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 28)
					check = false;
				break;
			case "04":case "06":case "09":case "11":
				if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 30)
					check = false;
				break;
			default:
				check = false;
				break;
			}
			System.out.print("#" + test_case + " ");
			if (check)
				System.out.println(year + "/" + month + "/" + day);
			else
				System.out.println("-1");
		}
		br.close();
	}
}
