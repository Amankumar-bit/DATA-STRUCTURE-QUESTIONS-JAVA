package lecture13;

public class dynamicstack extends stackpractice {

	public dynamicstack() throws Exception {
		this(capacity);
	}

	public dynamicstack(int mycapacity) throws Exception {
		super(capacity);
	}

	public void push(int element) throws Exception {
		if (this.data.length == this.size()) {
			int[] arr = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				arr[i] = this.data[i];
			}
			data = arr;
		}
		super.push(element);

	}

}
