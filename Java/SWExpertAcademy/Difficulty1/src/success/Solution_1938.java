package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1938 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println((num[0] + num[1]) +"\n"
				+ (num[0] - num[1]) +"\n"
				+ (num[0] * num[1]) +"\n"
				+ (num[0] / num[1]));
	}
}
