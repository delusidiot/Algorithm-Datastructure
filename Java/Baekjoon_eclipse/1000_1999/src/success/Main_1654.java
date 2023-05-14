package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		long[] lanLine = new long[input[0]];
		long max = 0;
		long min = 1;
		long ans = 0;
		for (int i = 0; i < input[0]; i++) {
			lanLine[i] = Long.parseLong(br.readLine());
			if (lanLine[i] > max)
				max = lanLine[i];
		}
		while (min <= max) {
			long mid = (max + min) / 2;
			long count = Arrays.stream(lanLine).map(n -> n / mid).sum();
			if (count < input[1])
				max = mid - 1;
			else
				min = mid + 1;
		}
		System.out.println(min - 1);
	}
}
