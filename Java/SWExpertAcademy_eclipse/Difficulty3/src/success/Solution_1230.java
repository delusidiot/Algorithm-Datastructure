package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_1230 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			List<Integer> cryptogram = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
			int numOfCommand = Integer.parseInt(br.readLine());
			String[] commands = br.readLine().trim().split(" ");
			int index = 0;
			for (int i = 0; i < numOfCommand; i++) {
				String command = commands[index++];
				int cur;
				int count;
				switch (command) {
					case "I":
						cur = Integer.parseInt(commands[index++]);
						count = Integer.parseInt(commands[index++]);
						for (int c = 0; c < count; c++) {
							cryptogram.add(cur, Integer.parseInt(commands[index++]));
							cur++;
						}
						break;
					case "D":
						cur = Integer.parseInt(commands[index++]);
						count = Integer.parseInt(commands[index++]);
						for (int c = 0; c < count; c++)
							cryptogram.remove(cur);
						break;
					case "A":
						count = Integer.parseInt(commands[index++]);
						for (int c = 0; c < count; c++) {
							Integer addNum = Integer.parseInt(commands[index++]);
							cryptogram.add(addNum);
						}
						break;
				}
			}
			System.out.printf("#%d ",test_case);
			for (int i = 0; i < 10; i++)
				System.out.printf("%d ",cryptogram.get(i));
			System.out.println();
		}
	}

}
