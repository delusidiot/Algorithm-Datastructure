package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sb = br.readLine().split(" ");
		String result = null;
		if (sb[0].equals("1") && checkAscending(sb))
			result = "ascending";
		else if(sb[0].equals("8") && checkDescending(sb))
			result = "descending";
		else
			result = "mixed";
		System.out.println(result);
	}
	
	public static boolean checkAscending(String[] sb) {
		for (int i = 0; i < sb.length; i++) {
			if (Integer.parseInt(sb[i]) != i + 1)
				return false;
		}
		return true;
	}
	
	public static boolean checkDescending(String[] sb) {
		for (int i = 0; i < sb.length; i++) {
			if (Integer.parseInt(sb[i]) != 8 - i)
				return false;
		}
		return true;
	}
}
