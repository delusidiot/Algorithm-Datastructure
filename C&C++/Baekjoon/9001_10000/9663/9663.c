#include <stdio.h>
#include <stdlib.h>

int is_die(int *arr, int curr, int num)
{
	int i = 1;
	while(curr - i >= 0)
	{
		if (arr[curr - i] == num)
			return 1;
		if (arr[curr - i] == num - i)
			return 1;
		if (arr[curr - i] == num + i)
			return 1;
		i++;
	}
	return 0;
}

void N_Queen(int *arr, int N, int curr, int *cnt)
{
	if (curr == N)
	{
		(*cnt)++;
		return;
	}
	for (int i = 0; i < N; i++)
	{
		if (!is_die(arr, curr, i))
		{
			arr[curr] = i;
			N_Queen(arr, N, curr + 1, cnt);
		}
	}
}

int main(void)
{
	int N;
	int cnt = 0;
	scanf("%d", &N);
	int* arr = malloc(sizeof(int) * N);

	for (int i = 0; i < N; i++)
	{
		arr[0] = i;
		N_Queen(arr, N, 1, &cnt);
	}
	printf("%d\n", cnt);
	return 0;
}