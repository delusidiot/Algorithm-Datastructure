package level_2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ʃ��
 * @author delusidiot
 *
 */
public class Solution_64065 {

	public static void main(String[] args) {
		Solution_64065 solution = new Solution_64065();
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		System.out.println(Arrays.toString(solution.solution(s)));
		System.out.println(Arrays.toString(solution.otherSolution(s)));
		System.out.println(Arrays.toString(solution.otherSolution2(s)));
		System.out.println(Arrays.toString(solution.otherSolution3(s)));
	}
	public int[] solution(String s) {
		PriorityQueue<Set<Integer>> queue = new PriorityQueue<>();
		Set<Integer> curr = null;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == '{') {
				curr = new ComHashSet<Integer>();
			}
			else if(s.charAt(i) == '}') {
				queue.add(curr);
			}
			else if (Character.isDigit(s.charAt(i))) {
				int start = i;
				while (Character.isDigit(s.charAt(i))) {
					i++;
				}
				curr.add(Integer.parseInt(s.substring(start, i)));
				i--;
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			result.add(queue.poll().stream().filter(num -> !result.contains(num)).collect(Collectors.toList()).get(0));
		}			
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public class ComHashSet<E> extends HashSet<E> implements Comparable<ComHashSet> {

		@Override
		public int compareTo(ComHashSet o) {
			return this.size() - o.size();
		}
		
	}
	
	public int[] otherSolution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b)->a.length() - b.length());
        int[] answer = new int[arr.length];
        for(String str : arr) {
        	String[] nums = str.split(",");
        	for (int i = 0; i < nums.length; i++) {
        		if (set.add(nums[i]))
        			answer[i] = Integer.parseInt(nums[i]);
            }
        }
        return answer;
    }
	
	public int[] otherSolution2(String s) {
		final Map<Integer, Integer> counts = new LinkedHashMap<>();
		Stream.of(s.replaceAll("[}{]", "").split(",")).mapToInt(Integer::parseInt)
        	.forEach(i -> counts.merge(i, 1, Integer::sum));
		System.out.println(counts);
		return counts.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.map(Map.Entry::getKey).mapToInt(x -> x).toArray();
    }
	
	public int[] otherSolution3(String s) {
		Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        return answer;
    }
}
