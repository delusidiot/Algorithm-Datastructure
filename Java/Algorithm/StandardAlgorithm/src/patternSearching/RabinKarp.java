package patternSearching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RabinKarp {
	public static Map<Integer, Set<Integer>> map = new HashMap<>();
	
	public static void search(String text, String part) {
		int N = text.length();
		int M = part.length();
		for (int i = 0; i <= N - M;i ++) {
			int hash = text.substring(i, i + M).hashCode();
			if (!map.containsKey(hash))
				map.put(hash, new HashSet<>());
			map.get(hash).add(i);
		}
		System.out.println(map.get(part.hashCode()));
	}
	public static void main(String[] args) {
		String text = "AABAACAADAABAAABAA";
		String part = "AABA";
		search(text, part);
	}
}
