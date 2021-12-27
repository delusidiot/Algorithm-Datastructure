package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortestPath {
	
	public static int minDistance(int[] dist, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for (int v = 0; v < dist.length; v++) {
			if (!visited[v] && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}
		}
		return min_index;
	}
	
	public static void printDist(int[] dist) {
		System.out.println(Arrays.toString(dist));
	}
	
	public static void dijkstra(WeightedGraph graph, int src) {
		int[] dist = new int[graph.getGraph().size()];
		boolean[] visited = new boolean[graph.getGraph().size()];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[src] = 0;
		for (int count = 0; count < dist.length - 1; count++) {
			int u = minDistance(dist, visited);
			visited[u] = true;
			for (int v = 0; v < dist.length; v++) {
				if (!visited[v] 
						&& graph.getGraph().get(u).get(v) != null
						&& dist[u] != Integer.MAX_VALUE
						&& dist[u] + graph.getGraph().get(u).get(v) < dist[v]) {
					dist[v] = dist[u] + graph.getGraph().get(u).get(v);
				}
			}
		}
		printDist(dist);
	}
	
	public static void main(String[] args) {
		WeightedGraph graph = new WeightedUndirectedGraph();
		Graph g = new UndirectedGraph();

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
		dijkstra(graph, 0);
	}
}
