package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<String, String> nameAndNum = new HashMap<>();
		for (int i = 0; i < nm[0]; i++) {
			String name = br.readLine();
			nameAndNum.put(String.valueOf(i + 1), name);
			nameAndNum.put(name, String.valueOf(i+1));
		}
		for (int i = 0; i < nm[1]; i++)
			System.out.println(nameAndNum.get(br.readLine()));
	}
}
