package patternSearching;

import java.util.HashSet;
import java.util.Set;

public class NaiveSearch {
	public Set<Integer> index = new HashSet<>();
	public int search(String text, String part) {
		int count = 0;
		int N = text.length();
		int M = part.length();
		
		for (int i = 0; i <= N - M; i++) {
			int j = 0;
			while (j < M) {
				if (text.charAt(i + j) != part.charAt(j))
					break;
				j++;
			}
			
			if (j == M) {
				count++;
				index.add(i);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String text = "AABAACAADAABAAABAA";
		String part = "AABA";
		NaiveSearch search = new NaiveSearch();
		System.out.println(search.search(text, part));
		for (Integer idx: search.index) {
			System.out.println("index=" + idx + ",\tresult=" + text.substring(idx, idx + part.length()));
		}
	}
}
