#include <stdio.h>

int main(void)
{
	int N;

	scanf("%d", &N);
	for (int i = N; i > 0; i--)
	{
		for (int j = 1; j <= N; j++)
		{
			if (j < i)
				printf(" ");
			else
				printf("*");
		}
		printf("\n");
	}
	return 0;
}