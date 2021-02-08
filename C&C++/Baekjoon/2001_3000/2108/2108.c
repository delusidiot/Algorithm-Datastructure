#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void merge(int* arr, int low, int mid, int high)
{
	int n1 = mid - low + 1;
	int n2 = high - mid;
	int* copy1 = malloc(sizeof(int) * n1);
	int* copy2 = malloc(sizeof(int) * n2);
	int idx = 0;
	int jdx = 0;
	for (int i = 0; i < n1; i++)
		copy1[i] = arr[low + i];
	for (int i = 0; i < n2; i++)
		copy2[i] = arr[mid + 1 + i];
	while (idx < n1 && jdx < n2)
	{
		if (copy1[idx] <= copy2[jdx])
		{
			arr[low] = copy1[idx];
			idx++;
		}
		else
		{
			arr[low] = copy2[jdx];
			jdx++;
		}
		low++;
	}
	while (idx < n1)
	{
		arr[low] = copy1[idx];
		idx++;
		low++;
	}
	while (jdx < n2)
	{
		arr[low] = copy2[jdx];
		jdx++;
		low++;
	}
	free(copy1);
	free(copy2);
}

void merge_sort(int* arr, int low, int high)
{
	if (low < high)
	{
		int mid = (low + high) / 2;
		merge_sort(arr, low, mid);
		merge_sort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}
}

int main(void)
{
	int N;
	int sum = 0;
	int* arr;

	scanf("%d", &N);
	arr = malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
		sum += arr[i];
	}
	merge_sort(arr, 0, N - 1);
	printf("%1.lf\n", (double)sum/N);
	printf("%d\n", arr[N / 2]);
	int start = 2;
	sum = 4001;
	int prev = 0;
	int curr = 0;
	for (int i = 0; i < N; i++)
	{
		if (sum != arr[i])
		{
			int count = 0;
			sum = arr[i];
			while (sum == arr[i])
			{
				i++;
				count++;
			}
			i--;
			if (prev <= count)
			{
				if (prev == count)
				{
					start--;
					if (start > 0)
						curr = sum;
				}
				else
				{
					start = 2;
					curr = sum;
				}
				prev = count;
			}
		}
	}
	printf("%d\n", curr);
	printf("%d\n", arr[N-1] - arr[0]);
	return 0;
}