package graph;

import java.util.Map;
import java.util.Set;

public interface Graph {
	void addEdge(int u, int v);
	void printGraph();
	Map<Integer, Set<Integer>> getGraph();
}
