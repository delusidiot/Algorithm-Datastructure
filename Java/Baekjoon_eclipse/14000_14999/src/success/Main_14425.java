package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < nm[0]; i++)
			set.add(br.readLine());
		int count = 0;
		for (int i = 0; i < nm[1]; i++) {
			if (set.contains(br.readLine()))
				count++;
		}
		System.out.println(count);
	}
}
