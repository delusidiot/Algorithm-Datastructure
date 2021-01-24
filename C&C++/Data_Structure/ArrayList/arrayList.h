#ifndef __ARRAYLIST__
#define __ARRAYLIST__

typedef struct ArrayListNodeType
{
	int data;
}	ArrayListNode;

typedef struct ArrayListType
{
	int maxElementCount;
	int currentElementCount;
	ArrayListNode* pElement;
}	ArrayList;

#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>

ArrayList* createArrayList();
void deleteArrayList(ArrayList* pList);
int isArrayListFull(ArrayList* pList);
int addArrayListElement(ArrayList* pList, int position, ArrayListNode element);
int removeArrayListElement(ArrayList* pList, int position);
ArrayListNode* getArrayListElement(ArrayList* pList, int position);
void displayArrayList(ArrayList* pList);
void clearArrayList(ArrayList* pList);
int getArrayListLength(ArrayList* pList);
int addArrayListFirst(ArrayList* pList, ArrayListNode element);
int addArrayListLast(ArrayList* pList, ArrayListNode element);

#endif