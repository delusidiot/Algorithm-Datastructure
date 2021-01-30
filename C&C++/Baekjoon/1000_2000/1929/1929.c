#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	int N;
	int M;
	bool eratos[1000001] = { false };

	eratos[1] = true;
	for (int i = 2; i < 1000001; i++) {
		if (!eratos[i])
			for (int j = i + i; j < 1000001; j += i)
			{
				eratos[j] = true;
			}
	}
	scanf("%d %d", &M, &N);
	for (int i = M; i <= N; i++)
	{
		if (!eratos[i])
			printf("%d\n", i);
	}
	return 0;
}