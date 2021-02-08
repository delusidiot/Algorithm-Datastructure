#include "quick_sort.h"

int main(int argc, char* argv[])
{
	int arr[5] = { 1,2,3,5,3 };
	for (int i = 0; i < ARR_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	//quick_sort(arr, 0, ARR_SIZE - 1);
	quick_sort2(arr, 0, ARR_SIZE - 1);
	for (int i = 0; i < ARR_SIZE; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	return 0;
}