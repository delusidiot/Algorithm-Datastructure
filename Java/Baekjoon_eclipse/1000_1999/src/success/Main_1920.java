package success;

import java.io.*;
import java.util.*;

public class Main_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).collect(HashSet::new, HashSet::add, HashSet::addAll);
		int m = Integer.parseInt(br.readLine());
		Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(num -> {
			System.out.println(set.contains(num) ? "1" : "0");
		});
	}
}
