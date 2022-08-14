package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (num[0] == num[1] && num[1] == num[2])
			System.out.println(10000 + num[0] * 1000);
		else if (num[0] == num[1])
			System.out.println(1000 + num[0] * 100);
		else if (num[1] == num[2])
			System.out.println(1000 + num[1] * 100);
		else if (num[0] == num[2])
			System.out.println(1000 + num[0] * 100);
		else
			System.out.println(Arrays.stream(num).max().getAsInt() * 100);
	}
}
