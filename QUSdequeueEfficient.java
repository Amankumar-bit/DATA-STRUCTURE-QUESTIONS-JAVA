package lecture13;
import lecture13.dynamicstack;
public class QUSdequeueEfficient {

	private dynamicstack mstack;
	private dynamicstack nstack;

	public QUSdequeueEfficient() throws Exception {
		this.mstack = new dynamicstack();
		this.nstack = new dynamicstack();
	}

	public int size() {
		return this.mstack.size();
	}

	public boolean isEmpty() {
		return this.mstack.size() == 0;
	}

	public void enqueue(int element) throws Exception {
		this.mstack.push(element);
	}

	public int dequeue() throws Exception {
		
	}

	public int front() throws Exception {
		
	}

	public void display() throws Exception {

this.mstack.display();

	}
}