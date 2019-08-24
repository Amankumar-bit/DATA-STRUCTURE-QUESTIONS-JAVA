package lecture14;

import lecture13.dynamicstack;

public class stackusingqueue {

	
	private dynamicqueue pqueue;
	private dynamicqueue squeue;

	public stackusingqueue() throws Exception {
		this.pqueue = new dynamicqueue();
		this.squeue = new dynamicqueue();
	}

	public int size() {
		return this.pqueue.size();
	}

	public boolean isEmpty() {
		return this.pqueue.size() == 0;
	}

	public void push(int element) throws Exception {
		this.pqueue.enqueue(element);
		
	}

	public int pop() throws Exception {
		int x=this.pqueue.front;
	while(x<=this.pqueue.size-1)
	{
		this.pqueue.front=this.pqueue.size()-x;
		this.squeue.enqueue(this.pqueue.dequeue());
	x++;
	}
	int rv=this.squeue.dequeue();
	int y=this.squeue.front;
	while(y<=this.squeue.size-2)
	{

		this.squeue.front=this.squeue.size()-y;
		this.pqueue.enqueue(this.squeue.dequeue());
		y++;
		
	}
	this.pqueue.front=0;
	return rv;
}
	
	public void display() throws Exception {
//		reverseStack(this.pstack, this.sstack, 0);
this.pqueue.display();
//		reverseStack(this.pstack, this.sstack, 0);
	}
	
	
	
	
	
	
	
	
}
