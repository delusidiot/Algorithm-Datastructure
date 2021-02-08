#include "merge_sort.h"

int main(void)
{
	int arr[5] = { 1,2,3,5,3 };
	for (int i = 0; i < ARR_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	merge_sort(arr, 0, ARR_SIZE - 1);
	for (int i = 0; i < ARR_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}