package success;

import java.io.*;
import java.util.*;

public class Main_1260 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] line = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < line[1]; i++) {
			int[] vertex = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			if (!map.containsKey(vertex[0]))
				map.put(vertex[0], new ArrayList<>());
			if (!map.containsKey(vertex[1]))
				map.put(vertex[1], new ArrayList<>());
			map.get(vertex[0]).add(vertex[1]);
			map.get(vertex[1]).add(vertex[0]);
		}
		for (List<Integer> list: map.values())
			Collections.sort(list);
		if (!map.containsKey(line[2]))
			map.put(line[2], new ArrayList<>());
		boolean[] visited = new boolean[line[0] + 1];
		DFS(map, line[2], visited);
		System.out.println();
		visited = new boolean[line[0] + 1];
		BFS(map, line[2], visited);
		System.out.println();
	}
	
	public static void DFS(Map<Integer, List<Integer>> map, int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		map.get(v).forEach((n) -> {
			if (!visited[n])
				DFS(map, n, visited);
		});
	}
	
	public static void BFS(Map<Integer, List<Integer>> map, int v, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		while(queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			map.get(v).forEach((n) -> {
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			});
		}
	}
}

