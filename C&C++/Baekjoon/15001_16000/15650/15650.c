#include <stdio.h>
#include <stdlib.h>

void combination(int* arr, int n, int r, int start)
{
	if (r == 0)
	{
		for (int i = 0; i < n + 1; i++)
		{
			if (arr[i])
				printf("%d ", i);
		}
		printf("\n");
	}
	else if (n < start)
		return;
	else
	{
		for (size_t i = start; i <= n - r + 1; i++)
		{
			arr[i] = 1;
			combination(arr, n, r - 1, i + 1);
			arr[i] = 0;
		}
	}
}

int main(void)
{
	int M;
	int N;
	int* arr;
	scanf("%d %d", &M, &N);
	arr = malloc(sizeof(int) * (M + 1));
	for (int i = 0; i < M + 1; i++)
		arr[i] = 0;
	combination(arr, M, N, 1);
	return 0;
}