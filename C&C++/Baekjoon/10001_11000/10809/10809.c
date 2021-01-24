#include <stdio.h>

int main(void)
{
	int alpha[26];
	int i = 0;
	char word[101];

	scanf("%s", &word);
	for (i = 0; i < 26; i++)
	{
		alpha[i] = -1;
	}
	i = 0;
	while (word[i])
	{
		if (alpha[word[i] - 'a'] < 0)
			alpha[word[i] - 'a'] = i;
		i++;
	}
	for (i = 0; i < 26; i++)
	{
		printf("%d ", alpha[i]);
	}
	printf("\n");
	return 0;
}