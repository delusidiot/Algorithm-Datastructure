package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		CustomStack stack = new CustomStack();
		for(int n = 0; n < N; n++) {
			String[] line = br.readLine().trim().split(" ");
			switch (line[0]) {
			case "push":
				stack.push(Integer.parseInt(line[1]));
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.empty() ? 1 : 0);
				break;
			case "top":
				System.out.println(stack.top());
				break;
			}
		}
	}
	
	static class CustomStack{
		
		private List<Integer> stack;

		public CustomStack() {
			this.stack = new LinkedList<>();
		}
		
		public int push(int num) {
			stack.add(num);
			return num;
		}
		
		public int pop() {
			if (stack.size() == 0)
				return -1;
			return stack.remove(stack.size() - 1);
		}
		
		public int size() {
			return stack.size();
		}
		
		public boolean empty() {
			return stack.isEmpty();
		}
		
		public int top() {
			if (stack.size() == 0)
				return -1;
			return stack.get(stack.size() - 1);
		}
	}
}
