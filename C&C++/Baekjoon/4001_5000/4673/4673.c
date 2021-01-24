#include <stdio.h>

int total_digit(int number)
{
	int result = 0;

	while (number > 0)
	{
		result += number % 10;
		number /= 10;
	}
	return result;
}

int main(void)
{
	int self_num[10001] = { 0 };
	int number;

	for (int i = 1; i < 10001; i++)
	{
		number = i;
		while (1)
		{
			number = number + total_digit(number);
			if (number > 10000)
				break;
			self_num[number]++;
		}
	}
	for (int i = 1; i < 10000; i++)
	{
		if (!self_num[i])
			printf("%d\n", i);
	}
	return 0;
}