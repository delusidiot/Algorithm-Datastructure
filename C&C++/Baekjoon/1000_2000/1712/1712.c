#include <stdio.h>

int main(void)
{
	int A;
	int B;
	int C;
	int sum;
	int sales = 0;
	int count = 0;

	scanf("%d %d %d", &A, &B, &C);
	sum = A;
	if (B >= C)
		printf("-1\n");
	else
		printf("%d\n", A / (C - B) + 1);
	return 0;
}