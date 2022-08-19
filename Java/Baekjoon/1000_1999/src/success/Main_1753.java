package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_1753 {
	
	private static class Node implements Comparable<Node> {
		public int vertex;
		public int weight;
		
		public Node (int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}

		@Override
		public String toString() {
			return "Node [vertex=" + vertex + ", weight=" + weight + "]";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer V = Integer.parseInt(st.nextToken());
		Integer E = Integer.parseInt(st.nextToken());
		Integer startV = Integer.parseInt(br.readLine());
		Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
		
		PriorityQueue<Node>[] pq = new PriorityQueue[V+1];
		for (int i = 1; i <= V; i++) {
			pq[i] = new PriorityQueue<>();
		}
		int[] distances = new int[V + 1];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[startV] = 0;
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			Integer u = Integer.parseInt(st.nextToken());
			Integer v = Integer.parseInt(st.nextToken());
			Integer w = Integer.parseInt(st.nextToken());
			pq[u].add(new Node(v, w));
		}
		
		while (!pq[startV].isEmpty()) {
			Node node = pq[startV].poll();
			int index = node.vertex;
			int weight = node.weight;
			if (distances[index] != Integer.MAX_VALUE) continue;
			distances[index] = weight;
			for (Node n : pq[index]) {
				pq[startV].add(new Node(n.vertex, n.weight + weight));
			}
		}
		for (int i = 1; i <= V; i++) {
			System.out.println((distances[i] != Integer.MAX_VALUE ? distances[i] : "INF"));
		}
	}
}
