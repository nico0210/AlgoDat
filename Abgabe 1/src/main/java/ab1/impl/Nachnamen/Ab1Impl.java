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
// YOUR CODE HERE
		int length = data.length;
		int[] sorted = mergeSort(data, 0, length - 1);
		System.arraycopy(sorted, 0, data, 0, length);
	}

	private int[] mergeSort(int[] elements, int left, int right) {
		//Ende erreicht?`
		if (left == right) return new int[]{elements[left]};

		int middle = left + (right - left) / 2;
		int[] leftArray = mergeSort(elements, left, middle);
		int[] rightArray = mergeSort(elements, middle + 1, right);
		return merge(leftArray, rightArray);
	}

	int[] merge(int[] leftArray, int[] rightArray) {
		int leftLen = leftArray.length;
		int rightLen = rightArray.length;

		int[] target = new int[leftLen + rightLen];
		int targetPos = 0;
		int leftPos = 0;
		int rightPos = 0;

		// solange beide arrays elemente beinhalten
		while (leftPos < leftLen && rightPos < rightLen) {
			// Welches ist kleiner?
			int leftValue = leftArray[leftPos];
			int rightValue = rightArray[rightPos];
			if (leftValue <= rightValue) {
				target[targetPos++] = leftValue;
				leftPos++;
			} else {
				target[targetPos++] = rightValue;
				rightPos++;
			}
		}
		// restliches kopieren...
		while (leftPos < leftLen) {
			target[targetPos++] = leftArray[leftPos++];
		}
		while (rightPos < rightLen) {
			target[targetPos++] = rightArray[rightPos++];
		}
		return target;
	}
	}

