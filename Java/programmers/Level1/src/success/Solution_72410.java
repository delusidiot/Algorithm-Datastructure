package success;
/**
 * 신규 아이디 추천
 * @author delusidiot
 *
 */

public class Solution_72410 {
	public String solution(String new_id) {
        new_id = new_id.toLowerCase()
            .replaceAll("[^0-9a-z-_.]", "")
            .replaceAll("\\.{2,}", ".")
            .replaceAll("^\\.|\\.$", "");
        new_id = new_id.length() == 0 ? "a": new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("\\.$", "");
        new_id = shortId(new_id);
        return new_id;
    }
    public String shortId(String new_id){
        while (new_id.length() <= 2){
            new_id += new_id.charAt(new_id.length() - 1);
        }
        return new_id;
    }
}
