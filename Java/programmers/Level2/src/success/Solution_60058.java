package success;

import java.util.Stack;

/**
 * ��ȣ ��ȯ
 * 
 */

public class Solution_60058 {

	public static void main(String[] args) {
		Solution_60058 solution = new Solution_60058();
		try {
			System.out.println(solution.solution("(()())()"));
			System.out.println(solution.solution(")("));
			System.out.println(solution.solution("()))((()"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String solution(String p) throws Exception {
		if (p.equals("") || p.isEmpty())
			return "";
		Parenthesis parenthesis = new Parenthesis(p);
		if (parenthesis.isCheck()) {
			return parenthesis.getU() + solution(parenthesis.getV());
		}
        return parenthesis.getParenthesis();
    }

	public class Parenthesis {
		boolean check;
		String u;
		String v;
		String p;

		public Parenthesis(String p) throws Exception {
			this.p = p;
			this.check = isCorrect(p);
		}
		
		private boolean isCorrect(String str) throws Exception {
			boolean resultValue = true;
			int left = 0;
			int right = 0;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
				case '(':
					left++;
					stack.push('(');
					break;
				case ')':
					right++;
					if (stack.isEmpty())
						resultValue = false;
					else
						stack.pop();
				}
				if (left == right) {
					setUV(i + 1);
					break;
				}
			}
			throw new Exception();
		}
		
		public String getParenthesis() {
			StringBuilder sb = new StringBuilder();
			sb.append("(");
			sb.append(solution(getV()));
			sb.append(")");
			for (int i = 1; i < u.length() - 1; i++) {
	        	if (u.charAt(i) == '(')
	        		sb.append(")");
	        	else
	        		sb.append("(");
	        }
			return sb.toString();
		}
		
		private void setUV(int pos) {
			this.u = p.substring(0, pos);
			this.v = p.substring(pos, p.length());
		}
		
		public boolean isCheck() {
			return this.check;
		}
		
		public String getU() {
			return this.u;
		}
		
		public String getV() {
			return this.v;
		}
	}
}
