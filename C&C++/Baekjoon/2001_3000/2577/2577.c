#include <stdio.h>

int main(void)
{
	int digit[10] = { 0 };
	int number = 0;
	int result = 1;

	scanf("%d", &number);
	result *= number;
	scanf("%d", &number);
	result *= number;
	scanf("%d", &number);
	result *= number;
	while (result > 0)
	{
		digit[result % 10]++;
		result /= 10;
	}
	for (int i = 0; i < 10; i++)
	{
		printf("%d\n", digit[i]);
	}
	return 0;
}