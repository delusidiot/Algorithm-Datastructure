package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Stack<Character> stack = new Stack<>();
			String line = br.readLine();
			boolean check = true;
			if (line.equals(".")) {
				break;
			}
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '(' || line.charAt(i) == '[')
					stack.add(line.charAt(i));
				else if(!stack.empty() && 
						(line.charAt(i) == ')' || line.charAt(i) == ']')) {
					if ((stack.peek() == '[' && line.charAt(i) == ']') ||
							(stack.peek() == '(' && line.charAt(i) == ')')) {
						stack.pop();
					}else {
						check = false;
						break;
					}
				}
				else if(stack.empty() && 
						(line.charAt(i) == ')' || line.charAt(i) == ']')) {
					check = false;
					break;
				}
			}
			if (line.charAt(line.length() - 1) != '.' || !stack.empty())
				check = false;
			System.out.println(check ? "yes" : "no");
		}
	}
}
