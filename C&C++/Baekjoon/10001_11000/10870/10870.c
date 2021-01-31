#include <stdio.h>

int main(void)
{
	int first = 0;
	int second = 1;
	int result = 0;
	int n;
	scanf("%d", &n);
	if (n == 0)
		printf("0\n");
	else if (n == 1)
		printf("1\n");
	else {
		for (int i = 0; i < n - 1; i++)
		{
			result = first + second;
			first = second;
			second = result;
		}
		printf("%d", result);
	}
	return 0;
}