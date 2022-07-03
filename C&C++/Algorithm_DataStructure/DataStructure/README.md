# DataStructure with C

## Lists

### ArrayList

| function | arguments | description |
|:--------:|:---------:|:-----------:|
| createArrayList() | int maxElementCount | n개의 원소를 가지는 리스트를 생성 |
| deleteArrayList() | ArrayList *pList | 리스트를 제거 |
| isArrayListFull() | ArrayList *pList | 리스트의 원소 개수가 최대 원소 개수와 같은지 반환 |
| addArrayListElement() | ArrayList *pList, int position, ArrayListNode element| 원소를 리스트의 특정 위치에 추가 |
| removeArrayListElement() | ArrayList* pList, int position | 리스트의 위치 p에 있는 원소를 제거 |
| getArrayListElement() | ArrayList* pList, int position | 리스트의 위치 p에 있는 원소를 반환 |
| displayArrayList() | ArrayList* pList | 리스트의 원소를 모두 출력 |
| getArrayListLength() | ArrayList* pList | 리스트의 길이 출력 |

변경해야하는 부분

- createArrayList에서 maxElementCount를 받지 않고 생성.
- addArrayListElement에서 리스트의 원소 개수가 최대이면 새로운 더 긴배열을 생성하여 복사
	- addArrayListElement이 수정되면 removeArrayListElement에서 어느수준의 원소가 삭제되면 더 짧은 배열을 할당하여 복사
- 리스트를 clear할수 있는 creaList()함수 생성
- ArrayListNode의 요소를 int형 외 다른 자료형또한 사용할 수 있도록 변경

### LinkedList

## Stack & Queue

## Tree

## Graph

## Search

### Hash

### AVL

### B-Tree