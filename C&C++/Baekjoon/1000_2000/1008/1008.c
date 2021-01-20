#include <stdio.h>

int main_1(void)
{
	double A;
	double B;

	scanf("%lf %lf", &A, &B);
	printf("%.9lf\n", A / B);
	return 0;
}