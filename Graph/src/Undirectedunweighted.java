import java.util.ArrayList;
import java.util.LinkedList;

public class Undirectedunweighted<T> {
	
	private ArrayList<T> vertexList;
	private int NumOfVertex;
	private LinkedList<T> [] AdjacentList;

	public Undirectedunweighted() {
		// TODO Auto-generated constructor stub
		this.NumOfVertex=0;
		this.vertexList= (ArrayList<T>) new ArrayList<T>();	
		this.AdjacentList=new LinkedList[10];
	}

	
	public Undirectedunweighted(int size) {
		this.NumOfVertex=size;
		this.vertexList=(ArrayList<T>) new ArrayList<T>();
		this.AdjacentList=new LinkedList[10];
		for(int i=0;i<this.NumOfVertex;i++)
		this.AdjacentList[i]=new LinkedList<T>();
	//	this.VertexMap= new HashMap<Vertex, LinkedList<Edge>>();
	}
	

	public LinkedList<T>[] getAdjacentList() {
		return AdjacentList;
	}

	public void setAdjacentList(LinkedList<T>[] adjacentList) {
		AdjacentList = adjacentList;
	}
	
	
	public void addVertex(T token)
	{
		if(!this.vertexList.contains(token))///if v is not in the vertexlist
		{
			try {
				
			this.vertexList.add(token);
			this.NumOfVertex++;
			int i=this.vertexList.indexOf(token);
			this.AdjacentList[i]=new LinkedList<T>();
			}
			catch(Exception ex)
			{
				
			}
		}
		else 
			return;
		
	}
	public void addEdge(T source,T destination) {
		
		this.addVertex(source);///if from is not in the vertexlist
		
		this.addVertex(destination);///if to is not in the vertexlist
				
		int indexFrom=this.vertexList.indexOf(source);
		this.AdjacentList[indexFrom].add( destination); //adding the new edge to the end of list
		
		int indexTo=this.vertexList.indexOf(destination);
		   this.AdjacentList[indexTo].add( source); //add new edge to both lists
	}
	
	public void getEdges(T vertex)
	{
		int index=this.vertexList.indexOf(vertex);
		 System.out.print("[");
         for(T v: this.AdjacentList[index]){ 
             System.out.print("("+v +") ,"); 
         } 
         System.out.print("]");
		
	}

	
	public void getVertices() 
	{
		if(this.NumOfVertex==0)
			System.out.print("This Graph doesn't have any vertex yet."+"\n");
		else {
			System.out.print("Vertices List"+"\n");
		for(int i=0;i<this.NumOfVertex;i++)
			System.out.println(this.vertexList.get(i));
			System.out.print("\n");
		}
		
	}
	public void printGraph() 
    {  
		if(this.NumOfVertex==0)
			System.out.print("Graph is empty"+"\n");
        for(int v = 0; v < this.NumOfVertex; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ this.vertexList.get(v)); 
            System.out.print("head"); 
            System.out.print("[");
            for(T ver: this.AdjacentList[v]){ 
                System.out.print("("+ver+","+") ,"); 
            } 
            System.out.print("]");
            System.out.println("\n"); 
        } 
    } 
}
