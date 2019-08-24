package lecture14and15;

public class linkedasstackclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		linkedasstack s=new linkedasstack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		System.out.println(s.top());
		
		
		
	s.push(90);s.push(80);s.push(70);
	s.display();
	}
}
