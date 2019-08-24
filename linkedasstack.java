package lecture14and15;

public class linkedasstack {
private linkedlist list;
	
	
	public linkedasstack() {
		this.list=new linkedlist();
	}
	
	
	public int size()
	{
		return this.list.size;
	}
	
	public boolean isEmpty() {
		return this.list.size==0;

	}
	
	public void push(int data)
	{
		this.list.addfirst(data);
	}
	public int  pop() throws Exception
	{
		int temp=this.list.getfirst();
		this.list.removefirst();
		return temp;
	}
	public int top() throws Exception {
      int temp =this.list.getfirst();	
      return temp;
	}
	public void display() {
		this.list.display();
	}
}
