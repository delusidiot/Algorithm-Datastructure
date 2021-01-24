#include <stdio.h>

int digit_swap(int num)
{
	int rst = 0;;
	while (num > 0)
	{
		rst *= 10;
		rst += num % 10;
		num /= 10;
	}
	return rst;
}

int main(void)
{
	int A;
	int B;

	scanf("%d %d", &A, &B);
	A = digit_swap(A);
	B = digit_swap(B);
	if (A > B)
		printf("%d\n", A);
	else
		printf("%d\n", B);
	return 0;
}