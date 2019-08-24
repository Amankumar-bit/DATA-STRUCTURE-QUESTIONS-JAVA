package lecture22;

import java.util.*;

public class graph {

	private class vertex {
		String name;
		 HashMap<vertex, Integer> nbrs;

		vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public void display() {
			String osf = this.name + "=>";
			Set<vertex> nbrs = this.nbrs.keySet();
			for (vertex nbr : nbrs) {
				osf = osf + nbr.name+"("+this.nbrs.get(nbr)+"),";
				
			}
			osf=osf+"END";
			System.out.println(osf);
		}
	}

	HashMap<String, vertex> vtces;
	int numvtces;

	public graph() {
		this.vtces = new HashMap<>();
		this.numvtces = 0;

	}

	public int numvtces() {
		return this.vtces.size();
	}

	public void addvertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}
		vertex vtx = new vertex(name);
		this.vtces.put(name, vtx);

	}
	
	public void removevertex(String name)
	{
		if(!this.vtces.containsKey(name))
		{
			return;
		}
		vertex rvtx=this.vtces.get(name);
		Set<vertex>nbrs=rvtx.nbrs.keySet();
		for(vertex nbr:nbrs)
		{
			nbr.nbrs.remove(rvtx);
		}
	this.vtces.remove(name);	
	}

	public int numedges()
	{
		Collection<vertex>  allvertices=this.vtces.values();
		int rv=0;
		for( vertex onevtx:allvertices)
		{
			rv=rv+onevtx.nbrs.size();
			
		}
		rv=rv/2;
		return rv;
	}
	
	public void addedge(String name1,String name2,int cost)
	{
		vertex vtx1=this.vtces.get(name1);
		vertex vtx2=this.vtces.get(name2);
	if(vtx1==null||vtx2==null||vtx1.nbrs.containsKey(vtx2))
	{
		return;
	}
	vtx1.nbrs.put(vtx2,cost);
	vtx2.nbrs.put(vtx1,cost);
	
	}
	
	
	public void removedge(String name1,String name2)
	{
		vertex vtx1=this.vtces.get(name1);
		vertex vtx2=this.vtces.get(name2);
	if(vtx1==null||vtx2==null||!vtx1.nbrs.containsKey(vtx2))
	{
		return;
	}
	vtx1.nbrs.remove(vtx2);
	vtx2.nbrs.remove(vtx1);
	
	}
	
	
	public void display()
	{
		Collection<vertex> allvtces=this.vtces.values();
		for(vertex onevtx:allvtces)
		{
			onevtx.display();
		}
		System.out.println("****************************8");
	}
	
	
	
	public boolean haspathiterative(String v1,String v2)
	{ 
		vertex vtx1=new vertex(v1);	
		vertex vtx2=new vertex(v2);	
		HashMap<vertex,Boolean> explored =new HashMap<>();
		
return haspathiterative(vtx1,vtx2,explored);		
	}
	private boolean haspathiterative(vertex vtx1,vertex vtx2,HashMap<vertex,Boolean> explored )
	{
		LinkedList<vertex> queue =new LinkedList<>();
		queue.add(vtx1);
		while(!queue.isEmpty())
		{
			vertex rv=queue.remove();
			if(!explored.containsKey(rv))
			{
				explored.put(rv,true);
				if(rv.nbrs.containsKey(vtx2))
				{
					return true;
				}
				
				
				
				else
				{
					Set<vertex> nbrs=rv.nbrs.keySet();
					for(vertex nbr:nbrs)
					{
						if(!explored.containsKey(nbr))
						{
							queue.add(nbr);
						}
					}
				}
			}
		}
		
		return false;
		}
	

public void dijkstra (String source)
{
	int [] dis =new int [this.vtces.size()];
	for(int i=0;i<dis.length;i++)
	{
		dis[i]=Integer.MAX_VALUE;
		
	}
	vertex v=this.vtces.get(source);
	dis[source.charAt(0)-65]=0;
	Queue<String> queue=new LinkedList<>();
	queue.add(source);
	while(!queue.isEmpty())
	{
		String str=queue.remove();
		vertex vtx=this.vtces.get(str);
		Set<vertex> nbrs =vtx.nbrs.keySet();
		for(vertex nbr:nbrs)
		{
			int oldcost=dis[nbr.name.charAt(0)-65];
			int newcost=dis[vtx.name.charAt(0)-65]+vtx.nbrs.get(nbr);
			if(newcost<oldcost)
			{
				dis[nbr.nmaecharAt[(0)-65]=newcost;
				queue.add(nbr.name);
				}
			
		}
	}
	for(int i=0;i<dis.length;i++)
	{
		System.out.println(dis[i]+" ");
		
	}
	System.out.println();
}

}
