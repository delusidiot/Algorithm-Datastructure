package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
3
2 0 2
0 2 0
2 0 2
answer : 4

4
2 2 4 16
0 0 0 0
0 0 0 0
0 0 0 0
answer 16

10
16 16 8 32 32 0 0 8 8 8
16 0 0 0 0 8 0 0 0 16
0 0 0 0 0 0 0 0 0 2
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
answer 64

5
2 2 4 8 16
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
2 2 4 8 16
answer 64

 */

public class Main_12100 {
	
	private static class Board {
		int N;
		int[][] board;
		public Board(int N) {
			this.N = N;
			board = new int[N][N];
		}
		
		public Board(Board prevBoard) {
			this.N = prevBoard.N;
			board = Arrays.stream(prevBoard.board).map(int[]::clone).toArray(int[][]::new);
		}
		
		public void setBoard(int N, BufferedReader br) throws IOException {
			for (int i = 0; i < N; i++)
				board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		public Board upBoard() {
			Board nextBoard = new Board(this);
			
			for (int i = 0; i < N; i++) {
				boolean[] check = new boolean[N];
				for (int j = 0; j < N; j++) {
					if (nextBoard.board[j][i] != 0) {
						int k = j;
						int num = nextBoard.board[j][i];
						nextBoard.board[j][i] = 0;
						while (k != 0 && nextBoard.board[k][i] == 0)
							k--;
						if (nextBoard.board[k][i] == num && !check[k]) {
							check[k] = true;
							nextBoard.board[k][i] *= 2;
						}
						else if (k == j || (k == 0 && nextBoard.board[k][i] == 0))
							nextBoard.board[k][i] = num;
						else
							nextBoard.board[k + 1][i] = num;
					}
				}
			}
			return nextBoard;
		}
		
		public Board rightBoard() {
			Board nextBoard = new Board(this);
			for (int i = 0; i < N; i++) {
				boolean[] check = new boolean[N];
				for (int j = N - 1; j >= 0; j--) {
					if (nextBoard.board[i][j] != 0) {
						int k = j;
						int num = nextBoard.board[i][j];
						nextBoard.board[i][j] = 0;
						while (k != N - 1 && nextBoard.board[i][k] == 0)
							k++;
						if (nextBoard.board[i][k] == num && !check[k]) {
							check[k] = true;
							nextBoard.board[i][k] *= 2;
						}
						else if (k == j || (k == N - 1  && nextBoard.board[i][k] == 0))
							nextBoard.board[i][k] = num;
						else
							nextBoard.board[i][k - 1] = num;
					}
				}
			}
			return nextBoard;
		}
		
		public Board downBoard() {
			Board nextBoard = new Board(this);
			for (int i = 0; i < N; i++) {
				boolean[] check = new boolean[N];
				for (int j = N - 1; j >= 0; j--) {
					if (nextBoard.board[j][i] != 0) {
						int k = j;
						int num = nextBoard.board[j][i];
						nextBoard.board[j][i] = 0;
						while (k != N - 1 && nextBoard.board[k][i] == 0)
							k++;
						if (nextBoard.board[k][i] == num && !check[k]) {
							check[k] = true;
							nextBoard.board[k][i] *= 2;
						}
						else if (k == j || (k == N - 1  && nextBoard.board[k][i] == 0))
							nextBoard.board[k][i] = num;
						else
							nextBoard.board[k - 1][i] = num;
					}
				}
			}
			return nextBoard;
		}
		
		public Board leftBoard() {
			Board nextBoard = new Board(this);
			for (int i = 0; i < N; i++) {
				boolean[] check = new boolean[N];
				for (int j = 0; j < N; j++) {
					if (nextBoard.board[i][j] != 0) {
						int k = j;
						int num = nextBoard.board[i][j];
						nextBoard.board[i][j] = 0;
						while (k != 0 && nextBoard.board[i][k] == 0)
							k--;
						if (nextBoard.board[i][k] == num && !check[k]) {
							check[k] = true;
							nextBoard.board[i][k] *= 2;
						}
						else if (k == j || (k == 0  && nextBoard.board[i][k] == 0))
							nextBoard.board[i][k] = num;
						else
							nextBoard.board[i][k + 1] = num;
					}
				}
			}
			return nextBoard;
		}
		
		public int maxValue() {
			int max = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][j] > max)
						max = board[i][j];
				}
			}
			return max;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.deepHashCode(board);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Board other = (Board) obj;
			return Arrays.deepEquals(board, other.board);
		}

		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			Arrays.stream(board).forEach(arr -> sb.append(Arrays.toString(arr) + "\n"));
			return sb.toString();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		
		
		Board board = new Board(N);
		board.setBoard(N, br);
		System.out.println(bfs(N, board));
		br.close();
	}
	
	public static int bfs(int N, Board board) {
		int counter = 5;
		Queue<Board> queue = new LinkedList<Board>();
		Set<Board> visited = new HashSet<Board>();
		queue.add(board);
		visited.add(board);
		int max = board.maxValue();
		while(!queue.isEmpty() && counter > 0) {
			int size = queue.size();
			counter--;
			for (int s = 0; s < size ; s++) {
				Board curr = queue.poll();
				Board next = curr.upBoard();
				if (!visited.contains(next)) {
					queue.add(next);
					visited.add(next);
					int currMax = next.maxValue();
					if (max < currMax)
						max = currMax;
				}
				next = curr.rightBoard();
				if (!visited.contains(next)) {
					queue.add(next);
					visited.add(next);
					int currMax = next.maxValue();
					if (max < currMax)
						max = currMax;
				}
				next = curr.downBoard();
				if (!visited.contains(next)) {
					queue.add(next);
					visited.add(next);
					int currMax = next.maxValue();
					if (max < currMax)
						max = currMax;
				}
				next = curr.leftBoard();
				if (!visited.contains(next)) {
					queue.add(next);
					visited.add(next);
					int currMax = next.maxValue();
					if (max < currMax)
						max = currMax;
				}
			}
		}
		return max;
	}
}
