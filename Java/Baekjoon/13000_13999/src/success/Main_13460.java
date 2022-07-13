package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public class Main_13460 {
	
	private static int[] dx = {-1,0,1,0};
	private static int[] dy = {0,1,0,-1};
	private static final int MAX_COUNTER = 10;
	
	private static class Node {
		int x;
		int y;
		public Node (int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			return x == other.x && y == other.y;
		}
		
		public Node clone() {
			return new Node(this.x, this.y);
		}
		
	}
	
	private static class Bead {
		Node red;
		Node blue;
		static char[][] board;
		
		public void nextBead(int index, Node end) throws Exception {
			Bead prevBead = this.clone();
			blueMove(index);
			redMove(index);
			if (this.isBlueEnd(end) || this.isRedEnd(end))
				return ;
			if (this.red.equals(this.blue)) {
				if (index == 0) {
					if (prevBead.red.x > prevBead.blue.x) this.red.x -= dx[index];
					else this.blue.x -= dx[index];
				} else if (index == 1) {
					if (prevBead.red.y < prevBead.blue.y) this.red.y -= dy[index];
					else this.blue.y -= dy[index];
				} else if (index == 2) {
					if (prevBead.red.x < prevBead.blue.x) this.red.x -= dx[index];
					else this.blue.x -= dx[index];
				} else {
					if (prevBead.red.y > prevBead.blue.y) this.red.y -= dy[index];
					else this.blue.y -= dy[index];
				}
			}
		}
		public void blueMove(int index) {
			while (board[blue.x + dx[index]][blue.y + dy[index]] != '#' && board[blue.x][blue.y] != 'O') {
				blue.x += dx[index];
				blue.y += dy[index];
			}
		}
		
		public void redMove(int index) {
			while (board[red.x + dx[index]][red.y + dy[index]] != '#' && board[red.x][red.y] != 'O') {
				red.x += dx[index];
				red.y += dy[index];
			}
		}
		
		public boolean isBlueEnd(Node end) {
			return this.blue.equals(end);
		}
		
		public boolean isRedEnd(Node end) {
			return this.red.equals(end);
		}

		@Override
		public int hashCode() {
			return Objects.hash(blue, red);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bead other = (Bead) obj;
			return Objects.equals(blue, other.blue) && Objects.equals(red, other.red);
		}
		
		public Bead clone() {
			Bead clone = new Bead();
			clone.blue = this.blue.clone();
			clone.red = this.red.clone();
			return clone;
		}
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		Integer N = Integer.parseInt(split[0]);
		Integer M = Integer.parseInt(split[1]);
		
		/** 10 번 이하로 빼낼수 없으면 -1
		* . 빈칸
		* # 공이 이동할 수 없는 장애물 또는 벽
		* O 구멍의 위치
		* R 빨간 구슬의 위치
		* B 파랑 구슬의 위치
		* 빨간 구슬만 구멍에 빠져야 한다.
		**/
		Node end = null;
		Bead bead = new Bead();
		Bead.board = new char[N][M];
		for (int i = 0; i < N; i++) {
			Bead.board[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if (Bead.board[i][j] == 'O') {
					end = new Node(i, j);
				} else if (Bead.board[i][j] == 'R') {
					bead.red = new Node(i, j);
				} else if (Bead.board[i][j] == 'B') {
					bead.blue = new Node(i, j);
				}
			}
		}
		
		System.out.println(bfs(bead, end));
		br.close();
	}
	
	public static int bfs(Bead bead, Node end) throws Exception {
		int counter = 0;
		Queue<Bead> queue = new LinkedList<Bead>();
		Set<Bead> visited = new HashSet<Bead>();
		queue.add(bead);
		visited.add(bead);
		while (!queue.isEmpty()) {
			int size = queue.size();
			counter++;
			if (counter > MAX_COUNTER)
				return -1;
			for (int s = 0; s < size; s++) {
				Bead curBead = queue.poll();
				for (int i = 0; i < 4; i++) {
					Bead nextBead = curBead.clone();
					nextBead.nextBead(i, end);
					if (nextBead.isBlueEnd(end)) {
						continue;
					}
					if (nextBead.isRedEnd(end)) {
						return counter;
					}
					if (!visited.contains(nextBead)) {
						visited.add(nextBead);
						queue.add(nextBead);
					}
				}
			}
		}
		return -1;
	}
}
