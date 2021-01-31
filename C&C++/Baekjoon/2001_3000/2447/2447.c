#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void star(int x, int y, int N)
{
	if ((x / N) % 3 == 1 && (y / N) % 3 == 1)
		printf(" ");
	else
	{
		if (N / 3 == 0)
			printf("*");
		else
			star(x, y, N / 3);
	}
}

int main(void)
{
	int N;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			star(i, j, N);
		}
		printf("\n");
	}
	return 0;
}