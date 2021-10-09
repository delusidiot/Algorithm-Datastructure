package success;

import java.io.*;

public class Solution_2019 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		int num = 1;
		System.out.print(1 + " ");
		for (int i = 0; i < T; i++) {
			num *= 2;
			System.out.print(num +" ");
		}
		br.close();
	}
}
