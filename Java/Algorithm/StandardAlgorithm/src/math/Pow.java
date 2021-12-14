package math;

import java.util.HashMap;
import java.util.Map;

public class Pow {
	
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 

	public static void main(String[] args) {
		System.out.println(pow2(2, 10));
		pow(2, 10);
		System.out.println(map);
	}
	
	public static int pow(int a, int b) {
		if (b == 0)
			return 1;
		if (map.containsKey(b))
			return map.get(b);
		int n = pow(a, b / 2);
		if (b % 2 == 0)
			map.put(b, n * n);
		else
			map.put(b, a * n * n);
		return map.get(b);
	}
	public static int pow2(int a, int b) {
		if (b == 0)
			return 1;
		int n = pow2(a, b / 2);
		int temp = n * n;
		if (b % 2 == 0) {
			return temp;
		} else 
			return a * temp;
	}
}
