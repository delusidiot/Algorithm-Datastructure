#include <stdio.h>

int main(void)
{
	int T;
	int R;
	char prevP[21];

	scanf("%d", &T);
	for (int test_case = 0; test_case < T; test_case++)
	{
		scanf("%d", &R);
		scanf("%s", &prevP);
		int i = 0;
		while (prevP[i])
		{
			for (int j = 0; j < R; j++)
			{
				printf("%c", prevP[i]);
			}
			i++;
		}
		printf("\n");
	}
	return 0;
}