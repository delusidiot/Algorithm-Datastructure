#include <stdio.h>

int main(void)
{
	int A;
	int B;
	int result; 

	scanf("%d", &A);
	scanf("%d", &B);
	result = A * B;
	while (B > 0) {
		printf("%d\n", A * (B % 10));
		B /= 10;
	}
	printf("%d\n", result);
	return 0;
}