package level_2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution_42578 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
            .collect(Collectors.groupingBy(c -> c[1], Collectors.counting()))
            .values().stream()
            .collect(Collectors.reducing(1L, (answer, counter) -> answer * (counter + 1)))
            .intValue() - 1;
    }
}
