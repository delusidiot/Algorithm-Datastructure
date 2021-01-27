#include <stdio.h>
#include <math.h>

int main(void)
{
	int T;
	long long x;
	long long y;
	long long dist;
	int count;
	scanf("%d", &T);
	for (int test_case = 1; test_case <= T; test_case++)
	{
		count = 0;
		scanf("%lld", &x);
		scanf("%lld", &y);
		dist = y - x;
		if (dist == 0)
			printf("0\n");
		else
		{
			count = (int)sqrt(dist);
			dist -= (count * count);
			long long rest = ((dist % count != 0) ? (dist / count) + 1 : (dist / count));
			printf("%lld\n", (2 * count - 1) + (rest));
		}
	}
	return 0;
}