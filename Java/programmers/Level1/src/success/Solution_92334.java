package success;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 신고 결과 받기
 * @author delusidiot
 *
 */
public class Solution_92334 {

	public static void main(String[] args) {
		Solution_92334 instance = new Solution_92334();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(Arrays.toString(instance.solution(id_list, report, k)));
		
		String[] id_list2 = {"con", "ryan"};
		String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k2 = 2;
		System.out.println(Arrays.toString(instance.solution(id_list2, report2, k2)));
	}
	
	public int[] solution(String[] id_list, String[] report, int k) {
		Map<String, Set<String>> users = new HashMap<>();
		Map<String, Integer> danger = new HashMap<>();
		for(String id: id_list) {
			users.put(id, new HashSet<>());
			danger.put(id, 0);
		}
		for (String r: report) {
			String[] split = r.split(" "); // 신고자, 신고된 유저
			if (!users.get(split[0]).contains(split[1]))
				danger.merge(split[1], 1, Integer::sum);
			users.get(split[0]).add(split[1]);
		}
		return Arrays.stream(id_list).map(user-> {
			return users.get(user).stream().filter(s -> danger.get(s) >= k).count();
		}).mapToInt(Long::intValue).toArray();
    }
}
