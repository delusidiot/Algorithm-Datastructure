#include <stdio.h>

int main(void)
{
	int V;
	int A;
	int B;

	scanf("%d %d %d", &A, &B, &V);
	V = V - A;
	if (V <= 0)
		printf("1\n");
	else
		printf("%d\n", 1 + ((V % (A - B) == 0) ? (V / (A - B)) : (V / (A - B)) + 1));
	return 0;
}