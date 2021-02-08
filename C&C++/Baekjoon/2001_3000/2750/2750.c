#include <stdio.h>
#include <stdlib.h>

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
	for (int i = 0; i < N; i++)
	{
		int min = arr[i];
		int minIdx = i;
		for (int j = i + 1; j < N; j++)
		{
			if (min > arr[j])
			{
				min = arr[j];
				minIdx = j;
			}
		}
		if (i != minIdx)
		{
			arr[i] ^= arr[minIdx];
			arr[minIdx] ^= arr[i];
			arr[i] ^= arr[minIdx];
		}
		printf("%d\n", arr[i]);
	}
	return 0;
}