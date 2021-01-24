#include "arrayList.h"

ArrayList* createArrayList()
{
	ArrayList* list;

	if (!(list = malloc(sizeof (ArrayList))))
		return NULL;
	if (!(list->pElement = malloc(sizeof(ArrayListNode))))
	{
		free(list);
		return (NULL);
	}
	return list;
}

void deleteArrayList(ArrayList* pList)
{

}

int isArrayListFull(ArrayList* pList)
{
	return 0;
}
int addArrayListElement(ArrayList* pList, int position, ArrayListNode element)
{
	return 0;
}
int removeArrayListElement(ArrayList* pList, int position)
{
	return 0;
}
ArrayListNode* getArrayListElement(ArrayList* pList, int position)
{
	return NULL;
}
void displayArrayList(ArrayList* pList)
{

}
void clearArrayList(ArrayList* pList)
{

}
int getArrayListLength(ArrayList* pList)
{
	return 0;
}
int addArrayListFirst(ArrayList* pList, ArrayListNode element)
{
	return 0;
}
int addArrayListLast(ArrayList* pList, ArrayListNode element)
{
	return 0;
}