package lecture13;

public class dynamicstackclient {

	public static void main  (String[] args) throws Exception{
		// TODO Auto-generated method stub

		

		dynamicstack s = new dynamicstack(5);
		dynamicstack helper = new dynamicstack(5);
		int i;
		for (i = 2; i <=3; i++) {
			s.push(10 * i);
			s.display();
		}
		System.out.println("***********************************push");
//for( i=1;i<=5;i++)
//{
//	System.out.println(s.pop());
//	s.display();
//}
//
//		System.out.println("***********************************pop");
//		for (i = 1; i <= 5; i++) {
//			System.out.println(s.topi());
//			// s.display();
//		}
//		System.out.println("***********************************top");

		//reverse(s,helper);
//		System.out.println("*************hello**********************");
//		s.display();
		
		
		
		
	}

	
//	public static void reverse (dynamicstack s,dynamicstack helper) throws Exception
//	{
//		for(int i=4;i>=-1;i--)
//		{
//			helper.data[i]=s.data[i];
//			s.pop();
//		
//			
//		}
//		for(int k=;k<s.data.length;k++)
//		{
//			s.data[k]=helper.data[helper.data.length-k];
//		}
//	}
}
