package level_1;

import java.util.*;
/**
 * ������
 * @author delusidiot
 *
 */

public class Solution_42889 {
	public int[] solution(int N, int[] stages) {
        List<Fail> fails = new ArrayList<Fail>();
        for(int i = 0; i < N + 2; i++){
            fails.add(new Fail(i));
        }
        for (int i = 0; i < stages.length;i++){
            for (int j = 1; j <= stages[i]; j++){
                fails.get(j).playCount++;
            }
            fails.get(stages[i]).notClear ++;
        }
        fails.remove(fails.size() - 1);
        fails.remove(0);
        Collections.sort(fails);
        int[] answer = new int[N];
        for(int i = 0; i < N; i++){
            answer[N - i - 1] = fails.get(i).level;
        }
        return answer;
    }
}


class Fail implements Comparable<Fail>{
    int level;
    int playCount;
    int notClear;
    public Fail(int level){
        this.level = level;
        this.playCount = 0;
        this.notClear = 0;
    }
    
    @Override
    public int compareTo(Fail o){
        double a = this.playCount > 0 ? (double)this.notClear / (double)this.playCount : 0;
        double b = o.playCount > 0 ? (double)o.notClear / (double)o.playCount : 0;
        if (a > b)
            return 1;
        return -1;
    }
}