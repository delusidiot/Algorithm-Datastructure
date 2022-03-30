package success;

import java.util.Stack;

/**
 * 괄호 변환
 * 괄호갯수가 맞지 않을때, 다른 문자가 들어가 있을때 Exception 처리된 project이므로 Programmers에선 에러가 뜹니다.
 * 아래 주석처리된 코드가 실제 Programmers에서 실행될 수 있는 코드입니다.
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
			this.check = true;
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
						this.check = false;
					else
						stack.pop();
				default:
					throw new Exception();
				}
				if (left == right) {
					setUV(i + 1);
					break;
				}
			}
			throw new Exception();
		}
		
		public String getParenthesis() throws Exception {
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
	/*
	private int pos;

    private boolean isCorrect(String str) {
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
                pos = i + 1;
                break;
            }
        }
        return resultValue;
    }

    public String solution(String p) {
        if (p.equals("") || p.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        boolean correct = isCorrect(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());
        if (correct) {
            return u + solution(v);
        }
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");
        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(')
                sb.append(")");
            else
                sb.append("(");
        }
        return sb.toString();
    }
    */
}
