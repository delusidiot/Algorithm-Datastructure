#include <stdio.h>

int main(void)
{
	int T;
	int num;
	int max = -1000001;
	int min = 1000001;
	
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		scanf("%d", &num);
		if (num > max)
			max = num;
		if (num < min)
			min = num;
	}
	if (T != 0)
		printf("%d %d\n", min, max);
	return 0;
}