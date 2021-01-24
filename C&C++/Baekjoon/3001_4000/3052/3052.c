#include <stdio.h>

int main(void)
{
	int the_truth_of_life[42] = { 0 };
	int number;
	int count = 0;

	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &number);
		the_truth_of_life[number % 42]++;
	}
	
	for (int i = 0; i < 42; i++)
	{
		if (the_truth_of_life[i])
			count++;
	}
	printf("%d\n", count);
	return 0;
}