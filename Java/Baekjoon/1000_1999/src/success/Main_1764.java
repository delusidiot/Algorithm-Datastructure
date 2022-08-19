package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Set<String> set1 = new TreeSet<>();
		Set<String> set2 = new TreeSet<>();
		for (int i = 0; i < nm[0];i++)
			set1.add(br.readLine());
		for (int i = 0; i < nm[1];i++)
			set2.add(br.readLine());
		set1.retainAll(set2);
		System.out.println(set1.size());
		for (String name: set1)
			System.out.println(name);
	}
}
