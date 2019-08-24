package lecture17;

public class bstclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bst b=new bst();
		b.add(50);
		b.add(25);
		b.add(75);
		b.add(12);
		b.add(37);
		b.add(62);
		b.add(87);
		b.display();
		System.out.println();
		System.out.println("maximum---- "+b.max());
		System.out.println("minimum---- "+b.min());
		b.remove(50);
		b.display();
		
		
	}

}
