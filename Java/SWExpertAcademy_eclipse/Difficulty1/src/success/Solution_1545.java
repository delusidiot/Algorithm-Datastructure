package success;

import java.io.*;

public class Solution_1545 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int i = T; i >= 0; i--) {
			System.out.print(i + " ");
		}
		br.close();
	}
}
