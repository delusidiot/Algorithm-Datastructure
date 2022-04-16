
public class AddTwoNumbers {

	public static void main(String[] args) {
		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode result = solution.addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val);
			result = result.next;
		}
		System.out.println();

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int next = 0;
		ListNode root = new ListNode();
		ListNode curr = root;
		while (l1 != null || l2 != null) {
			int current = 0;
			if (l1 != null) {
				current += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				current += l2.val;
				l2 = l2.next;
			}
			curr.next = new ListNode((current + next) % 10);
			next = (current + next) / 10;
			curr = curr.next;
		}
		return root.next;
    }
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
