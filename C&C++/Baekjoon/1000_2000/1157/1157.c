#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	int alpha[26] = { 0, };
	char word[1000001];
	int max = 0;
	int maxIdx = 0;;
	bool is_miss = false;

	scanf("%s", &word);
	int i = 0;
	while (word[i])
	{
		if (word[i] >= 'A' && word[i] <= 'Z')
			alpha[word[i] - 'A']++;
		else
			alpha[word[i] - 'a']++;
		i++;
	}
	for (i = 0; i < 26; i++)
	{
		if (max <= alpha[i])
		{
			if (max == alpha[i])
				is_miss = true;
			else
				is_miss = false;
			max = alpha[i];
			maxIdx = i;
		}
	}
	if (is_miss)
		printf("?\n");
	else
		printf("%c\n", 'A' + maxIdx);
	return 0;
}