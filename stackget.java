package lecture13;

public class stackget {

	public static void main(String[] args) throws Exception {

		stackpractice s = new stackpractice(5);
		int i;
		for (i = 1; i <= 10; i++) {
			s.push(10 * i);
			s.display();
		}
		System.out.println("***********************************push");
//for( i=1;i<=5;i++)
//{
//	System.out.println(s.pop());
//	s.display();
//}

		System.out.println("***********************************pop");
		for (i = 1; i <= 5; i++) {
			System.out.println(s.top());
			// s.display();
		}
		System.out.println("***********************************top");

	}

}
