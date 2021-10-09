#include <stdio.h>
#include <stdlib.h>

void permutation(int* arr, int n, int r, int start, int prev)
{
	if (r == start)
	{
		for (int i = 0; i < r; i++)
			printf("%d ", arr[i]);
		printf("\n");
	}
	else
	{
		for (int i = prev; i <= n; i++)
		{
			arr[start] = i;
			permutation(arr, n, r, start + 1, i);
		}
	}
}

int main(void)
{
	int M;
	int N;
	int* arr;
	scanf("%d %d", &M, &N);
	arr = malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++)
		arr[i] = 0;
	permutation(arr, M, N, 0, 1);
	free(arr);
	return 0;
}