#include <stdio.h>
#include <stdlib.h>

typedef struct account_s {
	int age;
	char* name;
} account_t;

void merge(account_t* accounts, int left, int mid, int right)
{
	int i, j, k;
	int n1 = mid - left + 1;
	int n2 = right - mid;
	account_t* L, * R;

	L = malloc(sizeof(account_t) * n1);
	R = malloc(sizeof(account_t) * n2);
	for (i = 0; i < n1; i++)
	{
		L[i] = accounts[left + i];
	}
	for (j = 0; j < n2; j++)
	{
		R[j] = accounts[mid + 1 + j];
	}

	i = 0;
	j = 0;
	k = left;
	while (i < n1 && j < n2) {
		if (L[i].age <= R[j].age) {
			accounts[k] = L[i];
			i++;
		}
		else {
			accounts[k] = R[j];
			j++;
		}
		k++;
	}
	while (i < n1) {
		accounts[k] = L[i];
		i++;
		k++;
	}
	while (j < n2) {
		accounts[k] = R[j];
		j++;
		k++;
	}
	free(L);
	free(R);
}

void merge_sort(account_t* accounts, int left, int right)
{
	if (left < right)
	{
		int mid = (left + right) / 2;
		merge_sort(accounts, left, mid);
		merge_sort(accounts, mid + 1, right);
		merge(accounts, left, mid, right);
	}
}

int main(void)
{
	int N;
	account_t* accounts;

	scanf("%d", &N);
	accounts = malloc(sizeof(account_t) * N);
	for (int i = 0; i < N; i++)
	{
		accounts[i].name = malloc(sizeof(char) * 101);
		scanf("%d %s", &accounts[i].age, accounts[i].name);
	}
	merge_sort(accounts, 0, N - 1);
	for (int i = 0; i < N; i++)
	{
		printf("%d %s\n", accounts[i].age, accounts[i].name);
	}
	return 0;
}