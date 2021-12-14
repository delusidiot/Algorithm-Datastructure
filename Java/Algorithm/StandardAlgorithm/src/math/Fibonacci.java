package math;

import java.util.Arrays;

public class Fibonacci {
	
	static int[] fibo = new int[100];

	public static void main(String[] args) {
		fibo(10);
		System.out.println(Arrays.toString(fibo));
	}
	
	public static int fibo(int x) {
		if (x == 1 || x == 2)
			return 1;
		if (fibo[x] != 0)
			return fibo[x];
		fibo[x] = fibo(x - 1) + fibo(x - 2);
		return fibo[x];
	}

}
