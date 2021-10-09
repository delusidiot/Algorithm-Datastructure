package success;
import java.io.*;

public class Solution_2072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int total = 0;
			String[] line = br.readLine().split(" ");
			for (String l : line) {
				int number = Integer.parseInt(l);
				if ((number & 1) == 1)
					total += number;
			}
			System.out.println("#" + i + " " + total);
		}
	}
}