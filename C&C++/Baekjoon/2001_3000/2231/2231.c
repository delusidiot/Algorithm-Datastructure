#include <stdio.h>

int main(void)
{
	int N;
	int result = 0;
	int diss_sum = 0;
	int curr;
	scanf("%d", &N);
	for (int i = 1; i < N; i++)
	{
		curr = i;
		diss_sum = i;
		while (curr > 0)
		{
			diss_sum += curr % 10;
			curr /= 10;
		}
		if (diss_sum == N)
			result = i;
		if (result)
			break;
	}
	printf("%d\n", result);
	return 0;
}