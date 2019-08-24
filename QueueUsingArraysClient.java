package lecture14;


		
		public class QueueUsingArraysClient {

			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				QueueUsingArrays queue = new QueueUsingArrays(5);
				for (int i = 1; i <= 5; i++) {
					queue.enqueue((i * 10));
					displayQueueInfo(queue);
				}

				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				displayQueueInfo(queue);
				queue.enqueue(60);
				queue.enqueue(70);
				displayQueueInfo(queue);
				//queue.enqueue(80);
				// stack.push(60);
				while (!queue.isEmpty()) {
					displayQueueInfo(queue);
					queue.dequeue();
				}
				System.out.println(queue.isEmpty());

				//queue.dequeue();
			}

			public static void displayQueueInfo(QueueUsingArrays queue) throws Exception {
				System.out.println("***********************");
				queue.display();
				System.out.println("Size " + queue.size());
				System.out.println("Front " + queue.front());
			}

		}
	


