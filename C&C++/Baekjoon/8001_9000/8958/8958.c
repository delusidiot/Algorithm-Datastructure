#include <stdio.h>

int main(void)
{
	int T;
	char success[100];
	int len;
	int index = 0;
	int result = 0;
	int score = 0;
	scanf("%d", &T);

	for (int i = 0; i < T; i++)
	{
		result = 0;
		score = 0;
		index = 0;
		scanf("%s", &success);
		while (success[index])
		{
			if (success[index] == 'O')
			{
				score++;
				result += score;
			}
			else
			{
				score = 0;
			}
			index++;
		}
		printf("%d\n", result);
	}
	return 0;
}