#include <stdio.h>

int main(void)
{
	int N;
	char number[101];
	int total = 0;;

	scanf("%d", &N);
	scanf("%s", &number);
	for (int i = 0; i < N; i++)
	{
		total += (number[i] - '0');
	}
	printf("%d\n", total);
	return 0;
}