#include <stdio.h>
#include <stdlib.h>

void swap(char** w1, char** w2)
{
	char* temp = *w1;
	*w1 = *w2;
	*w2 = temp;
}

int strlen(const char* str)
{
	int i = 0;

	while (str[i])
		i++;
	return i;
}

int strcmp(const char* str1, const char* str2)
{
	if (strlen(str1) > strlen(str2))
		return 1;
	if (strlen(str1) < strlen(str2))
		return -1;
	while (*str1 && *str2)
	{
		if(*str1 - *str2)
			return *str1 - *str2;
		str1++;
		str2++;
	}
	return *str1 - *str2;
}

void merge(char** words, int left, int mid, int right)
{
	int i, j, k;
	int n1 = mid - left + 1;
	int n2 = right - mid;
	int* L, * R;

	L = malloc(sizeof(char *) * n1);
	R = malloc(sizeof(char *) * n2);
	for (i = 0; i < n1; i++)
		L[i] = words[left + i];
	for (j = 0; j < n2; j++)
		R[j] = words[mid + 1 + j];

	i = 0;
	j = 0;
	k = left;
	while (i < n1 && j < n2) {
		if (strcmp(L[i], R[j]) < 0) {
			words[k] = L[i];
			i++;
		}
		else {
			words[k] = R[j];
			j++;
		}
		k++;
	}
	while (i < n1) {
		words[k] = L[i];
		i++;
		k++;
	}
	while (j < n2) {
		words[k] = R[j];
		j++;
		k++;
	}
	free(L);
	free(R);
}

void merge_sort(char** words, int left, int right)
{
	if (left < right)
	{
		int mid = (left + right) / 2;
		merge_sort(words, left, mid);
		merge_sort(words, mid + 1, right);
		merge(words, left, mid, right);
	}
}

int main(void)
{
	int N;
	char** words;

	scanf("%d", &N);
	words = malloc(sizeof(char *) * N);
	for (int i = 0; i < N; i++)
	{
		words[i] = malloc(sizeof(char) * 51);
		scanf("%s", words[i]);
	}
	merge_sort(words, 0, N - 1);
	char* prev = "";
	for (int i = 0; i < N; i++)
	{
		if (strcmp(prev, words[i]))
			printf("%s\n", words[i]);
		prev = words[i];
	}
	return 0;
}