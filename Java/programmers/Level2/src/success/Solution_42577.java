package success;

import java.util.*;
import java.util.stream.Collectors;
/**
 * 전화번호 목록
 * @author delusidiot
 *
 */
public class Solution_42577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean solution(String[] phone_book) {
        Set<String> set = Arrays.asList(phone_book).stream().collect(Collectors.toSet());
        for(String pb : phone_book){
            for(int i = 1; i < pb.length(); i++){
                if (set.contains(pb.substring(0,i)))
                    return false;
            }
        }
        return true;
    }
}
