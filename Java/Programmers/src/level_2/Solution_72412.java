package level_2;

import java.util.*;

/**
 * ���� �˻�
 * @author delusidiot
 *
 */
public class Solution_72412 {

	public static void main(String[] args) {
		Solution_72412 solution = new Solution_72412();
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(Arrays.toString(solution.solution(info, query)));
	}
	
	public int[] solution(String[] info, String[] query) {
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        int[] answer = new int[query.length];
        for (int i = 0; i < info.length; i++) {
        	dfs("", 0, info[i].split(" "), map);
        }
        map.values().forEach(list -> Collections.sort(list));
        for (int i = 0; i < query.length; i++) {
        	String[] str = query[i].replaceAll(" and ", "").split(" ");
        	answer[i] = map.containsKey(str[0]) ? search(str[0], Integer.parseInt(str[1]), map.get(str[0])) : 0;
        }
        return answer;
    }
	
	public void dfs(String pos, int depth, String[] info, Map<String, List<Integer>> map) {
		if (depth == 4) {
			if (!map.containsKey(pos)) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(Integer.parseInt(info[4]));
				map.put(pos, list);
			}
			else
				map.get(pos.toString()).add(Integer.parseInt(info[4]));
			return;
		}
		dfs(pos + "-", depth + 1, info, map);
		dfs(pos + info[depth], depth + 1, info, map);
	}
	public int search(String str, int score, List<Integer> list) {
		int start = 0, end = list.size() - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (list.get(mid) < score) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return list.size() - start;
	}
}
