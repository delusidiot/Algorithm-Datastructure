#include <stdio.h>
#include <stdbool.h>

int main(void)
{
	int Heru, Ausar, Auset;

	while (true)
	{
		scanf("%d %d %d", &Heru, &Ausar, &Auset);
		if (Heru == 0 && Ausar == 0 && Auset == 0)
			break;
		if (Heru < Ausar)
		{
			Heru ^= Ausar;
			Ausar ^= Heru;
			Heru ^= Ausar;
		}
		if (Heru < Auset)
		{
			Heru ^= Auset;
			Auset ^= Heru;
			Heru ^= Auset;
		}
		if ((Heru * Heru) == ((Ausar * Ausar) + (Auset * Auset)))
			printf("right\n");
		else
			printf("wrong\n");
	}
	return 0;
}