package level_2;

import java.util.*;
/**
 * �ĺ�Ű
 * @author delusidiot
 *
 */
public class Solution_42890 {

	public static void main(String[] args) {
		// [["100","ryan","music","2"],["200","apeach","math","2"],["300","tube","computer","3"],["400","con","computer","4"],["500","muzi","music","3"],["600","apeach","music","2"]]
		// result = 2
		String[][] relation = {};
		Solution_42890 solution = new Solution_42890();
		System.out.println(solution.solution(relation));
	}
	public int solution(String[][] relation) {
        List<Integer> keys = new ArrayList<>();
        for (int i = 1; i < (1 << relation[0].length); i++) {
            if (!isMinimal(i, keys)) continue;
            if (isUnique(i, relation))
                keys.add(i);
        }
        return keys.size();
    }

    private boolean isUnique(int i, String[][] relation) {
        Set<String> set = new HashSet<>();

        for (int row = 0; row < relation.length; row++) {
            StringBuffer sb = new StringBuffer();
            for (int col = 0; col < relation[row].length; col++) {
                if ((i & (1 << col)) != 0)
                    sb.append(relation[row][col]);
            }
            if (set.contains(sb.toString())) return false;
            else set.add(sb.toString());
        }
        return true;
    }
    private boolean isMinimal(int i, List<Integer> keys) {
        for (int key: keys) {
            if ((key & i) == key) return false;
        }
        return true;
    }
}
