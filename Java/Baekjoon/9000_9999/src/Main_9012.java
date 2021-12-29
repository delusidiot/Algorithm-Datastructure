import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			String bracket = br.readLine();
			Stack<Character> stack = new Stack<>();
			boolean check = true;
			for (int i = 0; i < bracket.length(); i++) {
				if (bracket.charAt(i) == '(') {
					stack.add(bracket.charAt(i));
				}
				else if(stack.size() != 0 && stack.peek() == '(') {
					stack.pop();
				}
				else {
					check = false;
					break;
				}
			}
			if (stack.size() != 0)
				check = false;
			System.out.println(check ? "YES":"NO");
		}
	}
}
