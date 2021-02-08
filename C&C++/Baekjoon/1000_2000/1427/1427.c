#include <stdio.h>

int main(void)
{
	int counting[10] = { 0 };
	char num[11] = { 0 };
	scanf("%s", &num);
	int i = 0;
	while (num[i])
	{
		counting[num[i] - '0']++;
		i++;
	}
	for (int i = 9; i >= 0; i--)
	{
		while (counting[i] > 0)
		{
			printf("%d", i);
			counting[i]--;
		}
	}
	printf("\n");
	return 0;
}