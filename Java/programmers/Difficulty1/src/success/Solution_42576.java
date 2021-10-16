package success;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution_42576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String[] participant, String[] completion) {
        Map<String, Long> map = Arrays.asList(participant).stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(String c: completion) map.computeIfPresent(c, (k, v) -> v - 1L);
        map.values().removeAll(Collections.singleton(0L));
        return map.keySet().iterator().next();
    }
}
