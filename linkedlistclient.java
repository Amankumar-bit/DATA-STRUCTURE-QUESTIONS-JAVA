package lecture14and15;

public class linkedlistclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		linkedlist ll=new linkedlist();
		
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
		ll.addfirst(50);
		ll.addlast(60);
	ll.addlast(70);
//	ll.addlast(60);
		
		ll.display();
	//System.out.println(ll.removelast());
		ll.display();
//	ll.addlast(70);
//	ll.display();
//	System.out.println(ll.removeat(2));
//	ll.display();
//	ll.addlast(80);
//ll.display();
		ll.mid();
		
	//ll.reverse();
	ll.display();
	

	ll.createcycle();
	System.out.println(ll.cycle());
}
}