#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	int N;
	int num;
	int count = 0;

	bool erathosthenes[1001] = { false };
	erathosthenes[0] = true;
	erathosthenes[1] = true;
	for (int i = 2; i < 1001; i++)
	{
		if (!erathosthenes[i])
		{
			for (int j = i + i; j < 1001; j += i)
			{
				erathosthenes[j] = true;
			}
		}
	}
	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &num);
		if (num > 0 && !erathosthenes[num])
			count++;
	}
	printf("%d\n", count);
	return 0;
}