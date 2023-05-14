package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11725 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		List<Integer> list[] = new ArrayList[N+1];
		for (int i = 0; i < list.length;i ++)
			list[i] = new ArrayList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n0 = Integer.parseInt(st.nextToken());
			int n1 = Integer.parseInt(st.nextToken());
			list[n0].add(n1);
			list[n1].add(n0);
		}
		int[] answer = new int[N + 1];
		queue.add(1);
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			for (int i : list[curr]) {
				if (answer[i] == 0) {
					answer[i] = curr;
					queue.add(i);
				}
			}
		}
		for (int i = 2; i < N + 1; i++) {
			System.out.println(answer[i]);
		}
	}
}
