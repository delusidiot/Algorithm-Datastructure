package success;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution_13229 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		Map<String, Long> week = 
				Arrays.stream(new String[]{"SUN:7", "MON:6","TUE:5","WED:4","THU:3","FRI:2", "SAT:1"})
					.map(el -> el.split(":"))
					.collect(Collectors.toMap(e-> e[0], e->Long.parseLong(e[1])));
		for (int test_case = 1; test_case <= T; test_case++) {
			String N = br.readLine().trim();
			System.out.println("#" + test_case + " " + week.get(N));
		}
	}
}
