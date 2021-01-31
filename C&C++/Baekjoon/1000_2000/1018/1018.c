#include <stdio.h>
void make_chessboard(char chessboard[][51], int x, int y, int *min)
{
	char first_box = chessboard[x][y];
	int count = 0;
	for (int i = x; i < x + 8; i++)
	{
		for (int j = y; j < y + 8; j++)
		{
			if ((i - x) % 2 ==  (j - y) % 2)
			{
				if (chessboard[i][j] != first_box)
					count++;
			}
			else
			{
				if (chessboard[i][j] == first_box)
					count++;
			}
		}
	}
	if (*min > count || *min > 64 - count)
		*min = (count < 64 - count)? count : 64-count;
}

int main(void)
{
	int N;
	int M;
	int min = 2100000000;
	char chessboard[51][51] = { '\0' };

	scanf("%d %d", &N, &M);
	getchar();
	for (int i = 0; i < N; i++)
	{
		scanf("%s", &chessboard[i]);
	}
	for (int i = 0; i < N - 7; i++)
	{
		for (int j = 0; j < M - 7; j++)
		{
			make_chessboard(&chessboard, i, j, &min);
		}
	}
	printf("%d\n", min);
	return 0;
}