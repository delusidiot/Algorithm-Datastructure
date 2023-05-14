package level_2;

import java.util.*;

public class Solution_42746 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static class CustomComparator implements Comparator<String>{
	    public int compare(String o1, String o2){
	        return (o2 + o1).compareTo(o1 + o2) ;
	    }
	}
	
	public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .sorted(new CustomComparator())
            .toArray(String[]::new);
        Arrays.stream(arr).forEach(sb::append);
        if (arr[0].equals("0"))
            return "0";
        return sb.toString();
    }
}
