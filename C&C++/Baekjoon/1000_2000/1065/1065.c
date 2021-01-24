#include <stdio.h>

int isArithmetic(int number)
{
	int prev;
	int diff;
	if (number < 100)
		return 1;
	prev = number % 10;
	number /= 10;
	diff = prev - (number % 10);
	while (number > 0)
	{
		if (diff != (prev - (number % 10)))
			return 0;
		prev = number % 10;
		number /= 10;
	}
	return 1;
}

int main(void)
{
	int N;
	int count = 0;

	scanf("%d", &N);
	for (int i = 1; i <= N; i++)
	{
		count += isArithmetic(i);
	}
	printf("%d\n", count);
	return 0;
}