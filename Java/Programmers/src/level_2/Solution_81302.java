package level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * �Ÿ��α� Ȯ���ϱ�
 * @author delusidiot
 *
 */
public class Solution_81302 {
	
	int[] dx = {1, -1, 0, 0};
	int[] dy = {0,0, 1, -1};

	public static void main(String[] args) {
		Solution_81302 solution = new Solution_81302();
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
							 {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
							 {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
							 {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
							 {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		System.out.println(Arrays.toString(solution.solution(places)));
		
	}
	public int[] solution(String[][] places) {
		List<Integer> list = new ArrayList<>();
		int row = places.length;
		int col = places[0].length;
		int[] result = new int[row];
		for (int r = 0; r < row; r++) {
			String[] curr = new String[row];
			for (int c = 0; c < col; c++) {
				curr[c] = places[r][c];
			}
			result[r] = isDistance(curr) ? 1 : 0;
		}
        return result;
    }
	
	private boolean isDistance(String[] curr) {
		int row = curr.length;
		int col = curr[0].length();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (curr[i].charAt(j) == 'P' && getDistance(curr, i, j) <= 2)
						return false;
			}
		}
		return true;
	}

	private int getDistance(String[] curr, int x, int y) {
		int row = curr.length;
		int col = curr[0].length();
		boolean[][] checker = new boolean[row][col];
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(new Node(x, y));
		checker[x][y] = true;
		int counter = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int s = 0; s < size; s++) {
				Node node = queue.poll();
				for (int i = 0; i < 4; i++) {
					int nx = node.x + dx[i];
					int ny = node.y + dy[i];
					if (nx >= row || nx < 0 || ny >= col || ny < 0 || checker[nx][ny] || curr[nx].charAt(ny) == 'X')
						continue;
					if (curr[nx].charAt(ny) == 'P')
						return counter;
					queue.add(new Node(nx, ny));
					checker[nx][ny] = true;
				}
			}
			counter++;
		}
		return Integer.MAX_VALUE;
	}
	
	private static class Node {
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
