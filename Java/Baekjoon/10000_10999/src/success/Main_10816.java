package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		Map<Integer, Long> map = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		br.readLine();
		StringBuilder sb = new StringBuilder();
		Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(num -> {
			sb.append(map.containsKey(num) ? map.get(num) : "0");
			sb.append(" ");
		});
		System.out.println(sb.toString());
	}
}

