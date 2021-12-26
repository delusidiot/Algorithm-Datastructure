package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_6900 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] NM = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			List<Lottery> luckyNumbers = new ArrayList<Lottery>();
			for (int i = 0; i < NM[0]; i++) {
				String[] numbers = br.readLine().trim().split(" ");
				luckyNumbers.add(new Lottery(numbers[0], Integer.parseInt(numbers[1])));
			}
			int money = 0;
			for (int i = 0; i < NM[1]; i++) {
				String numbers = br.readLine().trim();
				for (Lottery l: luckyNumbers) {
					if (l.check(numbers))
						money += l.money;
				}
			}
			System.out.printf("#%d %d\n", test_case, money);
		}
	}
	
	static class Lottery{
		String luckyNumber;
		int money;
		
		public Lottery(String luckyNumber, int money) {
			this.luckyNumber = luckyNumber;
			this.money = money;
		}
		
		public boolean check(String number) {
			for (int i = 0; i < luckyNumber.length(); i++) {
				if (luckyNumber.charAt(i) == '*')
					continue;
				if (number.charAt(i) != this.luckyNumber.charAt(i))
					return false;
			}
			return true;
		}
	}
}
