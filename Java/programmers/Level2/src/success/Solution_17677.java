package success;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * [1차] 뉴스 클러스터링
 * @author delusidiot
 *
 */
public class Solution_17677 {

	public static void main(String[] args) {
		Solution_17677 solution = new Solution_17677();
		String str1 = "FRANCE";
		String str2 = "french";
		System.out.println(solution.solution(str1, str2));

	}
	public int solution(String str1, String str2) {
		if (str1.length() < 2 || str2.length() < 2)
			return Character.MAX_VALUE + 1;
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		Map<String, Long> str1Map = group(str1);
		Map<String, Long> str2Map = group(str2);

		Integer intersection = getIntersection(str1Map, str2Map);
		Integer union = getUnion(new HashMap<String, Long>(str1Map), str2Map);
		if (intersection.equals(union) && union.equals(0))
			return Character.MAX_VALUE + 1;
        return (int)(intersection.doubleValue() / union.doubleValue() * (Character.MAX_VALUE + 1));
    }
	
	private Map<String, Long> group(String str) {
		return IntStream.range(0, str.length() - 1)
				.mapToObj(index -> str.substring(index, index + 2))
				.filter(text -> text.matches("^[a-zA-Z]*$"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	private Integer getIntersection(Map<String, Long> str1Map, Map<String, Long> str2Map) {
		return str1Map.entrySet().stream()
				.filter(entry -> str2Map.containsKey(entry.getKey()))
				.map(entry -> Math.min(entry.getValue(), str2Map.get(entry.getKey())))
				.mapToInt(Long::intValue)
				.sum();
	}
	
	private Integer getUnion(Map<String, Long> copyStr1Map, Map<String, Long> str2Map) {
		str2Map.forEach((key, value) -> {
			copyStr1Map.merge(key, value, (v1, v2) -> {
				return (v1 > v2) ? v1 : v2;
			});
		});
		return copyStr1Map.values().stream()
				.mapToInt(Long::intValue)
				.sum();
	}
}
