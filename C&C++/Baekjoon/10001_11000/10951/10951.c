#include <stdio.h>

int main(void)
{
	int A = 1;
	int B = 1;

	while (scanf("%d %d", &A, &B) != EOF) // ctrl + z
	{
		printf("%d\n", A + B);
	}
	return 0;
}