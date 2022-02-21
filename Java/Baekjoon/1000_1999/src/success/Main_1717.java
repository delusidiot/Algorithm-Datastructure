package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer N = Integer.parseInt(st.nextToken());
		Integer M = Integer.parseInt(st.nextToken());
		UnionFind uf = new UnionFind(N);
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			Integer command = Integer.parseInt(st.nextToken());
			Integer nodeA = Integer.parseInt(st.nextToken());
			Integer nodeB = Integer.parseInt(st.nextToken());
			switch (command) {
			case 0:
				uf.union(nodeA, nodeB);
				break;
			case 1:
				if (uf.connected(nodeA, nodeB))
					System.out.println("YES");
				else
					System.out.println("NO");
				break;
			}
		}
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
