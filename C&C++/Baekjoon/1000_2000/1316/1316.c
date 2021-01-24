#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void)
{
	int N;
	char word[100];
	int alpha[26];
	bool check;
	int count = 0;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		check = true;
		int j = 0;
		for (j = 0; j < 26; j++)
		{
			alpha[j] = 0;
		}
		scanf("%s", &word);
		j = 0;
		while (word[j]) 
		{
			char w = word[j];
			if (alpha[w - 'a'] > 0)
				check = false;
			alpha[w - 'a']++;
			while (word[j] == w)
				j++;
		}
		if (check)
			count++;
	}
	printf("%d\n", count);
	return 0;
}