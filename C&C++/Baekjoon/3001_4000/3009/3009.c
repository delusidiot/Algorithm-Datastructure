#include <stdio.h>

int main(void)
{
	int x = 0;
	int y = 0;
	int lastX = 0, lastY = 0;
	scanf("%d %d", &x, &y);
	lastX ^= x;
	lastY ^= y;
	scanf("%d %d", &x, &y);
	lastX ^= x;
	lastY ^= y;
	scanf("%d %d", &x, &y);
	lastX ^= x;
	lastY ^= y;
	printf("%d %d", lastX, lastY);
	return 0;
}