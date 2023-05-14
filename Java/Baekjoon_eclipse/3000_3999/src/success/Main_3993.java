package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3993 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] myPieces = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] defaultPieces = {1,1,2,2,2,8};
		for (int i = 0;i < myPieces.length; i++) {
			System.out.print(defaultPieces[i] - myPieces[i]);
			System.out.print(" ");
		}
	}
}
