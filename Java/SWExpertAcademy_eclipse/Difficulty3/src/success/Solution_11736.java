package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_11736 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[] p = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(p[0]);
			queue.add(p[1]);
			int count = 0;
			for (int i = 2; i < p.length; i++) {
				queue.add(p[i]);
				if (Collections.max(queue) != p[i - 1] && Collections.min(queue) != p[i - 1])
					count++;
				queue.poll();
			}
			System.out.printf("#%s %d\n", test_case, count);
		}
	}
}
