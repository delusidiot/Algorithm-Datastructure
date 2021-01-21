#include <stdio.h>

int main(void)
{
	int N;
	int X;
	int num;

	scanf("%d %d", &N, &X);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &num);
		if (num < X)
			printf("%d ", num);
	}
	
	return 0;
}