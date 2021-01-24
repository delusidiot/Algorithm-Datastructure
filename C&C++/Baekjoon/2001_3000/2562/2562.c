#include <stdio.h>

int main(void)
{
	int max = 0;
	int max_index = 0;
	int num = 0;

	for (int i = 1; i <= 9; i++)
	{
		scanf("%d", &num);
		if (max < num)
		{
			max = num;
			max_index = i;
		}
	}
	printf("%d\n%d\n", max, max_index);
	return 0;
}