package success;

import java.util.HashSet;
import java.util.Set;

/**
 * Ä«Ä«¿ÀÇÁ·»Áî ÄÃ·¯¸µºÏ
 * @author delusidiot
 *
 */
public class Solution_1829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int[] dx = {0, 0, 1, -1};
    private int[] dy = {1, -1, 0, 0};
    private int maxSizeOfOneArea = 0;
    public int[] solution(int m, int n, int[][] picture) {
        Set<Integer> set = new HashSet<Integer>();
        int[] answer = new int[2];
        answer[0] = 0;
        int [][]pic = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pic[i][j] = picture[i][j];
                set.add(pic[i][j]);
            }
        }
        set.remove(0);
        for (Integer num : set){
            for(int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    if (pic[i][j] == num){
                        areaCheck(m, n, i, j, pic, num);
                        answer[0]++;
                    }
                }
            }
        }
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    private class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void areaCheck(int m, int n, int x, int y, int[][] pic, int num){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        pic[x][y] = -1;
        int count = 1;
        while (!q.isEmpty()){
            Node node = q.poll();
            for (int i = 0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx >= m || nx < 0 || ny >= n || ny < 0)
                    continue;
                if (pic[nx][ny] == num){
                    pic[nx][ny] = -1;
                    q.offer(new Node(nx, ny));
                    count++;
                }
            }
        }
        if (maxSizeOfOneArea < count)
            maxSizeOfOneArea = count;
    }
}
