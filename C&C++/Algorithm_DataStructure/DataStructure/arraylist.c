#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "arraylist.h"

ArrayList* createArrayList(int maxElementCount) {
	ArrayList* pReturn = NULL;
	int i = 0;

	if (maxElementCount > 0) {
		pReturn = (ArrayList*)malloc(sizeof(ArrayList));
		if (pReturn != NULL) {
			pReturn->maxElementCount = maxElementCount;
			pReturn->currentElementCount = 0;
			pReturn->pElement = NULL;
		}
		else {
			fprintf_s(stderr, "%s %s\n", MEMORY_ALLOCATION_ERROR, "createArrayList()");
			return NULL;
		}
	}
	else {
		fprintf_s(stderr, "%s %s\n", MEMORY_SIZE_ERROR, "createArrayList()");
		return NULL;
	}
	pReturn->pElement = (ArrayListNode*)malloc(sizeof(ArrayListNode) * maxElementCount);

	if (pReturn->pElement == NULL) {
		fprintf_s(stderr, "%s %s %s\n", MEMORY_ALLOCATION_ERROR, "second", "createArrayList()");
		free(pReturn);
		return NULL;
	}
	memset(pReturn->pElement, 0, sizeof(ArrayListNode) * maxElementCount);
	return pReturn;
}
void deleteArrayList(ArrayList* pList) {
	int i = 0;

	if (pList != NULL) {
		free(pList->pElement);
		free(pList);
	}
}
bool isArrayListFull(ArrayList* pList) {
	bool ret = false;

	if (pList != NULL) {
		if (pList->currentElementCount == pList->maxElementCount) {
			ret = true;
		}
	}
	return ret;
}
bool addArrayListElement(ArrayList* pList, int position, ArrayListNode element) {
	bool ret = false;
	int i = 0;

	if (pList != NULL) {
		if (isArrayListFull(pList) != true) {
			if (position >= 0 && position <= pList->currentElementCount) {
				for (i = pList->currentElementCount - 1; i >= position; i--) {
					pList->pElement[i + 1] = pList->pElement[i];
				}
				pList->pElement[position] = element;
				pList->currentElementCount++;
				ret = true;
			}
			else {
				fprintf_s(stderr, "%s %s\n", ARRAYLIST_INDEX_OVER, "addArrayListElement()");
			}
		}
		else {
			fprintf_s(stderr, "%s %s\n", ARRAYLIST_INDEX_OVER, "addArrayListElement()");
		}
	}
	return ret;
}

bool removeArrayListElement(ArrayList* pList, int position) {
	bool ret = false;
	int i = 0;

	if (pList != NULL) {
		if (position >= 0 && position < pList->currentElementCount) {
			for (i = position; i < pList->currentElementCount - 1; i++) {
				pList->pElement[i] = pList->pElement[i + 1];
			}
			pList->currentElementCount--;
			ret = true;
		}
		else {
			fprintf_s(stderr, "%s %s\n", ARRAYLIST_INDEX_OVER, "removeArrayListElement()");
		}
	}
	return ret;
}
ArrayListNode* getArrayListElement(ArrayList* pList, int position) {
	ArrayListNode* pReturn = NULL;

	if (pList != NULL) {
		if (position >= 0 && position < getArrayListLength(pList)) {
			pReturn = &(pList->pElement[position]);
		}
		else {
			fprintf_s(stderr, "%s %s\n", ARRAYLIST_INDEX_OVER, "getArrayListElement()");
		}
	}
	return pReturn;
}
void displayArrayList(ArrayList* pList) {
	int i = 0;
	if (pList != NULL) {
		printf("maximum element number : %d\n", pList->maxElementCount);
		printf("current element number : %d\n", pList->currentElementCount);
		for (i = 0; i < pList->currentElementCount; i++) {
			printf("[%d], %d\n", i, getArrayListElement(pList, i)->data);
		}
	}
	else {
		printf("ArrayList is NULL\n");
	}
}
int getArrayListLength(ArrayList* pList) {
	int ret = 0;

	if (pList != NULL) {
		ret = pList->currentElementCount;
	}
	return ret;
}

int addArrayListElementFirst(ArrayList* pList, ArrayListNode element) {
	int position = 0;
	return addArrayListElement(pList, position, element);
}

int addArrayListElementLast(ArrayList* pList, ArrayListNode element) {
	int ret = false;

	int position = 0;
	if (pList != NULL) {
		position = getArrayListLength(pList);
		ret = addArrayListElement(pList, position, element);
	}
	return ret;
}