package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			Integer line = Integer.parseInt(br.readLine());
			if (line == 0)
				System.out.println(q.isEmpty()? 0 : q.poll());
			else
				q.add(line);
		}
	}

}
