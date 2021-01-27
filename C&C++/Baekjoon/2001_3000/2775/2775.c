#include <stdio.h>

int get_persons(int a, int b)
{
	if (b == 1)
		return 1;
	if (a == 0)
		return b;
	return (get_persons(a - 1, b) + get_persons(a, b - 1));
}

int main(void)
{
	int T;

	scanf("%d", &T);
	for (int test_case = 1; test_case <= T; test_case++)
	{
		int k;
		int n;
		scanf("%d", &k);
		scanf("%d", &n);
		printf("%d\n", get_persons(k, n));
	}
	return 0;
}