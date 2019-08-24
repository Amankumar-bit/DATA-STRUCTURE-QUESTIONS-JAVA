package lecture13;
import lecture13.dynamicstack;


	public class QUSEnqueueEfficient {
		private dynamicstack pstack;
		private dynamicstack sstack;

		public QUSEnqueueEfficient() throws Exception {
			this.pstack = new dynamicstack();
			this.sstack = new dynamicstack();
		}

		public int size() {
			return this.pstack.size();
		}

		public boolean isEmpty() {
			return this.pstack.size() == 0;
		}

		public void enqueue(int element) throws Exception {
			this.pstack.push(element);
		}

		public int dequeue() throws Exception {
			while (this.pstack.size() != 1) {
				this.sstack.push(this.pstack.pop());
			}
			int rv = this.pstack.pop();
			while (!this.sstack.isEmpty()) {
				this.pstack.push(this.sstack.pop());
			}
			return rv;
		}

		public int front() throws Exception {
			while (this.pstack.size() != 1) {
				this.sstack.push(this.pstack.pop());
			}
			int rv = this.pstack.top();
			while (!this.sstack.isEmpty()) {
				this.pstack.push(this.sstack.pop());
			}
			return rv;
		}

		public void display() throws Exception {
//			reverseStack(this.pstack, this.sstack, 0);
this.pstack.display();
//			reverseStack(this.pstack, this.sstack, 0);
		}

//		private static void reverseStack(dynamicstack stack, dynamicstack helper, int index) throws Exception {
//			if (stack.isEmpty()) {
//				return;
//			}
//			int element = stack.pop();
//			reverseStack(stack, helper, index + 1);
//			helper.push(element);
//			if (index == 0) {
//				while (!helper.isEmpty()) {
//					stack.push(helper.pop());
//				}
//			}
//		}

	}