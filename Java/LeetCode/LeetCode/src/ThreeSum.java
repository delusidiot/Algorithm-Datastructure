import java.util.*;
/**
 * 3Sum
 */

class ThreeSum {
    
	public int binarySearch(int[] a, int lo, int hi, int key) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return binarySearch(a, lo, mid - 1, key);
        else if (key > a[mid])
            return binarySearch(a, mid + 1, hi, key);
        else
            return mid;
    }
    
	public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3 )
            return new ArrayList<>();
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                int sum = nums[i] + nums[j];
                int searchValue = binarySearch(nums, j + 1, nums.length - 1, -sum);
                if (searchValue >= 0)
                    result.add(Arrays.asList(nums[i], nums[j], nums[searchValue]));
            }
        }
        return new ArrayList<>(result);
    }
	
	/**
	 * nums�� sort�� �ڿ�
	 * �� ���ó�� binarySearch�� ����ϴ� ����� ������
	 * 3���� ���� �߿� ó�� ���ڴ� for�� ���������� �ϵ� 2���� ���ڴ� �糡���� ���� ã�ư��� ������� ������ �� �ִ�.
	 */
}