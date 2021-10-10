package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		for (int n = 1; n <= N; n++) {
			String number = String.valueOf(n);
			if (number.chars().anyMatch(c -> (c - '0') != 0 && (c - '0') % 3 == 0)) {
				number.chars().forEach(c -> {
					if ((c - '0') != 0 && (c - '0') % 3 == 0)
						System.out.print('-');
				});
				
			}
			else
				System.out.print(n);
			System.out.print(" ");
		}
	}

}
