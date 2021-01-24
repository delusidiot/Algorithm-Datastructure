#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int C;
	int N;
	int* scores;
	double avg;
	int count;

	scanf("%d", &C);
	for (int test_case = 0; test_case < C; test_case++ )
	{
		avg = 0;
		count = 0;
		scanf("%d", &N);
		scores = malloc(sizeof(int) * N);
		for (int i = 0; i < N; i++)
		{
			scanf("%d", &scores[i]);
			avg += scores[i];
		}
		avg /= N;
		for (int i = 0; i < N; i++)
		{
			if (avg < scores[i])
				count++;
		}
		free(scores);
		printf("%.3lf%%\n", (double)count / (double)N * 100);
	}
	return 0;
}