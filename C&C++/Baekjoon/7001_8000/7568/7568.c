#include <stdio.h>

int main(void)
{
	int N;
	int build[50][2];
	int score[50] = { 0 };

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &build[i][0]);
		scanf("%d", &build[i][1]);
	}
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			if (i == j)
				continue;
			if (build[i][0] < build[j][0] && build[i][1] < build[j][1])
				score[i]++;
		}
	}
	for (int i = 0; i < N; i++)
	{
		printf("%d ", score[i] + 1);
	}
	printf("\n");
	return 0;
}