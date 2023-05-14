package success;

import java.io.*;

public class Solution_1936 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] T = br.readLine().split(" ");
		String winner = "A";
		switch (T[0]) {
		case "1":
			if (T[1].equals("2"))
				winner = "B";
			break;
		case "2":
			if (T[1].equals("3"))
				winner = "B";
			break;
		case "3":
			if (T[1].equals("1"))
				winner = "B";
			break;
		}
		System.out.println(winner);
		br.close();
	}
}
