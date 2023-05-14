package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1271 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().trim().split(" ");
		BigInteger N = new BigInteger(line[0]);
		BigInteger M = new BigInteger(line[1]);
		System.out.println(N.divide(M));
		System.out.println(N.remainder(M));
	}
}

