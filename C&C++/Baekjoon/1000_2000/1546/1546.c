#include <stdio.h>

int main(void)
{
	int N;
	int score;
	int max =  0;
	double total = 0;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &score);
		if (max < score)
			max = score;
		total += score;
	}
	printf("%lf\n", total / max * 100 / N);
	return 0;
}