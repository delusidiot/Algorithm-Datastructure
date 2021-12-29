package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int k = 0; k < K; k++) {
			Integer N = Integer.parseInt(br.readLine());
			if (N != 0)
				stack.add(N);
			else
				stack.pop();
		}
		System.out.println(stack.stream().mapToInt(n->n).sum());
	}

}
