package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer X = Integer.parseInt(br.readLine());
		int arr[] = new int[1000001];
		
		for (int i = 2; i <= X; i++) {
			arr[i] = arr[i - 1] + 1;
			if (i%2 == 0)
				arr[i] = Math.min(arr[i],  arr[i / 2] + 1);
			if (i%3 == 0)
				arr[i] = Math.min(arr[i],  arr[i / 3] + 1);
			
		}
		System.out.println(arr[X]);
	}
}
