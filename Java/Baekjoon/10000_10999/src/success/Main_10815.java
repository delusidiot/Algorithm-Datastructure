package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).collect(HashSet::new, HashSet::add, HashSet::addAll);
		int m = Integer.parseInt(br.readLine());
		 Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach((num) -> {
			 if (set.contains(num))
				 System.out.print("1 ");
			 else
				 System.out.print("0 ");
		 });
	}
}
