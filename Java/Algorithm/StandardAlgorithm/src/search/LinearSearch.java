package search;

public class LinearSearch {
	
	static int[] arr = {5, 6, 1, 10, 22, 3};
	static int number = 3;

	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);
	}

	public int search(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return i;
		}
		return -1;
	}
}
