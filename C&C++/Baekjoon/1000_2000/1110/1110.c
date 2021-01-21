#include <stdio.h>

int main(void)
{
	int N;
	int next = -1;
	int count = 1;

	scanf("%d", &N);
	if (N < 0 || N > 99)
		return 0;
	next = N;
	next = ((next % 10) * 10) + (((next % 10) + (next / 10)) % 10);
	while (N != next)
	{
		next = ((next % 10) * 10) + (((next % 10) + (next / 10)) % 10);
		count++;
	}
	printf("%d\n", count);
	return 0;
}