package success;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution_42839 {

	static int answer = 0;
	public static void main(String[] args) {
		String[] numbers = {"17"};
		Integer[] answers = {3};
		Test test = new Test(numbers, answers);
		Solution_42839 solution = new Solution_42839();
		
		System.out.println(solution.solution("011"));
	}

	public int solution(String numbers) {
		Set<Integer> set = new HashSet<>();
        stringToInt(numbers, new boolean[numbers.length()], new StringBuffer(), set);
        System.out.println(set);
        return set.size();
    }
	
	public boolean isPrime(int number) {
	    return number > 1 
	      && IntStream.rangeClosed(2, (int) Math.sqrt(number))
	      .noneMatch(n -> (number % n == 0));
	}
	
	public void stringToInt(String numbers, boolean[] visited, StringBuffer sb, Set<Integer> set)	{
		if (!sb.isEmpty() && isPrime(Integer.parseInt(sb.toString()))) {
			set.add(Integer.parseInt(sb.toString()));
		}
		if (sb.length() >= numbers.length())
			return ;
		for (int i = 0; i < numbers.length(); i++) {
			if (!visited[i]) {
				sb.append(numbers.charAt(i));
				visited[i] = true;
				stringToInt(numbers, visited, sb, set);
				visited[i] = false;
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}
	
	boolean isAllVisited(boolean[] visited) {
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i])
				return false;
		}
		return true;
	}
}

class Test{
	List<String> numbers;
	List<Integer> answers;
	public Test(String[] num, Integer[] ans){
		numbers = Arrays.asList(num);
		answers = Arrays.asList(ans);
	}
}
