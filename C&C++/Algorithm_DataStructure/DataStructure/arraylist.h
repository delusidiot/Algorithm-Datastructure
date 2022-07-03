#pragma once

#include <stdbool.h>

typedef struct ArrayListNodeType {
	int data;
} ArrayListNode;

typedef struct ArrayListType {
	int maxElementCount;		// 최대 원소 개수
	int currentElementCount;	// 현재 원소의 개수
	ArrayListNode* pElement;	// 원소 저장을 위한 1차원 배열 포인터
} ArrayList;

ArrayList* createArrayList(int maxElementCount);
void deleteArrayList(ArrayList* pList);
bool isArrayListFull(ArrayList* pList);
bool addArrayListElement(ArrayList* pList, int position, ArrayListNode element);
bool removeArrayListElement(ArrayList* pList, int position);
ArrayListNode* getArrayListElement(ArrayList* pList, int position);
void displayArrayList(ArrayList* pList);
int getArrayListLength(ArrayList* pList);

#define MEMORY_ALLOCATION_ERROR "[Error] memory allocation"
#define MEMORY_SIZE_ERROR "[Error] maximum elements must be greater than 0"
#define ARRAYLIST_INDEX_OVER "[Error] position index over"