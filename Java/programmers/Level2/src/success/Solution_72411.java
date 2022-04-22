package success;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 메뉴 리뉴얼
 * @author delusidiot
 *
 */
public class Solution_72411 {

	public static void main(String[] args) {
		Solution_72411 solution = new Solution_72411();
		String[] orders = {"XYZ", "XWY", "WXA"};
		int[] course = {2, 3, 4};
		System.out.println(Arrays.toString(solution.solution(orders, course)));

	}
	public String[] solution(String[] orders, int[] course) {
		List<String> result = new ArrayList<String>();
		for (int j = 0; j < course.length; j++) {
			Map<String, Integer> courseList = new HashMap<String, Integer>();
			for (int i = 0; i < orders.length; i++) {
				if (orders[i].length() < course[j])
					continue;
				addCourse(courseList, new StringBuffer(), orders[i], course[j], 0);
			}
			if (courseList.size() == 0)
				continue;
			Integer max = courseList.values().stream().mapToInt(Integer::intValue).max().getAsInt();
			courseList.entrySet().stream().filter(x -> x.getValue() == max && x.getValue() > 1).map(x -> x.getKey()).forEach(str -> {
				result.add(str);
			});
		}
        return result.stream().sorted().toArray(String[]::new);
    }
	
	public void addCourse(Map<String, Integer> map, StringBuffer sb, String order, int course, int index) {
		if (course == 0) {
			String result = sb.chars().sorted().collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
			if (map.containsKey(result)) {
				map.put(result, map.get(result) + 1);
			}
			else
				map.put(result, 1);
			return ;
		}
		for (int i = index; i < order.length(); i++) {
			StringBuffer nextSb = new StringBuffer(sb.toString());
			nextSb.append(order.charAt(i));
			addCourse(map, nextSb, order, course - 1, i + 1);
		}
	}
}
