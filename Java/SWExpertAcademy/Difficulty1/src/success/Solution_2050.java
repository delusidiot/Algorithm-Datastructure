package success;

import java.util.Scanner;

public class Solution_2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine().chars().forEach(c -> System.out.print(c - 'A' + 1 + " "));
		sc.close();
	}
}
