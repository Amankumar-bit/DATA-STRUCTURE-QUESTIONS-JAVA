package lecture22;

public class graphclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		graph g=new graph();
		
		g.addvertex("A");
		g.addvertex("B");
		g.addvertex("C");
		g.addvertex("D");
		g.addvertex("E");
		g.addvertex("F");
		g.addvertex("G");
		//g.addvertex("H");
		//g.addvertex("I");
	  g.addedge("A", "B", 10);
	  g.addedge("B", "C", 10);
	  g.addedge("C", "D", 10);
	  //g.addedge("A", "D", 10);
	  g.addedge("D", "E", 2);
	  g.addedge("E", "F", 3);
	  g.addedge("F", "G", 8);
	  g.addedge("G", "E", 5);
		g.display();
		System.out.println(g.haspathiterative("A","G"));
		
		
		
		
		
		
		
		
		
		
	}

}
