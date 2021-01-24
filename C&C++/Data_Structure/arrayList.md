# ArrayList

### listNode
```c
typedef struct ArrayListNodeType
{
	int data;
}	ArrayListNode;

typedef struct ArrayListType
{
	int maxElementCount;
	int currentElementCount;
	ArrayListNode *pElement;
}	ArrayList;
```

### createArrayList
| type | content |
| -------- | -------- |
| **Prototype** | ArrayList\* createList() | 
| **Parameters** | None |
| **Return value** | new ArrayList pointer |

### addArrayListElement
| type | content |
| -------- | -------- |
| **Prototype** | list_t createList() | 
| **Parameters** | 1. max element |
| **Return value** | None |

### deleteArrayList
| type | content |
| -------- | -------- |
| **Prototype** | list_t createList() | 
| **Parameters** | 1. max element |
| **Return value** | None |

### removeArrayListElement
### isArrayListFull
### clearArrayList
### getArrayListLength
### getArrayListElement