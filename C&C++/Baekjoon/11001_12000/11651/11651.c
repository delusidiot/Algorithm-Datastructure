#include <stdio.h>
#include <stdlib.h>

void swap(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int partition(int** coordinate, int left, int right)
{
	int l = left;

	int pivot = right;
	for (int r = left; r < right; r++)
	{
		if (coordinate[r][1] < coordinate[pivot][1] ||
			coordinate[r][1] == coordinate[pivot][1] && coordinate[r][0] < coordinate[pivot][0])
		{
			swap(&coordinate[r][0], &coordinate[l][0]);
			swap(&coordinate[r][1], &coordinate[l][1]);
			l++;
		}
	}
	swap(&coordinate[l][0], &coordinate[pivot][0]);
	swap(&coordinate[l][1], &coordinate[pivot][1]);
	return l;
}

void quick_sort(int** coordinate, int left, int right)
{
	if (left < right)
	{
		int pivot = partition(coordinate, left, right);
		quick_sort(coordinate, left, pivot - 1);
		quick_sort(coordinate, pivot + 1, right);
	}
}

int main(void)
{
	int N;
	int** coordinate;

	scanf("%d", &N);
	coordinate = malloc(sizeof(int*) * N);
	for (int i = 0; i < N; i++)
	{
		coordinate[i] = malloc(sizeof(int) * 2);
		scanf("%d %d", &coordinate[i][0], &coordinate[i][1]);
	}

	quick_sort(coordinate, 0, N - 1);

	for (int i = 0; i < N; i++)
	{
		printf("%d %d\n", coordinate[i][0], coordinate[i][1]);
	}

	for (int i = 0; i < N; i++)
	{
		free(coordinate[i]);
	}
	free(coordinate);
	return 0;
}