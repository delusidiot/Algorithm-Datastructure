package success;

import java.io.*;

public class Solution_1933 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				System.out.print(i + " ");
		}
	}
}
