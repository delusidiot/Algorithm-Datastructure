#include <stdio.h>

void hanoiMove(int n, int from, int by, int to)
{
	if (n == 1) {
		printf("%d %d\n", from, to);
	}
	else {
		hanoiMove(n - 1, from, to, by);
		printf("%d %d\n", from, to);
		hanoiMove(n - 1, by, from, to);
	}
}

int hanoiNum(int n)
{
	int num = 1;
	while (--n) {
		num = num * 2 + 1;
	}
	return num;
}

int main(void)
{
	int n;
	scanf("%d", &n);

	printf("%d\n", hanoiNum(n));
	hanoiMove(n, 1, 2, 3);

	return 0;
}