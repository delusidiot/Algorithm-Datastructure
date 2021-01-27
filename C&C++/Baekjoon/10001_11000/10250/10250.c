#include <stdio.h>

int main(void)
{
	int T;
	scanf("%d", &T);
	for (int test_case = 1; test_case <= T; test_case++)
	{
		int H, W, N;
		scanf("%d %d %d", &H, &W, &N);
		printf("%d\n", (((N % H) == 0 ? N / H - 1 : N / H) + 1) + (((N % H) == 0 ? H : N % H) * 100));
	}
	return 0;
}