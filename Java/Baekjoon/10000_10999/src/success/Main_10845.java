package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		List<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().trim().split(" ");
			switch (line[0]) {
			case "push":
				queue.add(Integer.parseInt(line[1]));
				break;
			case "pop":
				System.out.println(queue.size() > 0 ? queue.remove(0): "-1");
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.isEmpty()? 1 : 0);
				break;
			case "front":
				System.out.println(queue.size() > 0 ? queue.get(0): "-1");
				break;
			case "back":
				System.out.println(queue.size() > 0 ? queue.get(queue.size() - 1): "-1");
				break;
			}
		}
	}
}
