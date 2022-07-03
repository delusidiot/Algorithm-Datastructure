# DataStructure with C

## Lists

### ArrayList

| function | arguments | description |
|:--------:|:---------:|:-----------:|
| createArrayList() | int maxElementCount | n���� ���Ҹ� ������ ����Ʈ�� ���� |
| deleteArrayList() | ArrayList *pList | ����Ʈ�� ���� |
| isArrayListFull() | ArrayList *pList | ����Ʈ�� ���� ������ �ִ� ���� ������ ������ ��ȯ |
| addArrayListElement() | ArrayList *pList, int position, ArrayListNode element| ���Ҹ� ����Ʈ�� Ư�� ��ġ�� �߰� |
| removeArrayListElement() | ArrayList* pList, int position | ����Ʈ�� ��ġ p�� �ִ� ���Ҹ� ���� |
| getArrayListElement() | ArrayList* pList, int position | ����Ʈ�� ��ġ p�� �ִ� ���Ҹ� ��ȯ |
| displayArrayList() | ArrayList* pList | ����Ʈ�� ���Ҹ� ��� ��� |
| getArrayListLength() | ArrayList* pList | ����Ʈ�� ���� ��� |

�����ؾ��ϴ� �κ�

- createArrayList���� maxElementCount�� ���� �ʰ� ����.
- addArrayListElement���� ����Ʈ�� ���� ������ �ִ��̸� ���ο� �� ��迭�� �����Ͽ� ����
	- addArrayListElement�� �����Ǹ� removeArrayListElement���� ��������� ���Ұ� �����Ǹ� �� ª�� �迭�� �Ҵ��Ͽ� ����
- ����Ʈ�� clear�Ҽ� �ִ� creaList()�Լ� ����
- ArrayListNode�� ��Ҹ� int�� �� �ٸ� �ڷ������� ����� �� �ֵ��� ����

### LinkedList

## Stack & Queue

## Tree

## Graph

## Search

### Hash

### AVL

### B-Tree