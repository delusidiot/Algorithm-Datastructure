package success;

import java.util.*;

/**
 * ¿ÀÇÂ Ã¤ÆÃ¹æ
 * @author delusidiot
 *
 */


public class Solution_42888 {

	public static void main(String[] args) {
		Solution_42888 solution = new Solution_42888();
		String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(solution.solution(str)));
	}
	
	enum Cmd {
		Enter,
		Change,
		Leave;
	}
	
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        int idx = 0;
        for(int i = 0; i < record.length; i++){
            String[] command = record[i].split(" ");
            switch(Cmd.valueOf(command[0])){
                case Enter:
                    user.put(command[1], command[2]);
                    idx++;
                    break;
                case Change:
                    user.put(command[1], command[2]);
                    break;
                case Leave:
                    idx++;
                    break;
            }
        }
        String[] result = new String[idx];
        idx = 0;
        for(int i = 0; i < record.length; i++){
            String[] command = record[i].split(" ");
            switch(Cmd.valueOf(command[0])){
                case Enter:
                    result[idx++] = user.get(command[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
                    break;
                case Leave:
                    result[idx++] = user.get(command[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
                    break;
				default:
					break;
            }
        }
        return result;
    }

}
