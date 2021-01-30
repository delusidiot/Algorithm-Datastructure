#include <stdio.h>
#include <math.h>

int main(void)
{
	int T;
	int x1, y1, r1, x2, y2, r2;

	scanf("%d", &T);
	for (int test_case = 1; test_case <= T; test_case++)
	{
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		int dist = abs(x1 - x2) * abs(x1 - x2) + abs(y1 - y2) * abs(y1 - y2);
		if (dist == 0 && r1 == r2)
			printf("-1\n");
		else if (dist == (r1 + r2) * (r1 + r2) || dist == abs(r1 - r2) * abs(r1 - r2))
			printf("1\n");
		else if (dist < (r1 + r2) * (r1 + r2) && dist > abs(r1 - r2) * abs(r1 - r2))
			printf("2\n");
		else
			printf("0\n");
	}
	return 0;
}