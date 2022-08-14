package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		time[1] += Integer.parseInt(br.readLine());
		time[0] += time[1] / 60;
		time[1] = time[1] % 60;
		time[0] = time[0] % 24;
		System.out.println(time[0] + " " + time[1]);
		br.close();
	}
}
