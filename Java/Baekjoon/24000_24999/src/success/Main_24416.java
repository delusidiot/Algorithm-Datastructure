package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_24416 {
	private static int[] fibo = new int[41];
	private static int count1;
	private static int count2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		count1 = 0;
		count2 = 0;
		fib(n);
		fibonacci(n);
		System.out.println(count1 + " " + count2);
	}
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			count1++;
			return 1;
		}
		else
			return fib(n-1) + fib(n-2);
	}
	public static int fibonacci(int n) {
		fibo[1] = 1;
		fibo[2] = 1;
		for (int i = 3; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i -2];
			count2++;
		}
		return fibo[n];
	}
}
