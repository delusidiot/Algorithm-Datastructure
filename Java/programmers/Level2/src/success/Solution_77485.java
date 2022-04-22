package success;

import java.util.Arrays;
/**
 * 행렬 테두리 회전하기
 * @author delusidiot
 *
 */
public class Solution_77485 {

	public static void main(String[] args) {
		Solution_77485 solution = new Solution_77485();
		int rows = 6;
		int columns = 8;
		int[][] queries = {{2,2,6,8}};
//		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		System.out.println(Arrays.toString(solution.solution(rows, columns, queries)));

	}
	public int[] solution(int rows, int columns, int[][] queries) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = (i * columns) + j + 1;
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int x0 = queries[i][0] - 1;
			int y0 = queries[i][1] - 1;
			int x1 = queries[i][2] - 1;
			int y1 = queries[i][3] - 1;
			int nextVal = matrix[x0][y0];
			int min = Integer.MAX_VALUE;
			for (int k = y0; k < y1; k++) {
				int temp = matrix[x0][k + 1];
				matrix[x0][k + 1] = nextVal;
				nextVal = temp;
				min = Math.min(nextVal, min);
			}
			for (int k = x0; k < x1; k++) {
				int temp = matrix[k + 1][y1];
				matrix[k + 1][y1] = nextVal;
				nextVal = temp;
				min = Math.min(nextVal, min);
			}
			for (int k = y1; k > y0; k--) {
				int temp = matrix[x1][k - 1];
				matrix[x1][k - 1] = nextVal;
				nextVal = temp;
				min = Math.min(nextVal, min);
			}
			for (int k = x1; k > x0; k--) {
				int temp = matrix[k - 1][y0];
				matrix[k - 1][y0] = nextVal;
				nextVal = temp;
				min = Math.min(nextVal, min);
			}
			answer[i] = min;
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
        return answer;
    }
}
