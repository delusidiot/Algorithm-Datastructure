#include <stdio.h>

int main(void)
{
	char str[1000000] = { 0 };
	int count = 0;


	scanf("%[^\n]s", &str);
	int i = 0;
	while (1)
	{
		while (str[i] == ' ')
			i++;
		if (!str[i])
			break;
		count++;
		while (str[i] != ' ' && str[i] != '\0')
			i++;
	}
	printf("%d\n", count);
	return 0;
}