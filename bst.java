package lecture17;

import java.util.Scanner;

import lecture16.binarytree.node;

public class bst {

	private class node {
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

	public bst() {

		this.root = null;
		this.size = 0;
	}

	private void add(int data, node n1) {

		node m = new node(data, null, null);

		if (data < n1.data) {
			if (n1.left == null) {
				n1.left = m;

			} else {
				n1 = n1.left;
				add(data, n1);
			}
		} else if (data > n1.data) {
			if (n1.right == null) {
				n1.right = m;
			} else {
				n1 = n1.right;
				add(data, n1);
			}
		}

	}

	public int max() {
		return this.max(this.root);
	}

	private int max(node n) {
		int c;
		if (n.right == null) {
			return n.data;
		}

		c = max(n.right);

		return c;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(node n) {
		int c;
		if (n.left == null) {
			return n.data;
		}

		c = min(n.left);

		return c;
	}

	public void remove(int data) {
		
		if(this.root.data==data)
		{
		int c=max(this.root.left);
		remove(this.root,c);
		System.out.println(c);
		this.root.data=c;
		return;
		}
		this.remove(this.root, data);

	}

	private node remove(node n, int data) {
		if (n.data == data) {
			if (n.left == null&&n.right==null) {
				
					n.left = null;
					return null;
				
			}

	
		} else if (n.data > data) {
		n.right=	remove(n.right, data);
		} else if (n.data < data) {
		n.left=	remove(n.left, data);
		}
	}

	public void add(int data) {
		if (root == null) {
			node my = new node(data, null, null);
			this.root = my;

		}

		this.add(data, this.root);
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

}
