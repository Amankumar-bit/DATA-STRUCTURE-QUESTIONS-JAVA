package lecture16;

import java.util.Scanner;

public class binarytree {

	public class node {
		int data;
		node left;
		node right;

		node(int data, node left, node right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

	}

	private node root;
	private int size;

	public binarytree() {
		Scanner s = new Scanner(System.in);
		this.root = takeinput(s, null, false);
	}

	public node takeinput(Scanner s, node parent, boolean isleftorright) {
		// int count =0;
		if (parent == null) {
			System.out.println("ENTER THE ROOT ELEMENT:-");
		} else {
			if (isleftorright) {
				System.out.println("ENTER THE LEFT ELEMENT" + parent.data);

			} else {
				System.out.println("ENTER THE RIGHT ELEMENT" + parent.data);
			}

		}

		int data = s.nextInt();
		node m = new node(data, null, null);
		this.size++;

		System.out.println("IS there is left child");
		boolean n = s.nextBoolean();
		if (n == true) {

			m.left = takeinput(s, m, true);

		}
		System.out.println("IS there is right child");
		n = s.nextBoolean();
		if (n == true) {
			m.right = takeinput(s, m, false);
		}

		return m;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(node n) {
		if (n.left != null) {
			System.out.print(n.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(n.data);
		if (n.right != null) {
			System.out.print("<=" + n.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (n.left != null) {
			this.display(n.left);
		}

		if (n.right != null) {
			this.display(n.right);
		}

	}

	public int size2() {
		return size2(this.root);

	}

	private int size2(node n) {
		if (n == null) {
			return 0;
		}
		int lsize = this.size2(n.left);
		int rsize = this.size2(n.right);
		int mysize = lsize + rsize + 1;
		return mysize;

	}

	public int max() {
		return max(this.root);

	}

	private int max(node n) {
		if (n == null) {
			return 0;
		}
		int l = n.data;
		l = Math.max(l, max(n.right));
		l = Math.max(l, max(n.left));

		return l;

	}

	public void pre() {
		this.pre(this.root);
	}

	private void pre(node n) {
		if (n == null) {
			return;
		}

		// System.out.print(n.left.data);
		pre(n.left);
		pre(n.right);
		System.out.print(n.data + " ");
		// System.out.print(n.right.data);

	}

	public void level() {
		this.pre(this.root);
	}

	private void level(node n) {
		while (n != null) {
			System.out.println(n.left);
			// System.out.println(n.right);
		}

	}

	public boolean isbst() {

		return this.isbst(this.root, this.root.data, this.root.data);

	}

	private boolean isbst(node n, int m, int k) {
		boolean result;
		if (n.left == null || n.right == null) {
			return true;
		}
		if (n.left.data < m) {
			m = n.left.data;
			result = isbst(n.left, m, k);
		}
			if (n.right.data > k) {
				m = n.right.data;
				result = isbst(n.right, m, k);
				return true;
			}
				return false;

	}
}
