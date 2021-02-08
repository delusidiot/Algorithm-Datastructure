#include <stdio.h>

int main(void)
{
	int arr[10001] = { 0 };
	int N;
	int num;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &num);
		arr[num]++;
	}
	for (int i = 0; i < 10001; i++)
	{
		while (arr[i])
		{
			arr[i]--;
			printf("%d\n", i);
		}
	}
	return 0;
}