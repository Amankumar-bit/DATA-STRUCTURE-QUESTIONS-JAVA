package lecture13;

public class stackpractice {

	public int data[];
	public int tos;

	public static final int capacity = 10;

	public stackpractice() throws Exception {
		this(capacity);

	}

	public stackpractice(int mycapacity) throws Exception {

		if (capacity < 1) {
			throw new Exception("invlaid capacity");
		}

		this.data = new int[mycapacity];
		this.tos = 1;
	}

	public void push(int item) throws Exception {
		if (this.data.length == size()) {
			throw new Exception("stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int size() {
		return this.tos + 1;
	}

	public int pop() throws Exception {
		if (size() == 0)

		{
			throw new Exception("stack is Empty");
		}
		int rv = this.data[tos];
		this.data[tos] = 0;
		this.tos--;
		return rv;
	}

	public int top() throws Exception {
		if (size() == 0)

		{
			throw new Exception("stack is Empty");
		}
		int rv = this.data[tos];

		return rv;
	}

	public Boolean isEmpty() {
		return this.size() == 0;

	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + ",");
		}
		System.out.println("END");
	}

}
