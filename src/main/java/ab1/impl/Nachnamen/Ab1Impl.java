package ab1.impl.Nachnamen;

import ab1.Ab1;

public class Ab1Impl implements Ab1 {

	@Override
	public boolean isHeap(int i, int j, int[] data) {
		// YOUR CODE HERE
		return false;
	}

	@Override
	public void toHeap(int[] data) {
		// YOUR CODE HERE
	}

	@Override
	public void heapsort(int[] data) {
		// YOUR CODE HERE
	}

	@Override
	public ListNode insert(ListNode head, int value) {
		if (head == null) {
			ListNode n = new ListNode();
			n.next = null;
			n.value = value;

			return n;
		} else {
			ListNode prevNode = null;
			ListNode actualNode = head;
			ListNode nextNode = head.next;

			while (actualNode.value > value && actualNode.next != null) {
				prevNode = actualNode;
				actualNode = nextNode;
				nextNode = nextNode.next;
			}

			ListNode n = new ListNode();
			n.next = actualNode;
			n.value = value;
			if (actualNode.next == null) {
				n.next = null;
				actualNode.next = n;
			}
			if (prevNode != null) {
				prevNode.next = n;
			}
			return n;
		}
	}

	@Override
	public ListNode search(ListNode head, int value) {
		ListNode result = head;
		// YOUR CODE HERE
		while (result.value != value && result.next != null) {
			result = result.next;

		}
		if (result.value == value) {
			return result;
		} else {
			return null;
		}

		//return null;
	}

	@Override
	public ListNode minimum(ListNode head) {
		// YOUR CODE HERE
		return null;
	}

	@Override
	public void mergesort(int[] data) {

	}
}
