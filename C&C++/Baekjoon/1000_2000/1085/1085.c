#include <stdio.h>
#include <math.h>

int main(void)
{
	int x, y, w, h;
	int distX;
	int distY;

	scanf("%d %d %d %d", &x, &y, &w, &h);
	
	distX = (x < abs(x - w)) ? x : abs(x - w);
	distY = (y < abs(y - h)) ? y : abs(y - h);
	printf("%d\n", (distX < distY) ? distX : distY);
	return 0;
}