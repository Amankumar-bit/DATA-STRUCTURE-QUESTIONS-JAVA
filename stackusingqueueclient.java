package lecture14;


public class stackusingqueueclient {

	public static void main(String[] args) throws Exception {
		
		
		
		stackusingqueue stack = new stackusingqueue();
		stack.push(1);
		stack.push(10);stack.push(20);stack.push(30);stack.push(40);stack.push(50);
	stack.display();
		//System.out.println(queue.front());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
		stack.display();

	}

}
