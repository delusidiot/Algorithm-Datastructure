#include "arraylist.h"
#include <stdio.h>

int main(int argc, char *argv[]) {
    int i = 0;
    int arrayCount = 0;

    ArrayList* pList = NULL;
    ArrayListNode* pValue = NULL;

    pList = createArrayList(6);
    if (pList != NULL) {
        ArrayListNode node;
        node.data = 1;
        addArrayListElement(pList, 0, node);

        node.data = 2;
        addArrayListElement(pList, 0, node);

        node.data = 5;
        addArrayListElement(pList, 0, node);
        displayArrayList(pList);
    }
    return 0;
}
