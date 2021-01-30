#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	bool eratos[10001] = { false };
	int check = -1;
	int sum = 0;
	eratos[0] = true;
	eratos[1] = true;
	for (int i = 2; i < 10001; i++)
	{
		if (!eratos[i])
		{
			for (int j = i + i; j < 10001; j += i)
			{
				eratos[j] = true;
			}
		}
	}

	int M, N;
	scanf("%d", &M);
	scanf("%d", &N);
	for (int i = M; i <= N; i++)
	{
		if (check < 0 && !eratos[i])
			check = i;
		if (!eratos[i])
			sum += i;
	}
	if (check > 0)
		printf("%d\n", sum);
	printf("%d\n", check);
	return 0;
}