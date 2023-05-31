
public class LinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public void print(Node n) {
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public Node reverse(Node node) {
		Node current = node;
		Node next = null;
		Node prev = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		// list.print(head);
		head = list.reverse(head);
		list.print(head);
	}

}
