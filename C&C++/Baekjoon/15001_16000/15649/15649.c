#include <stdio.h>
#include <stdlib.h>

void permutation(int *arr, int * visited, int n, int r, int start)
{
	if (r == start)
	{
		for (int i = 0; i < r; i++)
			printf("%d ", arr[i]);
		printf("\n");
	}
	else
	{
		for (int i = 1; i <= n; i++)
		{
			if (!visited[i])
			{
				visited[i] = 1;
				arr[start] = i;
				permutation(arr, visited, n, r, start + 1);
				visited[i] = 0;
			}
		}
	}
}

int main(void)
{
	int M;
	int N;
	int* arr;
	int* visited;
	scanf("%d %d", &M, &N);
	arr = malloc(sizeof(int) * N);
	visited = malloc(sizeof(int) * (M + 1));
	for (int i = 0; i < N; i++)
		arr[i] = 0;
	for (int i = 0; i < M + 1; i++)
		visited[i] = 0;
	permutation(arr, visited, M, N, 0);
	free(arr);
	free(visited);
	return 0;
}