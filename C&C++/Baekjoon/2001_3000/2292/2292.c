#include <stdio.h>

int main(void)
{
	int N;
	int count = 1;
	int sum = 1;

	scanf("%d", &N);
	while (sum < N)
	{
		count++;
		sum += (6 * (count - 1));
	}
	printf("%d\n", count);
	return 0;
}