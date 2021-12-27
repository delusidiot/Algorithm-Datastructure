package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeightedUndirectedGraph implements WeightedGraph{
	
	private Map<Integer, Map<Integer, Integer>> map;
	
	public WeightedUndirectedGraph() {
		map = new HashMap<Integer, Map<Integer, Integer>>();
	}
	
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}
	
	public void addEdge(int u, int v, int weight) {
		if (!map.containsKey(u))
			map.put(u, new HashMap<>());
		if (!map.containsKey(v))
			map.put(v, new HashMap<>());
		map.get(u).put(v, weight);
		map.get(v).put(u, weight);
	}
	
	public void printGraph(){
        System.out.println(map);
    }
	
	
	public Map<Integer, Map<Integer, Integer>> getGraph() {
		return map;
	}

	public static void main(String[] args) {
		WeightedGraph graph = new WeightedUndirectedGraph();
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
	}
	
}
