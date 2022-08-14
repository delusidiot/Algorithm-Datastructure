package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int total = 0;
		for (int i = 0; i < N; i++)
			total += Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).reduce(1, Math::multiplyExact);
		System.out.println(X == total ? "Yes" : "No");
	}
}
