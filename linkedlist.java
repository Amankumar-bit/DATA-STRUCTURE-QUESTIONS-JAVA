package lecture14and15;

public class linkedlist {

	private class node {

		int data;
		node next;

		node(int data, node next) {
			this.data = data;
			this.next = next;

		}
	}

	node head;
	node tail;
	int size;

	linkedlist() {
		this.head = null;
		this.tail = null;
		this.size = 0;

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void addfirst(int data) {
		node n1 = new node(data, this.head);
		if (isEmpty()) {
			this.head = n1;
			this.tail = n1;
		} else {

			this.head = n1;

		}
		this.size++;

	}

	public void addlast(int data) {
		node n1 = new node(data, null);
		if (isEmpty()) {
			this.head = n1;
			this.tail = n1;
		} else {
			this.tail.next = n1;
			this.tail = n1;

		}

		this.size++;
	}

	public node getnodeat(int index) throws Exception {
		int count = 0;
		node temp = head;
		if (isEmpty()) {
			temp = head;
		} else if (count == this.size - 1) {
			temp = tail;
		} else {
			while (count < index) {
				temp = temp.next;
				count++;
			}
		}
		return temp;
	}

	public void addat(int data, int index) throws Exception {

		node n1 = getnodeat(index - 1);
		node temp = new node(data, null);
		if (index == 0) {
			this.addfirst(data);
		}
		if (index == this.size) {
			this.addlast(data);
		} else {
			temp.next = n1.next;
			n1.next = temp;
		}
		this.size++;
	}

	public int removefirst() {
		int rv = this.head.data;
		head = head.next;
		this.size--;
		return rv;

	}

	public int removelast() throws Exception

	{
		int rv = this.tail.data;
		node temp = getnodeat(this.size - 2);
		this.tail = temp;
		temp.next = null;

		this.size--;
		return rv;
	}

	public int removeat(int index) throws Exception {

		node temp = getnodeat(index);
		node n1 = getnodeat(index - 1);

		int rv = temp.data;
		n1.next = temp.next;
		size--;
		return rv;

	}

	public int getfirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("ghnata khali he puraa");
		} else
			return this.head.data;
	}

	public int getlast() throws Exception {
		if (isEmpty()) {
			throw new Exception("phir se kat gya tera");
		} else
			return this.tail.data;
	}

	public int getat(int index) throws Exception {
		node temp = getnodeat(index);
		return temp.data;

	}

	public void display() {
		node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reverse() throws Exception {
		int start = 0;
		int end = this.size - 1;
		;

		while (start <= end) {
			node t = getnodeat(start);
			node m = getnodeat(end);
			int temp = t.data;
			t.data = m.data;
			m.data = temp;

			start++;
			end--;
		}

	}

	public void reversei() {
		node start = this.head;
		node end = this.tail;
		int count = 0;
		while (count < (this.size) / 2) {
			node temp = end;

		}

	}

	public void mid() {
		node first = this.head;
		node second = this.head.next;
		while (second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
		}
		System.out.println(" mid is:-" + first.data);
	}

	public void createcycle() throws Exception {
		node temp = this.getnodeat(6);
		this.tail.next = temp;
	}

	public boolean cycle() {
		node first = this.head;
		while (first != null) {
			if (tail.next == first) {
				return true;

			}
			first = first.next;
		}
		return false;
	}
}
