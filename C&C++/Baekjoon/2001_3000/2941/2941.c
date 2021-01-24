#include <stdio.h>

int main(void)
{
	char croatia_alpha[101];
	int count = 0;

	scanf("%s", &croatia_alpha);
	int i = 0;
	while (croatia_alpha[i])
	{
		switch (croatia_alpha[i])
		{
		case 'c':
			if (croatia_alpha[i + 1] == '=' || croatia_alpha[i + 1] == '-')
				i++;
			i++;
			break;
		case 'd':
			if (croatia_alpha[i + 1] == '-')
				i++;
			else if (croatia_alpha[i + 1] == 'z')
				if (croatia_alpha[i + 2] == '=')
					i += 2;
			i++;
			break;
		case 'l':
			if (croatia_alpha[i + 1] == 'j')
				i++;
			i++;
			break;
		case 'n':
			if (croatia_alpha[i + 1] == 'j')
				i++;
			i++;
			break;
		case 's':
			if (croatia_alpha[i + 1] == '=')
				i++;
			i++;
			break;
		case 'z':
			if (croatia_alpha[i + 1] == '=')
				i++;
			i++;
			break;
		default:
			i++;
			break;
		}
		count++;
	}
	printf("%d\n", count);
	return 0;
}