#include <stdio.h>

int strlen(char* str)
{
	int len = 0;

	while (str[len])
		len++;
	return len;
}

void add_bigint(char *A, char *B, int Alen, int Blen, int c)
{
	int digit = 0;
	if (Alen >= 0 && Blen >= 0)
	{
		digit = A[Alen] - '0' + B[Blen] - '0' + c;
		add_bigint(A, B, Alen - 1, Blen - 1, digit / 10);
		printf("%d", digit % 10);
	}
	else if (Alen >= 0)
	{
		digit = A[Alen] - '0' + c;
		add_bigint(A, B, Alen - 1, Blen - 1, digit / 10);
		printf("%d", digit % 10);
	}
	else if (Blen >= 0)
	{
		digit = B[Blen] - '0' + c;
		add_bigint(A, B, Alen - 1, Blen - 1, digit / 10);
		printf("%d", digit % 10);
	}
	else
		if (c > 0)
			printf("%d", c);
}

int main(void)
{
	char A[10001];
	char B[10001];
	scanf("%s %s", &A, &B);

	int Alen = strlen(A) - 1;
	int Blen = strlen(B) - 1;
	add_bigint(&A, &B, Alen, Blen, 0);
	printf("\n");
	return 0;
}