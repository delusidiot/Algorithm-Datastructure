package level_2;

import java.util.LinkedList;
import java.util.Queue;
/**
 * ���� �� �ִܰŸ�
 * @author delusidiot
 *
 */
public class Solution_1844 {
	
	int[] dx = {1,-1,0,0};
	int[] dy = {0,0,1,-1};

	public static void main(String[] args) {
		Solution_1844 solution = new Solution_1844();
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println(solution.solution(maps));

	}
	public int solution(int[][] maps) {
		int row = maps.length;
		int col = maps[0].length;
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(0,0));
		maps[0][0] = 0;
		int count = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			count++;
			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				for (int j = 0; j < 4; j++) {
					int nx = node.x + dx[j];
					int ny = node.y + dy[j];
					if (nx < 0 || nx >= row || ny < 0 || ny >= col || maps[nx][ny] == 0)
						continue;
					if (nx == row - 1 && ny == col - 1)
						return count;
					queue.add(new Node(nx, ny));
					maps[nx][ny] = 0;
				}
			}
		}
        return -1;
    }
	private static class Node {
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + "]";
		}
		
	}
}
