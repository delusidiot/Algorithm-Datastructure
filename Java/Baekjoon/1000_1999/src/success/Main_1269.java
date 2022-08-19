package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		Set<Integer> set1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).collect(HashSet::new, HashSet::add, HashSet::addAll);
		Set<Integer> set2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).collect(HashSet::new, HashSet::add, HashSet::addAll);
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		set1.removeAll(intersection);
		set2.removeAll(intersection);
		System.out.println(set1.size() + set2.size());
	}
}
