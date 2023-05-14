package success;

import java.util.Scanner;

public class Solution_2043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		System.out.println(Integer.parseInt(num[0]) - Integer.parseInt(num[1]) + 1);
		sc.close();
	}
}
