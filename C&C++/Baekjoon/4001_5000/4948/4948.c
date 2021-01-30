#include <stdio.h>
#include <stdbool.h>
#define MAX_IDX 246913

int main(void)
{
	int n = -1;
	bool eratos[MAX_IDX] = { false };

	eratos[0] = true;
	eratos[1] = true;
	for (int i = 2; i < MAX_IDX; i++)
	{
		if (!eratos[i])
			for (int j = i + i; j < MAX_IDX; j += i)
			{
				eratos[j] = true;
			}
	}

	while (true)
	{
		int count = 0;
		scanf("%d", &n);
		if (!n)
			break;
		for (int i = n + 1; i <= 2 * n; i++)
		{
			if (!eratos[i])
				count++;
		}
		printf("%d\n", count);
	}
	return 0;
}