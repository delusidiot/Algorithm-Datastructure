package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_14889 {
	
	static int min;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[][] ability = new int[N][N];
		min = Integer.MAX_VALUE;
		for (int n = 0; n <  N; n++) {
			ability[n] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		createTeam(ability, 0, 0, new boolean[N]);
		System.out.println(min);
	}
	
	public static void createTeam(int[][] ability, int index, int num, boolean[] check) {
		if (num == N / 2) {
			int abilityScore = teamAbility(ability, check);
			min = Math.min(min, abilityScore);
			if (min == 0) {
				System.out.println(min);
				System.exit(0);
			}
			return;
		}
		for (int i = index; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				createTeam(ability, i + 1, num + 1, check);
				check[i] = false;
			}
		}
	}
	
	public static int teamAbility(int[][] ability, boolean[] check) {
		int Ateam = 0;
		int Bteam = 0;
		for (int i = 0; i < ability.length; i++) {
			for (int j = 0; j < ability[i].length; j++) {
				if (check[i] && check [j]) {
					Ateam += ability[i][j];
				} else if (!check[i] && !check[j]) {
					Bteam += ability[i][j];
				}
			}
		}
		return Math.abs(Bteam - Ateam);
	}
}
