#include <stdio.h>

int main(void)
{
	int X;
	int count = 0;
	scanf("%d", &X);

	while (X > 0)
	{
		count++;
		X -= count;
	}
	if (count % 2 == 0)
	{
		printf("%d/%d", count + X, 1 + (-X));
	}
	else
	{
		printf("%d/%d", 1 + (-X), count + X);
	}
	return 0;
}