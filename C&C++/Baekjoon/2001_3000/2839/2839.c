#include <stdio.h>

int main(void)
{
	int N;
	int three = 0;
	int five = 0;

	scanf("%d", &N);
	five = N / 5;
	while (five >= 0)
	{
		if ((N - (5 * five)) % 3 == 0)
		{
			three = (N - (5 * five)) / 3;
			break;
		}
		five--;
	}
	if (five < 0)
		printf("-1\n");
	else
		printf("%d\n", three + five);
	return 0;
}