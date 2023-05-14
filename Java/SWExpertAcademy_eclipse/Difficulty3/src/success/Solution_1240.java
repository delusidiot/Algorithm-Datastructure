package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1240 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		String[] codes = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++)
			map.put(codes[i], i);
		for (int t = 1; t <= T; t++) {
			int l = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray()[0];
			String bar = null;
			int[] num = new int[2];
			for (int i = 0; i < l; i++) {
				String line = br.readLine().trim();
				if (line.indexOf('1') > 0)
					bar = line;
			}
			int lastIndex = bar.lastIndexOf('1');
            for (int i = 0; i < 8; i++)
                num[i % 2] += map.get(bar.substring(lastIndex - (7 * (i + 1)) + 1, lastIndex - (7 * i) + 1));
			System.out.printf("#%d %d\n", t, ((num[0] + num[1] * 3) % 10 == 0)? num[0] + num[1] : 0);
		}
	}
}
