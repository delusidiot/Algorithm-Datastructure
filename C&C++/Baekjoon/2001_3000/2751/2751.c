#include <stdio.h>
#include <stdlib.h>

void merge(int* arr, int left, int mid, int right)
{
	int i, j, k;
	int n1 = mid - left + 1;
	int n2 = right - mid;
	int* L, * R;

	L = malloc(sizeof(int) * n1);
	R = malloc(sizeof(int) * n2);
	for (i = 0; i < n1; i++)
		L[i] = arr[left + i];
	for (j = 0; j < n2; j++)
		R[j] = arr[mid + 1 + j];

	i = 0;
	j = 0;
	k = left;
	while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			arr[k] = L[i];
			i++;
		}
		else {
			arr[k] = R[j];
			j++;
		}
		k++;
	}
	while (i < n1) {
		arr[k] = L[i];
		i++;
		k++;
	}
	while (j < n2) {
		arr[k] = R[j];
		j++;
		k++;
	}
	free(L);
	free(R);
}

void merge_sort(int* arr, int left, int right)
{
	if (left < right)
	{
		int mid = (left + right) / 2;
		merge_sort(arr, left, mid);
		merge_sort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}
}

int main(void)
{
	int N;
	int* arr;
	scanf("%d", &N);

	arr = malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
	}
	merge_sort(arr, 0, N - 1);
	for (int i = 0; i < N; i++)
	{
		printf("%d\n", arr[i]);
	}
	return 0;
}