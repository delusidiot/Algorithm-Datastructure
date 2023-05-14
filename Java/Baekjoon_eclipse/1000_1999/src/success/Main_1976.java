package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		Integer M = Integer.parseInt(br.readLine());
		UnionFind uf = new UnionFind(N);
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				if (Integer.parseInt(st.nextToken()) == 1) {
					uf.union(i + 1, j + 1);
				}
			}
		}
		String[] plan = br.readLine().split(" ");
		boolean check = true;
		int root = Integer.parseInt(plan[0]);
		for (int i = 1; i < plan.length; i++) {
			if (!uf.connected(root, Integer.parseInt(plan[i])))
				check = false;
		}
		if (check)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	static class UnionFind {
		Integer[] id;
		Integer[] sz;
		
		public UnionFind(Integer N) {
			id = new Integer[N + 1];
			sz = new Integer[N + 1];
			Arrays.fill(sz, 1);
			for (int i = 0; i <= N; i++) {
				id[i] = i;
			}
		}
		private Integer root(Integer i) {
			while (i != id[i]) {
				id[i] = id[id[i]];
				i = id[i];
			}
			return i;
		}
		
		public boolean connected(int nodeA, int nodeB) {
			return (root(nodeA) == root(nodeB));
		}
		
		public void union(int nodeA, int nodeB) {
			int i = root(nodeA);
			int j = root(nodeB);
			if (i == j)
				return ;
			if (sz[i] < sz[j]) {
				id[i] = j;
				sz[j] += sz[i];
			}
			else {
				id[j] = i;
				sz[i] += sz[j];
			}
		}
	}
}
