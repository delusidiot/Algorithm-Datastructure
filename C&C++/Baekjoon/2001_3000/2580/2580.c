#include <stdio.h>
#include <stdlib.h>

typedef struct single_s {
	int x;
	int y;
	struct single_s* next;
}single_t;

int confirm(int sudoku[][9], int x, int y)
{
	int num[10] = { 0 };
	int X = x;
	int Y = y;
	int result = 0;
	int count = 0;
	int ans = 0;
	for (int i = 0; i < 9; i++)
	{
		if (sudoku[x][i])
			num[sudoku[x][i]]++;
	}
	for (int i = 0; i < 9; i++)
	{
		if (sudoku[i][y])
			num[sudoku[i][y]]++;
	}
	x /= 3;
	y /= 3;
	x *= 3;
	y *= 3;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (sudoku[x + i][y + j])
				num[sudoku[x + i][y + j]]++;
		}
	}
	for (int i = 1; i < 10; i++)
	{
		if (!num[i])
		{
			count++;
			ans = i;
		}
	}
	if (count == 1)
		sudoku[X][Y] = ans;
	return result;
}

int is_blank(int sudoku[][9])
{
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			if (!sudoku[i][j])
				return 1;
		}
	}
	return 0;
}

void fuzzle(int sudoku[][9], single_t *start)
{
	int idx = 0;
	single_t* next;
	while (is_blank(sudoku)) {
		next = start;
		while (next != NULL)
		{
			confirm(sudoku, next->x, next->y);
			next = next->next;
		}
	}
	return ;
}

int main()
{
	single_t* start = malloc(sizeof(single_t));
	single_t* next = start;
	int sudoku[9][9] = { 0 };
	int count = 0;
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			scanf("%d", &sudoku[i][j]);
			if (!sudoku[i][j])
			{
				
				next->x = i;
				next->y = j;
				next->next = malloc(sizeof(single_t));
				next = next->next;
				count++;
			}
		}
	}
	free(next);
	next = NULL;
	fuzzle(&sudoku, start);
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			printf("%d ", sudoku[i][j]);
		}
		printf("\n");
	}
	return 0;
}