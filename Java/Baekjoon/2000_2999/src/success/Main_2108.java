package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[8001];
		int total = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = Integer.MAX_VALUE;
		int mode = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			total += value;
			nums[value + 4000]++;
			if (max < value)
				max = value;
			if (min > value)
				min = value;
		}
		int count = 0;
		int mode_max = 0;
		boolean check = false;
		
		for (int i = min + 4000; i <= max + 4000; i++) {
			if (nums[i] > 0) {
				if (count < (n + 1) / 2) {
					count += nums[i];
					median = i - 4000;
				}
				if (mode_max < nums[i]) {
					mode_max = nums[i];
					mode = i - 4000;
					check = true;
				}
				else if (mode_max == nums[i] && check) {
					mode = i - 4000;
					check = false;
				}
			}
		}
		System.out.println((int)Math.round((double)total /n));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);
	}
}
