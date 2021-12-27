package graph;

import java.util.LinkedList;
import java.util.Queue;

public class SearchGraph {
	
	static void BFS(Graph graph, int s) {
		boolean visited[] = new boolean[graph.getGraph().size()];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			graph.getGraph().get(s).forEach((n) -> {
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			});
		}
	}
	
	static void DFS(Graph graph, int s, boolean[] visited) {
		visited[s] = true;
		System.out.print(s + " ");
		graph.getGraph().get(s).forEach((n) -> {
			if (!visited[n])
				DFS(graph, n, visited);
		});
	}

	public static void main(String[] args) {
		Graph graph = new UndirectedGraph();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		graph.printGraph();
		BFS(graph, 1);
		System.out.println();
		DFS(graph, 1, new boolean[graph.getGraph().size()]);
		System.out.println();
	}

}
