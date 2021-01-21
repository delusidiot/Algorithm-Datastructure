#include <stdio.h>

int main(void)
{
	int grade;

	scanf("%d", &grade);
	if (90 <= grade && 100 >= grade)
		printf("A\n");
	else if (80 <= grade && 89 >= grade)
		printf("B\n");
	else if (70 <= grade && 79 >= grade)
		printf("C\n");
	else if (60 <= grade && 69 >= grade)
		printf("D\n");
	else
		printf("F\n");
	return 0;
}