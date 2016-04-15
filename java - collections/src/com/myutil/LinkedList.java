package com.myutil;

public class LinkedList {

	private class Node {

		private Object data;
		private Node next;

		public Node(Object data) {
			super();
			this.data = data;
		}

		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	private Node head = null;

	public void add(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.head = newNode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public Object get(int idx) {
		Node temp = head;
		if (idx == 0) {
			return temp.getData();
		} else {
			int i = 0;
			while (temp.getNext() != null && i <= idx) {
				temp = temp.getNext();
				i++;
			}
			return temp.getData();
		}
	}

}
