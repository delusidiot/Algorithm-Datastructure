package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_1228 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			List<Integer> cryptogram = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
			int numOfCommand = Integer.parseInt(br.readLine());
			String[] command = br.readLine().trim().split(" ");
			int index = 0;
			for (int i = 0; i < numOfCommand; i++) {
				index++;
				int cur = Integer.parseInt(command[index++]);
				int count = Integer.parseInt(command[index++]);
				for (int c = 0; c < count; c++) {
					cryptogram.add(cur, Integer.parseInt(command[index++]));
					cur++;
				}
			}
			System.out.printf("#%d ",test_case);
			for (int i = 0; i < 10; i++)
				System.out.printf("%d ",cryptogram.get(i));
			System.out.println();
		}
	}

}
