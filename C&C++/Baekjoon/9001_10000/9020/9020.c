#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	int T;
	bool eratos[10001] = { false };
	
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

	scanf("%d", &T);
	for (int test_case = 1; test_case <= T; test_case++)
	{
		int n;
		scanf("%d", &n);
		int num1 = 2;
		int num2 = 3;
		int idx = 2;
		while (num1 < num2)
		{
			while (eratos[idx] || eratos[n - idx])
				idx++;
			num1 = idx;
			num2 = n - num1;
			idx++;
		}
		printf("%d %d\n", num2, num1);
	}
	return 0;
}