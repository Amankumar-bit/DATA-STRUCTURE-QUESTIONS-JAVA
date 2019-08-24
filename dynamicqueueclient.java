package lecture14;

public class dynamicqueueclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		dynamicqueue queue = new dynamicqueue();
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i * 10);
		}

		queue.display();
		reverseQueue(queue);
		queue.display();


	}

	
	
	
	public static void reverseQueue(dynamicqueue queue) throws Exception {
	      if(queue.isEmpty()) {
	    	  return;
	      }
			int element=queue.dequeue();
			reverseQueue(queue);
			queue.enqueue(element);
		}

	}

