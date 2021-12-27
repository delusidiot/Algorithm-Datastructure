package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DirectedGraph implements Graph{
	private Map<Integer, Set<Integer>> map;
	
	public DirectedGraph() {
		map = new HashMap<Integer, Set<Integer>>();
	}
	
	public void addEdge(int u, int v) {
		if (!map.containsKey(u))
			map.put(u, new HashSet<>());
		map.get(u).add(v);
	}
	
	public void printGraph(){
        System.out.println(map);
    }
	
	public Map<Integer, Set<Integer>> getGraph() {
		return map;
	}
	
	public static void main(String[] args) {
		Graph graph = new DirectedGraph();
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
