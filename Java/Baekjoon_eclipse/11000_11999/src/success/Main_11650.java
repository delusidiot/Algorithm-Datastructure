package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_11650 {
	private static class Node implements Comparable<Node> {
		int x;
		int y;
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Node o) {
			if (this.x == o.x)
				return this.y - o.y;
			return this.x - o.x;
		}
		@Override
		public String toString() {
			return this.x + " " + this.y;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Node> list = new ArrayList<Node>(); 
		for (int i = 0; i < n; i++) {
			int[] coor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			list.add(new Node(coor[0], coor[1]));
		}
		Collections.sort(list);
		for (Node node: list) {
			System.out.println(node);
		}
	}
}
