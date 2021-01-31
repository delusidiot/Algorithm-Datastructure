#include <stdio.h>
#include <stdlib.h>

void black_jack(int N, int M,int check[], int cards[], int *max, int total, int count)
{
	if (count == 0)
	{
		if (total <= M && *max < total)
			*max = total;
		return ;
	}
	for (int i = 0; i < N; i++)
	{
		if (check[i])
		{
			total += cards[i];
			check[i] = 0;
			black_jack(N, M, check, cards, max, total, count - 1);
			total -= cards[i];
			check[i] = 1;
		}
	}
}

int main(void)
{
	int N, M;
	int max = 0;
	scanf("%d %d", &N, &M);
	int* cards = malloc(sizeof(int) * N);
	int* check = malloc(sizeof(int) * N);

	for (int i = 0; i < N; i++)
	{
		check[i] = 1;
		scanf("%d", &cards[i]);
	}
	black_jack(N, M, check, cards, &max, 0, 3);
	printf("%d\n", max);
	return 0;
}