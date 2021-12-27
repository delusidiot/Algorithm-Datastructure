package graph;

import java.util.Map;
import java.util.Set;

public interface WeightedGraph {
	void addEdge(int u, int v);
	void addEdge(int u, int v, int weight);
	void printGraph();
	Map<Integer, Map<Integer, Integer>> getGraph();
}
