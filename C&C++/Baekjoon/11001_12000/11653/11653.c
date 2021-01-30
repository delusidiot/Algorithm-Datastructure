#include <stdio.h>

int main(void)
{
	int N;
	scanf("%d", &N);
	while (N > 1)
	{
		int idx = 2;
		while (N % idx != 0)
		{
			idx++;
		}
		printf("%d\n", idx);
		N /= idx;
	}
	return 0;
}