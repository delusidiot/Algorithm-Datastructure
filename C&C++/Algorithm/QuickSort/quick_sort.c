#include "quick_sort.h"

void quick_sort(int* arr, int l, int r)
{
	if (l >= r)
		return;
	int pivot, left, right;
	int temp;

	pivot = l;
	left = l + 1;
	right = r;
	while (left <= right)
	{
		while(left <= r&& arr[left] <= arr[pivot])
			left++;
		while(right > l&& arr[right] > arr[pivot])
			right--;
		if (left <= right)
		{
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
		}
		else
		{
			temp = arr[pivot];
			arr[pivot] = arr[right];
			arr[right] = temp;
		}
	}
	quick_sort(arr, l, right - 1);
	quick_sort(arr, right + 1, r);
}