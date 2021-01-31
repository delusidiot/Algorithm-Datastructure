#include <stdio.h>

int main(void)
{
	int N;
	int count = 1;
	int devilnum = 666;
	scanf("%d", &N);
	while (N != count)
	{
		devilnum++;
		int is_continue = 0;
		int countinulty = 0;
		int copy_devil = devilnum;
		while(copy_devil > 1) {
			if (!is_continue)
				countinulty = 0;
			if (copy_devil % 10 == 6)
			{
				is_continue = 1;
				countinulty++;
			}
			else
				is_continue = 0;
			if (countinulty == 3)
			{
				count++;
				break;
			}
			copy_devil /= 10;
		}
	}
	printf("%d\n", devilnum);
	return 0;
}